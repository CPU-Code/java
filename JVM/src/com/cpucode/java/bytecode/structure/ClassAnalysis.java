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
00 03   // this_class 当前类的类别    <com/cpucode/java/bytecode/structure/ClassAnalysis>
00 04   // super_class 父类类别     <java/lang/Object>
00 00   //interfaces_count  接口数量

00 01   //fields_count 字段计数器
00 02   // access_flags	访问标志    ACC_PRIVATE	0x0002	字段是否为private
00 05   //name_index	字段名索引
00 06   //descriptor_index	描述符索引
00 00   //attribute_count	属性计数器

00 02
00 01   //access_flags	访问标志
00 07   //name_index	方法名索引

00 08           //descriptor_index	描述符索引
00 01           //attribute_count	属性计数器
00 09           //attribute_name_index	属性名索引
00 00 00 38     //attribute_length	属性长度
00 02          //max_stack 栈的最大深度
00 01           //存空间
00 00 00 0A     //字节长度

2A              // aload_0
B7 00 01        // invokespecial #1 <java/lang/Object.<init>>
2A              // aload_0
04              // iconst_1
B5 00 02        // putfield #2 <com/cpucode/java/bytecode/structure/ClassAnalysis.num>
B1              // return

00 00           // 异常表
00 02           // 属性集合计数器
00 0A           //attribute_name_index  属性名索引 10
00 00 00 0A     //attribute_length 属性长度
00 02           //line_number_table_length 属性个数
00 00           //起始pc
00 0A           //行号
00 04           //起始pc
00 0B           //行号

00 0B           // attribute_name_index  属性名索引 10
00 00 00 0C     // attribute_length 属性长度 12

00 01           // local_variable_table_length 属性个数

00 00       //start_pc  起始pc
00 0A       //length    长度
00 0C       //name_index 名字
00 0D       // descriptor_index 描述符
00 00       //index 序号

00 01       //access_flags	访问标志 public
00 0E       //name_index	方法名索引

00 0F       //descriptor_index	描述符索引
00 01       //attribute_count	属性计数器
00 09       //attribute_name_index	属性名索引 Code
00 00 00 3D //attribute_length	属性长度 61

00 03       //max_stack 栈的最大深度 3
00 01       //存空间 1
00 00 00 0F //字节长度 15

2A          //aload_0
59
B4 00 02
05          //iadd
60
B5 00 02
2A          //aload_0
B4 00 02     getfield #2 <com/cpucode/java/bytecode/structure/ClassAnalysis.num>
AC          //ireturn

00 00       // exception_table_length 异常表
00 02       // attributes_count 属性集合计数器

00 0A       //attribute_name_index 属性名索引 10
00 00 00 0A //attribute_length 属性长度 10
00 02       //line_number_table_length
00 00       //起始PC
00 0E       //行号
00 0A       //起始PC
00 10       //行号

00 0B       //属性名索引
00 00 00 0C //属性长度
00 01       //line_number_table_length
00 00       //起始PC
00 0F       //长度
00 0C       //名字
00 0D       //描述符
00 00       //序号

00 01
00 10       //属性名索引
00 00 00 02 //属性长度
00 11       //源文件名索引

* */