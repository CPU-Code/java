package com.cpucode.java.instruction.analysis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 指令8：异常处理
 * @author : cpucode
 * @Date : 2021/2/1
 * @Time : 15:12
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class ExceptionTest {
    public void throwZero(int i){
        if(i == 0 ){
            throw new RuntimeException("参数值为 0");
        }

        /**
         *  0   1
         * this i
         *
         *  0 iload_1       压栈 i
         *  1 ifne 14 (+13)  i != 0 跳转
         *  4 new #2 <java/lang/RuntimeException>   创建 并压栈
         *  7 dup           复制
         *  8 ldc #3 <参数值为 0>   压栈
         * 10 invokespecial #4 <java/lang/RuntimeException.<init>>  调用构造方法
         * 13 athrow            异常对象的生成
         * 14 return
         * */
    }

    public void throwOne(int i) throws RuntimeException, IOException {
        if(i == 1){
            throw new RuntimeException("参数值为 1");
        }

        /**
         *  0 iload_1   压栈 i
         *  1 iconst_1  压栈 1
         *  2 if_icmpne 15 (+13)    i != 1 就跳转
         *  5 new #2 <java/lang/RuntimeException>
         *  8 dup       复制
         *  9 ldc #5 <参数值为 1>       压栈
         * 11 invokespecial #4 <java/lang/RuntimeException.<init>>  调用构造方法
         * 14 athrow        异常对象生成
         * 15 return
         *
         * Exception:
         * 0	cp_info #2	java/lang/RuntimeException
         * 1	cp_info #36	java/io/IOException
         * */
    }

    public void throwArithmetic(){
        int i = 10;
        int j = i / 0;

        System.out.println(j);

        /**
         *  0 bipush 10
         *  2 istore_1
         *  3 iload_1
         *  4 iconst_0
         *  5 idiv      int 除法
         *  6 istore_2
         *  7 getstatic #6 <java/lang/System.out>
         * 10 iload_2
         * 11 invokevirtual #7 <java/io/PrintStream.println>
         * 14 return
         * */

    }

    public void tryCatch(){
        try{
            File file = new File(".\\com\\cpucode\\java\\instruction\\analysis\\cpuCode.txt");
            FileInputStream fis = new FileInputStream(file);

            String info = "cpuCode";
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        /**
         *  0    1    2     3
         * this file  fis  info
         *
         * 0 new #8 <java/io/File>
         *  3 dup
         *  4 ldc #9 <.\com\cpucode\java\instruction\analysis\cpuCode.txt>
         *  6 invokespecial #10 <java/io/File.<init>>       调用构造方法
         *  9 astore_1          方法引用给 file
         * 10 new #11 <java/io/FileInputStream>
         * 13 dup       复制
         * 14 aload_1       压栈 file
         * 15 invokespecial #12 <java/io/FileInputStream.<init>>
         * 18 astore_2      方法引用给 fis
         * 19 ldc #13 <cpuCode>
         * 21 astore_3      常量引用给 info
         * 22 goto 38 (+16)     跳转到 return
         * 25 astore_1      把FileNotFoundException引用给 e
         * 26 aload_1       e 压栈
         * 27 invokevirtual #15 <java/io/FileNotFoundException.printStackTrace>
         * 30 goto 38 (+8)
         * 33 astore_1      RuntimeException引用给 e
         * 34 aload_1       e 压栈
         * 35 invokevirtual #16 <java/lang/RuntimeException.printStackTrace>
         * 38 return
         *
         * 异常表:
         *      起始pc  结束pc  跳转pc          捕捉类型
         * 0	  0	    22	    25	  cp_info #14   FileNotFoundException
         * 1	  0	    22	    33	  cp_info #2    RuntimeException
         * */
    }

    public static String func(){
        String str = "cpuCode";

        try{
            return str;
        }finally {
            str = "hahhah";
        }

        /**
         *  0     1
         * str   另str
         *
         *  0 ldc #13 <cpuCode>
         *  2 astore_0      引用给str
         *  3 aload_0       str 压栈
         *  4 astore_1      栈中 str 给 另str
         *  5 ldc #17 <hahhah>
         *  7 astore_0      引用给str
         *  8 aload_1       另str 压栈
         *  9 areturn       把 另str 返回
         * 10 astore_2      把异常 any 给 索引2
         * 11 ldc #17 <hahhah>
         * 13 astore_0      把hahhah 给 索引0
         * 14 aload_2       索引2 压栈
         * 15 athrow
         *
         * 0	3	5	10	cp_info #0 any
         * */
    }

    public static void main(String[] args){
        System.out.println(func());
    }
}
