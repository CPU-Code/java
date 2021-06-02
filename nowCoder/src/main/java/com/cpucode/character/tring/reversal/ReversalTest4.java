package com.cpucode.character.tring.reversal;

/**
 * 双指针
 * 把字符串转化为数组，使用两个指针，一个在最前面一个在最后面，
 * 两个指针指向的值相互交换，交换完之后两个指针在分别往中间走……，
 * 重复上面的过程，直到两指针相遇为止
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 16:22
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ReversalTest4 {
    public static void main(String[] args) {
        String str = "abcd";

        ReversalTest reversalTest = new ReversalTest();
        String solve = reversalTest.solve(str);

        System.out.println(solve);
    }

    public String solve (String str) {
        char[] str1 = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        char temp;

        while (left < right){
            temp = str1[left];
            str1[left] = str1[right];
            str1[right] = temp;

            left++;
            right--;
        }

        return new String(str1);
    }
}
