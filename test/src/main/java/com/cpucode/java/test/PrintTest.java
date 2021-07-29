package com.cpucode.java.test;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.Sides;
import java.awt.print.PrinterJob;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author : cpucode
 * @date : 2021/7/28
 * @time : 16:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PrintTest {
    public static void main(String[] args) throws PrintException, IOException {
        GUI();
    }

    /**
     * 下载二维码
     * @throws IOException
     */
    public static String download(String urlString) throws IOException {
        //String filename = "64c5522fea65271d17ee179c948493261627520803.jpeg";
        String savePath = "C:\\Users\\cpucode\\Desktop";

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
        pInput.setBounds(gap, gap, 450, 150);
        pInput.setLayout(new GridLayout(4,3, gap, gap));


        JLabel location = new JLabel("机器二维码:");
        JTextField locationText = new JTextField();

        JButton b = new JButton("生成");

        pInput.add(location);
        pInput.add(locationText);

        //文本域
        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);

        b.setBounds(180, 120 + 30, 80, 30);
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
                checkEmpty(locationText,"机器二维码");

                String mid = locationText.getText();

                if(checkedpass){
                    // 获取请求数据
                    String data = getData(mid);

                    try {
                        if (!checkData(data)){
                            data = "错误 , 请重新生成";
                            return;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    String replace = Replace(data);
                    String download = null;

                    try {
                        if (!replace.isEmpty()){
                            download = download(replace);

                            System.out.println(download);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    try {
                        JPGPrint(download);
                    } catch (PrintException ex) {
                        ex.printStackTrace();
                    }

                    String model = "%s";
                    String result = String.format(model, replace);

                    ta.setText("");
                    ta.append(result);
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
    public static String Replace(String data){
        int https = data.indexOf("https");
        int jpeg = data.lastIndexOf("\"");
        if (https == -1 || https == -1){
            return "";
        }

        String substring = data.substring(https, jpeg);

        return substring;
    }


    /**
     * 传入文件和打印机名称
     * @param file
     * @param printerName 打印机名
     * @throws PrintException
     */
    public static void JPGPrint(String filename) throws PrintException {
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

            //份数
            aset.add(new Copies(1));
            //纸张
            //aset.add(MediaSize.ISO.A4);

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

}
