package com.cpucode.sort.quick.sort.find.kth;

/**
 * 寻找第K大
 *
 * 描述
 * 有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
 *
 * 给定一个整数数组a,同时给定它的大小n和要找的K(1<=K<=n)，
 * 请返回第K大的数(包括重复的元素，不用去重)，保证答案存在。
 *
 * 示例1
 * 输入： [1,3,5,2,2],5,3
 * 返回值： 2
 *
 * 示例2
 * 输入： [10,10,9,9,8,7,5,6,4,3,4,2],12,3
 * 返回值： 9
 * 说明： 去重后的第3大是8，但本题要求包含重复的元素，不用去重，所以输出9
 *
 * @author : cpucode
 * @date : 2021/6/14
 * @time : 11:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FindKthTest {
    public static void main(String[] args) {
        int[] a = {1, 9, 3, 7, 5};
        FindKthTest findKthTest = new FindKthTest();
        int kth = findKthTest.findKth(a, a.length, 3);

        System.out.println(kth);
    }

    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n - 1, K);
    }

    public static int findKth(int[] a, int left, int right , int K){
        // write code here
        int p = partition(a, left, right);

        // 改进后，很特殊的是，p是全局下标，只要p对上topK坐标就可以返回
        if (p == a.length - K){
            return a[p];
        }else if (p < a.length - K){
            // 如果基准在左边，这在右边找
            return findKth(a, p + 1, right, K);
        }else {
            return findKth(a, left, p - 1, K);
        }
    }


    //分割
    public static int partition(int[] a, int left, int right){
        // 可优化成随机，或中位数
        int temp = a[left];

        while (left < right){
            while (left < right && temp < a[right]){
                right--;
            }
            a[left] = a[right];

            while (left < right && temp > a[left]){
                left++;
            }
            a[right] = a[left];
        }

        a[left] = temp;

        return left;
    }
}
