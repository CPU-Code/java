package com.cpucode.java.test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.joda.time.DateTime;

import javax.imageio.ImageIO;
import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.ResolutionSyntax;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.PrinterResolution;
import javax.print.attribute.standard.Sides;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterJob;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
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
    public static void main(String[] args) throws PrintException, IOException, WriterException {
        GUI();
    }

    /**
     * 下载二维码
     * @throws IOException
     */
    public static String download(String urlString) throws IOException {
        String timeUrl = new DateTime().toString("yyyy/MM/dd");

        String savePath = "D:\\" + timeUrl;

        InputStream is = null;
        OutputStream os = null;
        File sf = null;
        String JPEGName = null;

        try {
            // 构造URL
            URL url = new URL(urlString);
            // 打开连接
            URLConnection con = url.openConnection();
            //设置请求超时为5s
            con.setConnectTimeout(5 * 1000);
            // 输入流
            is = con.getInputStream();

            // 1K的数据缓冲
            byte[] bs = new byte[1024];
            // 读取到的数据长度
            int len;
            // 输出的文件流
            sf = new File(savePath);
            if(!sf.exists()){
                sf.mkdirs();
            }
            // https://alicliimg.clewm.net/weapp/2021/07/29/e9bcd9b21c57c4158b9a9e798ffcc37a1627528431.jpeg

            // 获取图片的扩展名
            // String extensionName = urlString.substring(urlString.lastIndexOf(".") + 1);

            // 新的图片文件名 = 编号 +"."图片扩展名
            JPEGName = urlString.substring(urlString.lastIndexOf("/") + 1);

            os = new FileOutputStream(sf.getPath() + "\\" + JPEGName);

            // 开始读取
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 完毕，关闭所有链接
            os.close();
            is.close();

            return (sf.getPath() + "\\" + JPEGName);
        }
    }


    /**
     * 获取接口数据,返回json格式字符串
     * @param mid 机器id
     * @return json数据
     */
    public static String getData(String mid){
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
        }finally {
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
     * 打印流程
     */
    public static String process(String mid){
        // 获取请求数据
        String data = null;
        String res = "成功生成";
        boolean state = false;

        try {
            for (int i = 0; i < 10; i++) {
                data = getData(mid);
                state = checkData(data);
                if (state){
                    break;
                }
                System.out.println(data);
            }

            if (!state){
                res = "网络异常, 请重新生成";
                return res;
            }

            System.out.println(data);

            String replace = getURL(data);

            if (replace.isEmpty()){
                res = "生成字符串为空, 请重新生成";
                return res;
            }

            String download = download(replace);
            String qRcode = getQRcode(mid);

            //JPGPrint(download);
            //JPGPrint(qRcode);

            res = res + " : \n" + download + "\n"+ qRcode;
        } catch (Exception ex) {
            ex.printStackTrace();
            res = "错误异常 , 请重新生成";
        }


        return res;
    }

    /**
     * 界面
     * @throws PrintException
     */
    public static void GUI() {
        int gap = 10;
        JFrame f = new JFrame("小程序二维码打印");
        f.setSize(500, 500);
        f.setLocation(200, 200);
        f.setLayout(null);

        JPanel pInput = new JPanel();
        pInput.setBounds(gap, gap, 450, 200);
        pInput.setLayout(new GridLayout(4,3, gap, gap));

        // 二维码输入
        JLabel location = new JLabel("机器二维码:");
        JTextField midTest = new JTextField();

        // 纸张输入
//        JLabel Paper  = new JLabel("纸张大小:");
//        JTextField PaperX = new JTextField("纸张宽");
//        JTextField PaperY = new JTextField();

        pInput.add(location);
        pInput.add(midTest);
//        pInput.add(Paper);
//        pInput.add(PaperX);
//        pInput.add(PaperY);

        // 按钮
        JButton b = new JButton("生成");
        b.setBounds(180, 120 + 30, 80, 30);

        //文本域
        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setBounds(gap, 150 + 60, 450, 150);

        f.add(pInput);
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
    }


    /**
     * 检查 data 的状态
     * @param data
     * @return
     * @throws Exception
     */
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
     * 提取 url
     * @param data
     */
    public static String getURL(String data) throws Exception {
        int https = data.indexOf("https");
        int jpeg = data.lastIndexOf("\"");

        if (https == -1 || jpeg == -1){
            throw new Exception("无https");
        }

        String substring = data.substring(https, jpeg);

        return substring;
    }


    /**
     * 打印
     * @param filename
     * @throws PrintException
     */
    public static void JPGPrint(String filename) throws PrintException {
        int x = 70;
        int y = 535 / 470 * x;
        File file = new File(filename);

        //打印机名包含字串
        String printerName = "HP90D3C3 (HP LaserJet Pro M329)";

        if (file == null) {
            System.err.println("缺少打印文件");
        }

        InputStream fis = null;

        // 定位打印服务
        PrintService printService = null;

        if (printerName != null) {
            //获得本台电脑连接的所有打印机
            PrintService[] printServices = PrinterJob.lookupPrintServices();

            if (printServices == null || printServices.length == 0) {
                System.out.print("打印失败，未找到可用打印机，请检查。");
                return;
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
                System.out.print("打印失败，未找到名称为" + printerName + "的打印机，请检查。");
                return;
            }
        }

        try {

            // 设置打印格式，如果未确定类型，可选择autosense
            // DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;
            DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;

            // 设置打印参数
            PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
            PrinterResolution pr = new PrinterResolution(x, y, ResolutionSyntax.DPI);

            //份数
            aset.add(new Copies(1));
            //纸张
            aset.add(pr);

            // aset.add(Finishings.STAPLE);//装订

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
    public static String getQRcode(String content) throws WriterException {
        String timeUrl = new DateTime().toString("yyyy/MM/dd");
        String savePath = "D:\\" + timeUrl;

        // 二维码尺寸
        int QRCODE_SIZE = 300;

        HashMap hints = new HashMap<>();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hints.put(EncodeHintType.MARGIN, 1);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
                                                             BarcodeFormat.QR_CODE,
                                                             QRCODE_SIZE,
                                                             QRCODE_SIZE, hints);
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF);
            }
        }

        // 输出的文件流
        File sf = new File(savePath);
        if(!sf.exists()){
            sf.mkdirs();
        }

        String random = random();

        savePath = savePath + "\\" + random + ".jpeg";

        try {
            ImageIO.write(image, "JPEG", new File(savePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return savePath;
    }

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

}
