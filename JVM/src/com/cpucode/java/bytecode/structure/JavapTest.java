package com.cpucode.java.bytecode.structure;

/**
 * 用法: javap <options> <classes>
 * 其中, 可能的选项包括:
 *   -? -h --help -help               输出此帮助消息
 *   -version                         版本信息
 *   -v  -verbose                     输出附加信息
 *   -l                               输出行号和本地变量表
 *   -public                          仅显示公共类和成员
 *   -protected                       显示受保护的/公共类和成员
 *   -package                         显示程序包/受保护的/公共类
 *                                    和成员 (默认)
 *   -p  -private                     显示所有类和成员
 *   -c                               对代码进行反汇编
 *   -s                               输出内部类型签名
 *   -sysinfo                         显示正在处理的类的
 *                                    系统信息（路径、大小、日期、SHA-256 散列）
 *   -constants                       显示最终常量
 *   --module <模块>, -m <模块>       指定包含要反汇编的类的模块
 *   --module-path <路径>             指定查找应用程序模块的位置
 *   --system <jdk>                   指定查找系统模块的位置
 *   --class-path <路径>              指定查找用户类文件的位置
 *   -classpath <路径>                指定查找用户类文件的位置
 *   -cp <路径>                       指定查找用户类文件的位置
 *   -bootclasspath <路径>            覆盖引导类文件的位置
 *   --multi-release <version>        指定要在多发行版 JAR 文件中使用的版本
 *
 * @author : cpucode
 * @Date : 2021/1/25
 * @Time : 13:34
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class JavapTest {
    private int num;
    boolean flag;
    protected char gender;
    public String info;
    public static final int COUNTS = 1;

    static {
        String url = "https://github.com/CPU-Code";
    }

    {
        info= "java";
    }

    public JavapTest(){

    }

    private JavapTest(boolean flag){
        this.flag = flag;
    }

    private void methodPrivate(){

    }

    int getNum(int i) {
        return num + i;
    }

    protected char showGender(){
        return gender;
    }

    public void showInfo(){
        int i = 10;
        System.out.println(info + i);
    }

}
