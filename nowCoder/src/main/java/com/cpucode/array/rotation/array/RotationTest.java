package com.cpucode.array.rotation.array;

/**
 * 旋转数组
 *
 * 描述
 * 一个数组A中存有N（N&gt0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（M>=0）个位置，
 * 即将A中的数据由（A0 A1 ……AN-1 ）变换为（AN-M …… AN-1 A0 A1 ……AN-M-1 ）
 * （最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
 * 示例1
 *  输入：
 *      6,2,[1,2,3,4,5,6]
 *  返回值：
 *      [5,6,1,2,3,4]
 * 备注：
 *      (1<=N<=100,M>=0)
 * @author : cpucode
 * @date : 2021/6/3
 * @time : 13:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RotationTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};

        int[] solve = new RotationTest().solve(a.length, 2, a);

        for (int i : solve) {
            System.out.print(i + " ");
        }
    }

    /**
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     */
    public int[] solve (int n, int m, int[] a) {
        m = m % n;

        swap(a, 0, n - 1);
        swap(a, 0, m - 1);
        swap(a, m, n - 1);

        return a;
    }

    public static void swap(int[] a, int start, int end){
        int tamp = 0;

        while (start < end){
            tamp = a[start];
            a[start] = a[end];
            a[end] = tamp;

            start++;
            end--;
        }
    }
}
