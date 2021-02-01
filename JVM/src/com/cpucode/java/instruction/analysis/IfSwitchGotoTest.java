package com.cpucode.java.instruction.analysis;

import com.cpucode.java.heap.ScalarReplace;

/**
 * 指令7：控制转移指令
 * @author : cpucode
 * @Date : 2021/1/28
 * @Time : 11:57
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class IfSwitchGotoTest {
    public void compare1(){
        int a = 0;

        if(a != 0){
            a = 10;
        } else{
            a = 20;
        }

        /**
         *  0 iconst_0
         *  1 istore_1
         *  2 iload_1
         *  3 ifeq 12 (+9)      = 0 跳转 12
         *  6 bipush 10
         *  8 istore_1
         *  9 goto 15 (+6)      跳转到 15
         * 12 bipush 20
         * 14 istore_1
         * 15 return
         * */
    }

    public boolean compareNull(String str){
        if(str == null){
            return true;
        }else{
            return false;
        }

        /**
         * 0 aload_1
         * 1 ifnonnull 6 (+5)   != null 跳转6
         * 4 iconst_1
         * 5 ireturn
         * 6 iconst_0
         * 7 ireturn
         * */
    }

    public void compare2(){
        float f1 = 9;
        float f2 = 10;

        System.out.println(f1 < f2);

        /**
         *  0    1    2
         * this  f1  f2
         *
         *  0 ldc #2 <9.0>
         *  2 fstore_1
         *  3 ldc #3 <10.0>
         *  5 fstore_2
         *  6 getstatic #4 <java/lang/System.out>
         *  9 fload_1
         * 10 fload_2
         * 11 fcmpg         f1 < f2 压入 -1
         * 12 ifge 19 (+7)  >= 0 跳转 19
         * 15 iconst_1
         * 16 goto 20 (+4)
         * 19 iconst_0
         * 20 invokevirtual #5 <java/io/PrintStream.println>
         * 23 return
         * */
    }

    public void compare3(){
        int i1 = 10;
        int l1 = 20;

        System.out.println(i1 > l1);
        /**
         *  0 bipush 10
         *  2 istore_1
         *  3 bipush 20
         *  5 istore_2
         *  6 getstatic #4 <java/lang/System.out>
         *  9 iload_1
         * 10 iload_2
         * 11 if_icmple 18 (+7) i1 小于等于 l1 跳转 18
         * 14 iconst_1
         * 15 goto 19 (+4)
         * 18 iconst_0
         * 19 invokevirtual #5 <java/io/PrintStream.println>
         * 22 return
         * */
    }

    public int compare4(double d){
        double num = 50.0;

        if(d > num){
            return 1;
        } else {
            return -1;
        }

        /**
         *  0 dload_1
         *  1 ldc2_w #6 <50.0>
         *  4 dcmpl     d > 50.0 压栈 1
         *  5 ifle 10 (+5)  <= 0 跳转 10
         *  8 iconst_1
         *  9 ireturn
         * 10 iconst_m1
         * 11 ireturn
         * */
    }

    /**
     * 2.比较条件跳转指令
     * */
    public void ifCompare1(){
        int i = 10;
        int j = 20;

        System.out.println(i > j);

        /**
         *  0 bipush 10
         *  2 istore_1
         *  3 bipush 20
         *  5 istore_2
         *  6 getstatic #4 <java/lang/System.out>
         *  9 iload_1
         * 10 iload_2
         * 11 if_icmple 18 (+7) i <= j 跳转
         * 14 iconst_1
         * 15 goto 19 (+4)
         * 18 iconst_0
         * 19 invokevirtual #5 <java/io/PrintStream.println>
         * 22 return
         * */
    }

    public void ifCompare2(){
        short s1 = 9;
        byte s2 = 10;

        System.out.println(s1 > s2);

        /**
         *  0 bipush 9
         *  2 istore_1
         *  3 bipush 10
         *  5 istore_2
         *  6 getstatic #4 <java/lang/System.out>
         *  9 iload_1
         * 10 iload_2
         * 11 if_icmple 18 (+7) s1 <= s2 跳转
         * 14 iconst_1
         * 15 goto 19 (+4)
         * 18 iconst_0
         * 19 invokevirtual #5 <java/io/PrintStream.println>
         * 22 return
         * */
    }

    public void ifCompare3(){
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);
        System.out.println(obj1 != obj2);

        /**
         *  0 new #8 <java/lang/Object>
         *  3 dup
         *  4 invokespecial #1 <java/lang/Object.<init>>
         *  7 astore_1
         *  8 new #8 <java/lang/Object>
         * 11 dup
         * 12 invokespecial #1 <java/lang/Object.<init>>
         * 15 astore_2
         * 16 getstatic #4 <java/lang/System.out>
         * 19 aload_1
         * 20 aload_2
         * 21 if_acmpne 28 (+7)     != 跳转 28
         * 24 iconst_1
         * 25 goto 29 (+4)
         * 28 iconst_0
         * 29 invokevirtual #5 <java/io/PrintStream.println>
         * 32 getstatic #4 <java/lang/System.out>
         * 35 aload_1
         * 36 aload_2
         * 37 if_acmpeq 44 (+7)     == 跳转 44
         * 40 iconst_1
         * 41 goto 45 (+4)
         * 44 iconst_0
         * 45 invokevirtual #5 <java/io/PrintStream.println>
         * 48 return
         * */
    }

    /**
     * 3.多条件分支跳转
     * */
    public void swtich1(int select){
        int num;

        switch (select){
            case 1:
                num = 10;
                break;
            case 2 :
                num = 20;
                break;
            case 3 :
                num = 30;
                break;
            default:
                num = 40;
        }

        /**
         *  0 iload_1
         *  1 tableswitch 1 to 3	1:  28 (+27)    用于switch条件跳转, case值连续
         * 	2:  34 (+33)
         * 	3:  37 (+36)
         * 	default:  43 (+42)
         *
         * 28 bipush 10
         * 30 istore_2
         * 31 goto 46 (+15)     跳转到 return
         *
         * 34 bipush 20
         * 36 istore_2
         * 37 bipush 30
         * 39 istore_2
         * 40 goto 46 (+6)      跳转到 return
         *
         * 43 bipush 40
         * 45 istore_2
         * 46 return
         * */
    }

    public void swtich2(int select){
        int num;

        switch (select){
            case 100:
                num = 10;
                break;
            case 500:
                num = 20;
                break;
            case 200:
                num = 30;
                break;
            default:
                num = 40;
        }

        /**
         *  0 iload_1
         *  1 lookupswitch 3        用于switch条件跳转, case值不连续
         * 	100:  36 (+35)
         * 	200:  48 (+47)
         * 	500:  42 (+41)
         * 	default:  54 (+53)
         *
         * 36 bipush 10
         * 38 istore_2
         * 39 goto 57 (+18)     跳转 return
         *
         * 42 bipush 20
         * 44 istore_2
         * 45 goto 57 (+12)     跳转 return
         *
         * 48 bipush 30
         * 50 istore_2
         * 51 goto 57 (+6)      跳转 return
         *
         * 54 bipush 40
         * 56 istore_2
         *
         * 57 return
         * */
    }

    /**
     * jdk7新特性：引入String类型
     * */
    public void swtich3(String season){
        switch(season){
            case "SRPING":
                break;
            case "SUMMER":
                break;
            case "AUTUMN":
                break;
            case "WINTER":
                break;
            default:
                break;
        }

        /**
         *   0 aload_1
         *   1 astore_2
         *   2 iconst_m1
         *   3 istore_3
         *   4 aload_2
         *   5 invokevirtual #9 <java/lang/String.hashCode>
         *   8 lookupswitch 4           用于switch条件跳转, case值不连续
         * 	-1840563119:  52 (+44)
         * 	-1837878353:  66 (+58)
         * 	-1734407483:  94 (+86)
         * 	1941980694:  80 (+72)
         * 	default:  105 (+97)
         *
         *  52 aload_2
         *  53 ldc #10 <SRPING>
         *  55 invokevirtual #11 <java/lang/String.equals>  调用实例方法 equals 比较
         *  58 ifeq 105 (+47)
         *  61 iconst_0
         *  62 istore_3
         *  63 goto 105 (+42)
         *
         *  66 aload_2
         *  67 ldc #12 <SUMMER>
         *  69 invokevirtual #11 <java/lang/String.equals>
         *  72 ifeq 105 (+33)
         *  75 iconst_1
         *  76 istore_3
         *  77 goto 105 (+28)
         *
         *  80 aload_2
         *  81 ldc #13 <AUTUMN>
         *  83 invokevirtual #11 <java/lang/String.equals>
         *  86 ifeq 105 (+19)
         *  89 iconst_2
         *  90 istore_3
         *  91 goto 105 (+14)
         *
         *  94 aload_2
         *  95 ldc #14 <WINTER>
         *  97 invokevirtual #11 <java/lang/String.equals>
         * 100 ifeq 105 (+5)
         * 103 iconst_3
         * 104 istore_3
         * 105 iload_3
         * 106 tableswitch 0 to 3	0:  136 (+30)
         * 	1:  139 (+33)
         * 	2:  142 (+36)
         * 	3:  145 (+39)
         * 	default:  145 (+39)
         * 136 goto 145 (+9)
         * 139 goto 145 (+6)
         * 142 goto 145 (+3)
         * 145 return
         * */
    }

    /**
     * 4.无条件跳转指令
     * */
    public void whileInt(){
        int i = 0;
        int num = 100;

        while (i < num){
            String s = "cpuCode";
            i++;
        }

        /**
         *  0 iconst_0
         *  1 istore_1
         *  2 bipush 100
         *  4 istore_2
         *  5 iload_1   i
         *  6 iload_2   num
         *  7 if_icmpge 19 (+12)    i >= num 跳转
         * 10 ldc #15 <cpuCode>
         * 12 astore_3
         * 13 iinc 1 by 1
         * 16 goto 5 (-11)
         * 19 return
         * */
    }

    public void whileDouble(){
        double d = 0.0;
        double max = 100.1;

        while(d < max){
            String s = "cpuCode";
            d++;
        }

        /**
         *  0   1 2  3 4
         * this  d   max
         *  0 dconst_0
         *  1 dstore_1
         *  2 ldc2_w #16 <100.1>
         *  5 dstore_3
         *  6 dload_1       d 压栈
         *  7 dload_3       max 压栈
         *  8 dcmpg         d < max 压栈 -1
         *  9 ifge 23 (+14)     >= 0 跳转 return
         * 12 ldc #15 <cpuCode>
         * 14 astore 5
         * 16 dload_1
         * 17 dconst_1
         * 18 dadd
         * 19 dstore_1
         * 20 goto 6 (-14)  跳转到 6
         * 23 return
         * */
    }

    public void printFor(){
        short i;
        int num = 100;

        for (i = 0; i < num; i++){
            String s = "cpuCode";
        }

        /**
         *  0    1   2
         * this  i  num
         *
         *  0 bipush 100
         *  2 istore_2
         *  3 iconst_0
         *  4 istore_1
         *  5 iload_1   压栈 i
         *  6 iload_2   压栈 num
         *  7 if_icmpge 21 (+14)    i >= num 跳转
         * 10 ldc #15 <cpuCode>
         * 12 astore_3      cpuCode存储到 s
         * 13 iload_1       压栈 i
         * 14 iconst_1      压栈 1
         * 15 iadd          相加
         * 16 i2s           结果转换为 short
         * 17 istore_1      存储到 i
         * 18 goto 5 (-13)  跳转到 5
         * 21 return
         * */
    }

    /**
     * 两个方法的操作有何不同？
     * */
    public void whileTest(){
        int i = 0;
        int num = 100;

        while(i <= num){
            i++;
        }
        //可以继续使用i

        /**
         *  0 iconst_0      压栈 0
         *  1 istore_1      存储到 i
         *  2 bipush 100    压栈 100
         *  4 istore_2      存储到 num
         *  5 iload_1       i
         *  6 iload_2       num
         *  7 if_icmpgt 16 (+9)     i > num 跳转
         * 10 iinc 1 by 1
         * 13 goto 5 (-8)
         * 16 return
         * */
    }

    public void forTest(){
        int max = 100;

        for (int i = 1; i <= max; i++){

        }
        //不可以继续使用i

        /**
         *  0 bipush 100    压栈 100
         *  2 istore_1      100存储 max 中
         *  3 iconst_1      压栈 1
         *  4 istore_2      存储到 i
         *  5 iload_2      压栈 i
         *  6 iload_1      压栈 max
         *  7 if_icmpgt 16 (+9)     i > max 跳转
         * 10 iinc 2 by 1   i+1
         * 13 goto 5 (-8)
         * 16 return
         * */
    }

    public void doWhileTest(){
        int i = 1;

        do {
            i++;
        }while(i <= 100);

        /**
         *  0    1
         * this  i
         *  0 iconst_1  压栈 1
         *  1 istore_1  1 存储到 i
         *  2 iinc 1 by 1   i + 1
         *  5 iload_1       压栈 i
         *  6 bipush 100    压栈 100
         *  8 if_icmple 2 ( -6) i <= 100 跳转
         * 11 return
         * */
    }
}
