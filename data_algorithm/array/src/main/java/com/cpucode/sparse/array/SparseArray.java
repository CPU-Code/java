package com.cpucode.sparse.array;

/**
 * @author : cpucode
 * @date : 2021/3/11
 * @time : 20:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SparseArray {
    public static void main(String[] args) {
        /**
         * 创建一个原始的二维数组 11 * 11
         *  0: 表示没有棋子， 1 表示 黑子 2 表蓝子
         */
        int checsArr[][] = new int[11][11];

        checsArr[3][2] = 1;
        checsArr[1][3] = 2;
        checsArr[5][8] = 2;

        /**
         * 输出原始的二维数组
         */
        System.out.println("原始的二维数组~~");
        for (int[] ints : checsArr) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }

            System.out.println();
        }

        /**
         * 将二维数组 转 稀疏数组的思
         *  1. 先遍历二维数组 得到非 0 数据的个数
         */
        int sum = 0;
        int length = checsArr.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (checsArr[i][j] != 0){
                    sum++;
                }
            }
        }

        /**
         * 2. 创建对应的稀疏数组
         */
        int sparseArr[][] = new int[sum + 1][3];

        /**
         * 给稀疏数组赋值
         */
        sparseArr[0][0] = length;
        sparseArr[0][1] = length;
        sparseArr[0][2] = sum;

        /**
         * count 用于记录是第几个非 0 数据
         */
        int count = 0;

        /**
         * 遍历二维数组， 将非 0 的值存放到 sparseArr 中
         */
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (checsArr[i][j] != 0){
                    count++;

                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = checsArr[i][j];
                }
            }
        }

        /**
         * 输出稀疏数组的形式
         */
        System.out.println();
        System.out.println("得到稀疏数组为~~~~");

        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();

        /**
         * 将稀疏数组 --》 恢复成 原始的二维数组
         */

        /**
         * 1. 先读取稀疏数组的第一行， 根据第一行的数据， 创建原始的二维数组， 比如上面的 chessArr2 = int[11][11]
         * 2. 在读取稀疏数组后几行的数据， 并赋给 原始的二维数组 即可
         */

        /**
         * 1. 先读取稀疏数组的第一行， 根据第一行的数据， 创建原始的二维数组
         */
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];

        /**
         * 2. 在读取稀疏数组后几行的数据(从第二行开始)， 并赋给 原始的二维数组 即可
         */
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        /**
         * 输出恢复后的二维数组
         */
        System.out.println();
        System.out.println("恢复后的二维数组");

        for (int[] ints : checsArr) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }
    }
}
