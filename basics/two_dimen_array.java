/*
 * @Author: cpu_code
 * @Date: 2020-07-08 10:30:49
 * @LastEditTime: 2020-07-08 10:34:51
 * @FilePath: \java\basics\two_dimen_array.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 二维数组的使用
第1小组销售额为：23 万元。
第2小组销售额为：66 万元。
第3小组销售额为：130 万元。
总销售额为: 219 万元。
 */
public class two_dimen_array 
{
    public static void main(String[] args) 
	{
		int[][] arr = new int[3][]; // 定义一个长度为3的二维数组

		arr[0] = new int[] { 11, 12 }; // 为数组的元素赋值
		arr[1] = new int[] { 21, 22, 23 };
		arr[2] = new int[] { 31, 32, 33, 34 };

		int sum = 0;    // 定义变量记录总销售额

		for (int i = 0; i < arr.length; i++) 
		{ 
			// 遍历数组元素
			int groupSum = 0; // 定义变量记录小组销售总额

			for (int j = 0; j < arr[i].length; j++) 
			{ 
				// 遍历小组内每个人的销售额
				groupSum = groupSum + arr[i][j];
			}

			sum = sum + groupSum; // 累加小组销售额
			
			System.out.println("第" + (i + 1) + "小组销售额为：" + groupSum + " 万元。");
		}

		System.out.println("总销售额为: " + sum + " 万元。");
	}
}