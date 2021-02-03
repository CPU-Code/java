package javaAPI.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date4 {
    // 把String转换成Date对象
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");

        String str = "2020年12月11日";
        Date date = df.parse(str);
        System.out.println(date);
    }
}

/*
Fri Dec 11 00:00:00 CST 2020
*/