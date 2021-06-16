package com.cpucode.pointer.two.container.water;

/**
 * 容器盛水问题
 *
 * 描述
 * 给定一个整形数组arr，已知其中所有的值都是非负的，将这个数组看作一个容器，请返回容器能装多少水。
 *
 * 示例1
 * 输入：[3,1,2,5,2,4]
 * 返回值： 5
 *
 * 示例2
 * 输入： [4,5,1,3,2]
 * 返回值： 2
 * 备注： 1≤N≤10^6
 *
 * @author : cpucode
 * @date : 2021/6/16
 * @time : 19:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ConWaterTest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 2, 4};

        ConWaterTest conWaterTest = new ConWaterTest();
        long l = conWaterTest.maxWater(arr);

        System.out.println(l);
    }

    /**
     * max water
     * @param arr int整型一维数组 the array
     * @return long长整型
     */
    public long maxWater (int[] arr) {
        int right = arr.length - 1;
        int left = 0;
        long water = 0L;
        int oldMax = 0;

        while (left < right){
            //取height[left]和height[right]的最小值
            int min = Math.min(arr[left], arr[right]);

            //如果最小值 min 大于桶的高度 oldMax ，要更新桶的高度到 oldMax
            oldMax = oldMax > min ? oldMax : min;

            if (arr[left] <= arr[right]){
                water += oldMax - arr[left++];
            }else{
                water += oldMax - arr[right--];
            }
        }

        return water;
    }
}
