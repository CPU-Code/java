package javaAPI;

public class string_compare {
    public static void main(String[] args) {
        String s1 = "cpucode";
        String s2 = "CPUCODE".toLowerCase();

        // 两个字符串比较，必须总是使用equals()方法

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

/*
false
true
*/