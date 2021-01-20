package com.cpucode.java.getting.started;

/**
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * 示例1
 * 输入
 * [3,4,5,1,2]
 * 返回值
 * 1
 *
 * @author : cpucode
 * @Date : 2021/1/19
 * @Time : 11:17
 * @Github : https://github.com/CPU-Code
 * @CSDN : https://blog.csdn.net/qq_44226094
 */
public class Jz6 {
    public static void main(String[] args) {
        Jz6 test = new Jz6();
        int[] array = {3,4,5,1,2};

        int num = test.minNumberInRotateArray(array);

        System.out.println(num);
    }

    public int minNumberInRotateArray(int [] array) {
        int num = 0;

        //num = test1(array);
        num = test2(array);

        return num;
    }

    private int test1(int [] array){
        if(array.length == 0){
            return 0;
        }

        int num = array[0];

        for(int a : array){
            num = Math.min(num, a);
        }

        return num;
    }

    private int test2(int [] array){
        /*数组的旋转形式 : [3,4,5,1,2]
                        [4,5,1,2,3]
        */

        if(array.length == 0){
            return 0;
        }

        int low = 0;
        int high = array.length - 1;

        while(low < high){
            if(array[low] < array[high]){
                //判断低位为最小值
                return array[low];
            }

            //求中间位
            int mid = (low + high) >> 1;

            if(array[low] < array[mid]){
                //说明为递增式
                low = mid + 1;
            }else if(array[mid] < array[high]){
                //说明为递增式, 低值给高位
                high = mid;
            } else{
                //无序
                low ++;
            }
        }

        return array[low];
    }
}
