package com.cpucode.java.bytecode.structure;

/**
 * @author : cpucode
 * @Date : 2021/1/22
 * @Time : 20:09
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class ClassAnalysis {
    private int num = 1;

    public int add(){
        num += 2;

        return num;
    }
}

/*
CA FE BA BE                 // u4	magic	魔数,识别Class文件格式
00 00                       // u2	minor_version	副版本号(小版本)
00 34                       // u2	major_version	主版本号(大版本)
00 16                       // u2	constant_pool_count	常量池计数器(常量池长度)
0A 00 04 00 12              // CONSTANT_Methodref_info	10	类中方法的符号引用
09 00 03 00 13              // CONSTANT_Fieldref_info	9	字段的符号引用
07 00 14                    // CONSTANT_Class_info	7	类或接口的符号引用
07 00 15                    // CONSTANT_Class_info	7	类或接口的符号引用
01 00 03 6E 75 6D           //  CONSTANT_utf8_info	1	UTF-8编码的字符串 num
01 00 01 49                 //  I
01 00 06 3C 69 6E 69 74 3E  //<init>
01 00 03 28 29 56           //()V
01 00 04 43 6F 64 65        //Code
01 00 0F 4C 69 6E 65 4E 75 6D 62 65 72 54 61 62 6C 65           //LineNumberTable
01 00 12 4C 6F 63 61 6C 56 61 72 69 61 62 6C 65 54 61 62 6C 65  //LocalVariableTable
01 00 04 74 68 69 73                                            //this
//Lcom/cpucode/java/bytecode/structure/ClassAnalysis;
01 00 33 4C 63 6F 6D 2F 63 70 75 63 6F 64 65 2F 6A 61 76 61 2F 62 79 74 65 63 6F 64 65 2F 73 74 72 75 63 74 75 72 65 2F 43 6C 61 73 73 41 6E 61 6C 79 73 69 73 3B
01 00 03 61 64 64                           //add
01 00 03 28 29 49                           //()I
01 00 0A 53 6F 75 72 63 65 46 69 6C 65      //SourceFile
01 00 12 43 6C 61 73 73 41 6E 61 6C 79 73 69 73 2E 6A 61 76 61      //ClassAnalysis.java
0C 00 07 00 08
0C 00 05 00 06
//com/cpucode/java/bytecode/sructure/ClassAnalysis
01 00 31 63 6F 6D 2F 63 70 75 63 6F 64 65 2F 6A 61 76 61 2F 62 79 74 65 63 6F 64 65 2F 73 74 72 75 63 74 75 72 65 2F 43 6C 61 73 73 41 6E 61 6C 79 73 69 73
//java/lang/Object
01 00 10 6A 61 76 61 2F 6C 61 6E 67 2F 4F 62 6A 65 63 74
//访问标识  ACC_PUBLIC 0×0001 标志为public类型
//        ACC_SUPER   0x0020 标志分许使用 invokespeia 7节码指令的新语义，JDK1.0.2之后编译出来
00 21
00 03
00 04 00 00 00 01 00 02 00 05 00 06 00 00 00 02 00 01 00 07 00 08 00 01 00 09 00 00 00 38 00 02 00 01 00 00 00 0A 2A B7 00 01 2A 04 B5 00 02 B1 00 00 00 02 00 0A 00 00 00 0A 00 02 00 00 00 0A 00 04 00 0B 00 0B 00 00 00 0C 00 01 00 00 00 0A 00 0C 00 0D 00 00 00 01 00 0E 00 0F 00 01 00 09 00 00 00 3D 00 03 00 01 00 00 00 0F 2A 59 B4 00 02 05 60 B5 00 02 2A B4 00 02 AC 00 00 00 02 00 0A 00 00 00 0A 00 02 00 00 00 0E 00 0A 00 10 00 0B 00 00 00 0C 00 01 00 00 00 0F 00 0C 00 0D 00 00 00 01 00 10 00 00 00 02 00 11

* */