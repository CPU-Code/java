/*
 * @Author: cpu_code
 * @Date: 2020-07-08 10:45:02
 * @LastEditTime: 2020-07-08 10:45:54
 * @FilePath: \java\basics\Checklist.java
 * @Gitee: https://gitee.com/cpu_code
 * @CSDN: https://blog.csdn.net/qq_44226094
 */ 

/**
 * 商城库存清单程序

--------------------------Checklist--------------------------------
types           Price           num
MacBookAir       6988.88        5
ThinkpadT450    5999.99         10
ASUS-FL5800     4999.5           18
------------------------------------------------------------------
sum_num == 33
Price_sun == 184935.3

 */
public class Checklist 
{
    public static void main(String[] args) 
	{
		// 苹果笔记本电脑
		String macBrand = "MacBookAir";
		double macPrice = 6988.88;
		int macCount = 5;

		// 联想Thinkpad笔记本电脑
		String thinkpadBrand = "ThinkpadT450";
		double thinkpadPrice = 5999.99;
		int thinkpadCount = 10;

		// 华硕ASUS笔记本电脑
		String ASUSBrand = "ASUS-FL5800";
		double ASUSPrice = 4999.50;
		int ASUSCount = 18;

		// 列表顶部
		System.out.println("--------------------------Checklist--------------------------------");
		System.out.println("types 		Price 		num");

		// 列表中部
		System.out.println(macBrand + "	 " + macPrice  + "    	" + macCount);
		System.out.println(thinkpadBrand+ "    " + thinkpadPrice + "		" + thinkpadCount);
		System.out.println(ASUSBrand + "	" + ASUSPrice + "		 " + ASUSCount);

		// 统计总库存数、库存总金额
		int totalCount = macCount + thinkpadCount + ASUSCount;
		
		double totalMoney = (macCount * macPrice) + 
							(thinkpadCount * thinkpadPrice) + 
							(ASUSCount * ASUSPrice);

		// 列表底部
		System.out.println("------------------------------------------------------------------");
		System.out.println("sum_num == " + totalCount);
		System.out.println("Price_sun == " + totalMoney);

	}
}
