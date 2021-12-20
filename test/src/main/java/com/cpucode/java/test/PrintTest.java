package com.cpucode.java.test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.joda.time.DateTime;

import javax.imageio.ImageIO;
import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.Sides;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterJob;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Random;

/**
 * @author : cpucode
 * @date : 2021/7/28
 * @time : 16:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PrintTest {
    //打印机名包含字串
    volatile static String printerName = null;

    public static void main(String[] args) {
        GUI();
    }

    public static String GetUrlS(String appid, String secret) throws Exception{
        HttpGet httpGet = new HttpGet(
                "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
                        + appid + "&secret=" + secret );
        HttpClient httpClient = HttpClients.createDefault();
        HttpResponse res = null;
        String access_token = null;

        try {
            res = httpClient.execute(httpGet);

            HttpEntity entity = res.getEntity();
            String result = EntityUtils.toString(entity, "UTF-8");
            JSONObject jsons = JSONObject.fromObject(result);
            String expires_in = jsons.getString("expires_in");


            //缓存
            if(Integer.parseInt(expires_in)==7200){
                //ok
                access_token = jsons.getString("access_token");
                // System.out.println("access_token:" + access_token);
            }else{
                System.out.println("出错获取token失败！");
                throw new IOException("出错获取token失败！");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("出错获取token失败！");
        }

        return access_token;
    }

    /**
     * 打印流程
     */
    public static String process(String mid){
        // 获取请求数据
        String res = "成功生成";

        try {
            String download = download(mid);

            String qRcode = getQRcode(mid);

            JPGPrint(download);
            JPGPrint(qRcode);

            res = res + " : \n" + download + "\n"+ qRcode;
        } catch (Exception ex) {
            ex.printStackTrace();
            res = ex.getMessage();
        }

        return res;
    }

    /**
     * 界面
     * @throws PrintException
     */
    public static void GUI() {
        int gap = 10;
        JFrame f = new JFrame("小程序二维码打印 -- 中净生物流弊");
        f.setSize(500, 450);
        f.setLocation(200, 200);
        f.setLayout(null);

        // 输入框
        JPanel pInput = new JPanel();
        pInput.setBounds(gap, gap, 450, 75);
        pInput.setLayout(new GridLayout(2,2, gap, gap));

        // 二维码输入
        JLabel location = new JLabel("机器二维码:");
        JTextField midTest = new JTextField();

        pInput.add(location);
        pInput.add(midTest);

        // 下拉框
        Container container = new Container();
        container.setBounds(10, 100, 450, 75);
        container.setLayout(new GridLayout(2,2, gap, gap));

        JLabel text = new JLabel("打印机:");
        JComboBox status = new JComboBox();
        status.addItem(null);

        //获得本台电脑连接的所有打印机
        PrintService[] printServices = PrinterJob.lookupPrintServices();
        //匹配指定打印机
        for (int i = 0; i < printServices.length; i++) {
            status.addItem(printServices[i].getName());
        }

        // 加入到界面中
        container.add(text);
        container.add(status);

        // 按钮
        JButton b = new JButton("生成");
        b.setBounds(160, 190, 150, 50);

        //文本域
        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setBounds(gap, 250, 450, 100);

        // 加入到总幕布
        f.add(pInput);
        f.add(container);
        f.add(b);
        f.add(ta);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        //鼠标监听
        b.addActionListener(new ActionListener(){
            boolean checkedpass = true;

            @Override
            public void actionPerformed(ActionEvent e){
                checkedpass = true;
                // 校验机器id是否为空
                checkEmpty(midTest,"机器二维码");

                String mid = midTest.getText();

                if(checkedpass){
                    String process = process(mid);

                    // 成功清除输入框
                    if (process.charAt(0) == '成'){
                        midTest.setText("");
                    }

                    ta.setText("");
                    ta.append(process);
                }
            }

            /**
             * 检验是否为空
             * @param tf
             * @param msg
             */
            private void checkEmpty(JTextField tf, String msg){
                if(!checkedpass){
                    return;
                }

                String value = tf.getText();
                if(value.length() == 0){
                    JOptionPane.showMessageDialog(f, msg + " 不能为空");
                    tf.grabFocus();
                    checkedpass = false;
                }
            }
        });

        // 下拉框事件
        status.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                //处理事件的函数
                printerName = (String) e.getItem();
            }
        });
    }

    /**
     * 打印
     * @param filename
     * @throws PrintException
     */
    public static void JPGPrint(String filename) throws Exception {
        int x = 1000;
        int y = 1000;
        File file = new File(filename);

        if (file == null) {
            throw new Exception("缺少打印文件");
        }

        InputStream fis = null;

        // 定位打印服务
        PrintService printService = null;

        if (printerName != null) {
            //获得本台电脑连接的所有打印机
            PrintService[] printServices = PrinterJob.lookupPrintServices();

            if (printServices == null || printServices.length == 0) {
                throw new Exception("打印失败，未找到可用打印机，请检查");
            }

            //匹配指定打印机
            for (int i = 0; i < printServices.length; i++) {
                System.out.println(printServices[i].getName());

                if (printServices[i].getName().contains(printerName)) {
                    printService = printServices[i];
                    break;
                }
            }

            if (printService == null) {
                throw new Exception("打印失败，未找到名称为" + printerName + "的打印机，请检查");
            }
        }

        try {
            // 设置打印格式，如果未确定类型，可选择autosense
            // DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;
            DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;

            // 设置打印参数
            PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();

            MediaPrintableArea area = new MediaPrintableArea(0, 0, x, y, MediaPrintableArea.MM);
            aset.add(area);

            //份数
            aset.add(new Copies(1));

            //单双面
            aset.add(Sides.DUPLEX);

            // 构造待打印的文件流
            fis = new FileInputStream(file);
            Doc doc = new SimpleDoc(fis, flavor, null);

            // 创建打印作业
            DocPrintJob job = printService.createPrintJob();
            job.print(doc, aset);

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
            throw new Exception("打印错误");
        } finally {
            // 关闭打印的文件流
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 二维码生成
     * @param content
     * @throws WriterException
     */
    public static String getQRcode(String content) throws Exception {
        String timeUrl = new DateTime().toString("yyyy/MM/dd");
        String savePath = "D:\\" + timeUrl;
        String productName = content;

        // 二维码尺寸
        int QRCODE_SIZE = 400;

        HashMap hints = new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hints.put(EncodeHintType.MARGIN, 1);

        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
                                                                 BarcodeFormat.QR_CODE,
                                                                 QRCODE_SIZE,
                                                                 QRCODE_SIZE + 50, hints);
            int width = bitMatrix.getWidth();
            int height = bitMatrix.getHeight();
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
                }
            }

             //得到画笔对象
            Graphics g = image.getGraphics();

            //10,20 表示这段文字在图片上的位置(x,y) .第一个是你设置的内容。救援码
            //画文字到新的面板
            g.setColor(Color.BLACK);

            //字体、字型、字号
            g.setFont(new Font("宋体", Font.BOLD,40));

            int strWidth = g.getFontMetrics().stringWidth(productName);

            g.drawString(productName, 200 - (strWidth >> 1), QRCODE_SIZE + 40);

            // 输出的文件流
            File sf = new File(savePath);
            if(!sf.exists()){
                sf.mkdirs();
            }

            String random = random();

            savePath = savePath + "\\" + random + ".jpeg";

            image.flush();
            ImageIO.write(image, "JPEG", new File(savePath));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("生成机器二维码错误");
        }

        return savePath;
    }

    /**
     * 随机生成字符串
     * @return
     */
    public static String random(){
        /**
         *  随机字符串
         */
        String INT_TEMP = "0123456789";
        String STR_TEMP = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String ALL_TEMP = INT_TEMP + STR_TEMP;
        Random RANDOM = new Random();
        int count = 20;

        char[] buffer = new char[count];
        for (int i = 0; i < count; i++) {
            buffer[i] = ALL_TEMP.charAt(RANDOM.nextInt(ALL_TEMP.length()));
        }

        return new String(buffer);
    }


    /**
     * 检查 data 的状态
     * @param data
     * @return
     * @throws Exception
     */
    @Deprecated
    private static boolean checkData(String data) throws Exception {
        char c = data.charAt(10);

        if (c == '0'){
            return false;
        } else if(c == '1'){
            return true;
        } else {
            throw new Exception("状态错误");
        }
    }


    /**
     * 获取接口数据,返回json格式字符串
     * @param mid 机器id
     * @return json数据
     */
    @Deprecated
    public static String getData(String mid) throws Exception {
        OutputStreamWriter out = null ;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();

        String url = "https://cli.im/Home/Weapp/create";
        String id = "&weapp_id=" + "wx23413865ff01d830";
        String secret = "&weapp_secret=" + "31e5c61391f3a198ebb58322de0b5c06";
        String app_url = "&weapp_url=" + "pages/index/index?mid=" + mid;

        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();

            //设置通用的请求头属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

            // 发送POST请求必须设置如下两行 否则会抛异常
            // （java.net.ProtocolException: cannot write to a URLConnection
            // if doOutput=false - call setDoOutput(true)）
            conn.setDoOutput(true);
            conn.setDoInput(true);

            //获取URLConnection对象对应的输出流并开始发送参数
            out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");

            //添加参数
            out.write(id);
            out.write(secret);
            out.write(app_url);

            // 建立实际的连接
            out.flush();

            in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));

            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("网络错误");
        } finally {
            // 使用finally块来关闭输出流、输入流
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        String name = result.toString().replace("\\" , "");

        return name;
    }

    /**
     * 提取 url
     * @param data
     */
    @Deprecated
    public static String getURL(String data) throws Exception {
        int https = data.indexOf("https");
        int jpeg = data.lastIndexOf("\"");

        if (https == -1 || jpeg == -1){
            throw new Exception("无https");
        }

        String substring = data.substring(https, jpeg);

        if (substring.isEmpty()){
            throw new Exception("生成字符串为空, 请重新生成");
        }

        return substring;
    }

    /**
     * 下载二维码
     * @throws IOException
     */
    public static String download(String mid) throws Exception{
        String token = "";
        OutputStream os = null;
        File sf = null;
        BufferedInputStream bis = null;
        String imagePath = null;

        try {
            token = GetUrlS("wx23413865ff01d830", "31e5c61391f3a198ebb58322de0b5c06");
            URL url = new URL("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token=" + token);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");// 提交模式

            // 发送POST请求必须设置如下两行
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            // 发送请求参数
            JSONObject paramJson = new JSONObject();
            paramJson.put("scene", mid);
            paramJson.put("page", "pages/index/index");
            paramJson.put("width", 400);
            paramJson.put("auto_color", true);

            printWriter.write(paramJson.toString());
            // flush输出流的缓冲
            printWriter.flush();
            //开始获取数据
            bis = new BufferedInputStream(httpURLConnection.getInputStream());

            String timeUrl = new DateTime().toString("yyyy/MM/dd");

            String savePath = "D:\\" + timeUrl;

            // 1K 的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流
            sf = new File(savePath);
            if(!sf.exists()){
                sf.mkdirs();
            }

            imagePath = sf.getPath() + "\\" + token + ".jpeg";

            os = new FileOutputStream(imagePath);

            // 开始读取
            while ((len = bis.read(bs)) != -1) {
                os.write(bs, 0, len);
            }

            BufferedImage image = ImageIO.read(new File(imagePath));

            BufferedImage outImage = new BufferedImage(400, 450, BufferedImage.TYPE_INT_RGB);

            //得到画笔对象
            Graphics2D outg = outImage.createGraphics();
            outg.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);

            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = image.getHeight(); y < outImage.getHeight(); y++) {
                    outImage.setRGB(x, y, 0xFFFFFFFF);
                }
            }

            //10,20 表示这段文字在图片上的位置(x,y) .第一个是你设置的内容。救援码
            //画文字到新的面板
            outg.setColor(Color.BLACK);
            //字体、字型、字号
            outg.setFont(new Font("宋体", Font.PLAIN, 40));

            int strWidth = outg.getFontMetrics().stringWidth(mid);
            outg.drawString(mid, 200 - (strWidth >> 1), 400 + 40);

            outg.dispose();
            outImage.flush();
            image = outImage;
            image.flush();

            ImageIO.write(image, "JPEG", new File(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("下载二维码错误");
        } finally {
            // 完毕，关闭所有链接
            if (bis != null) {
                bis.close();
            }

            if (os != null) {
                os.close();
            }

        }

        return imagePath;
    }
}
