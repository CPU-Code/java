package com.cpucode.spring.formework.webmvc.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : cpucode
 * @date : 2021/8/4
 * @time : 14:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class CPView {
    public static final String DEFAULT_CONTENT_TYPE = "text/html;charset=utf-8";
    private File viewFile;

    public CPView(File viewFile){
        this.viewFile = viewFile;
    }

    public String getContentType(){
        return DEFAULT_CONTENT_TYPE;
    }

    public void render(Map<String, ?> model,
                       HttpServletRequest request,
                       HttpServletResponse response) throws Exception{
        StringBuffer sb = new StringBuffer();
        RandomAccessFile ra = new RandomAccessFile(this.viewFile,"r");

        try {
            String line = null;
            while (null != (line = ra.readLine())) {
                line = new String(line.getBytes("ISO-8859-1"),"utf-8");
                // 正则表达式
                Pattern pattern = Pattern.compile("￥\\{[^\\}]+\\}",Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(line);

                while(matcher.find()){
                    String paramName = matcher.group();
                    // {和 } 除掉
                    paramName = paramName.replaceAll("￥\\{|\\}","");
                    Object paramValue = model.get(paramName);
                    if (null == paramValue) {
                        continue;
                    }

                    //要把￥{}中间的这个字符串给取出来
                    line = matcher.replaceFirst(makeStringForRegExp(paramValue.toString()));
                    matcher = pattern.matcher(line);
                }

                sb.append(line);
            }
        }finally {
            ra.close();
        }

        response.setCharacterEncoding("utf-8");
        response.getWriter().write(sb.toString());
    }

    /**
     * 处理特殊字符
     * @param str
     * @return
     */
    public static String makeStringForRegExp(String str) {
        return str
                .replace("\\", "\\\\").replace("*", "\\*")
                .replace("+", "\\+").replace("|", "\\|")
                .replace("{", "\\{").replace("}", "\\}")
                .replace("(", "\\(").replace(")", "\\)")
                .replace("^", "\\^").replace("$", "\\$")
                .replace("[", "\\[").replace("]", "\\]")
                .replace("?", "\\?").replace(",", "\\,")
                .replace(".", "\\.").replace("&", "\\&");
    }
}
