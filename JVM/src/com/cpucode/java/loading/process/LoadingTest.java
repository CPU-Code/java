package com.cpucode.java.loading.process;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 过程一：加载阶段
 *      通过Class类，获得了java.lang.String类的所有方法信息，并打印方法访问标识符、描述符
 * @author : cpucode
 * @Date : 2021/2/2
 * @Time : 11:48
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class LoadingTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String");

            //获取当前运行时类声明的所有方法
            Method[] ms = clazz.getDeclaredMethods();

            for(Method m : ms){
                //获取方法的修饰符
                String mod = Modifier.toString(m.getModifiers());
                System.out.print(mod + " ");

                //获取方法的返回值类型
                String returnType = m.getReturnType().getSimpleName();
                System.out.print(returnType + " ");

                //获取方法名
                System.out.print(m.getName() + "(");

                //获取方法的参数列表
                Class<?>[] ps = m.getParameterTypes();

                if (ps.length == 0){
                    System.out.print(")");
                }

                for (int i = 0; i < ps.length; i++) {
                    char end = (i == ps.length - 1 ) ? ')' : ',';
                    //获取参数的类型
                    System.out.print(ps[i].getSimpleName() + end);
                }

                System.out.println();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

/**
 * public boolean equals(Object)
 * public String toString()
 * public int hashCode()
 * public volatile int compareTo(Object)
 * public int compareTo(String)
 * public int indexOf(String,int)
 * static int indexOf(char[],int,int,String,int)
 * static int indexOf(char[],int,int,char[],int,int,int)
 * public int indexOf(int)
 * public int indexOf(String)
 * public int indexOf(int,int)
 * public static String valueOf(char)
 * public static String valueOf(Object)
 * public static String valueOf(boolean)
 * public static String valueOf(char[],int,int)
 * public static String valueOf(char[])
 * public static String valueOf(double)
 * public static String valueOf(float)
 * public static String valueOf(long)
 * public static String valueOf(int)
 * private static void checkBounds(byte[],int,int)
 * public int length()
 * public boolean isEmpty()
 * public char charAt(int)
 * public int codePointAt(int)
 * public int codePointBefore(int)
 * public int codePointCount(int,int)
 * public int offsetByCodePoints(int,int)
 * public void getChars(int,int,char[],int)
 *  void getChars(char[],int)
 * public byte[] getBytes()
 * public byte[] getBytes(String)
 * public void getBytes(int,int,byte[],int)
 * public byte[] getBytes(Charset)
 * public boolean contentEquals(StringBuffer)
 * public boolean contentEquals(CharSequence)
 * private boolean nonSyncContentEquals(AbstractStringBuilder)
 * public boolean equalsIgnoreCase(String)
 * public int compareToIgnoreCase(String)
 * public boolean regionMatches(int,String,int,int)
 * public boolean regionMatches(boolean,int,String,int,int)
 * public boolean startsWith(String)
 * public boolean startsWith(String,int)
 * public boolean endsWith(String)
 * private int indexOfSupplementary(int,int)
 * public int lastIndexOf(int,int)
 * static int lastIndexOf(char[],int,int,char[],int,int,int)
 * static int lastIndexOf(char[],int,int,String,int)
 * public int lastIndexOf(String,int)
 * public int lastIndexOf(int)
 * public int lastIndexOf(String)
 * private int lastIndexOfSupplementary(int,int)
 * public String substring(int)
 * public String substring(int,int)
 * public CharSequence subSequence(int,int)
 * public String concat(String)
 * public String replace(char,char)
 * public String replace(CharSequence,CharSequence)
 * public boolean matches(String)
 * public boolean contains(CharSequence)
 * public String replaceFirst(String,String)
 * public String replaceAll(String,String)
 * public String[] split(String,int)
 * public String[] split(String)
 * public static transient String join(CharSequence,CharSequence[])
 * public static String join(CharSequence,Iterable)
 * public String toLowerCase(Locale)
 * public String toLowerCase()
 * public String toUpperCase()
 * public String toUpperCase(Locale)
 * public String trim()
 * public char[] toCharArray()
 * public static transient String format(Locale,String,Object[])
 * public static transient String format(String,Object[])
 * public static String copyValueOf(char[],int,int)
 * public static String copyValueOf(char[])
 * public native String intern()
 * */