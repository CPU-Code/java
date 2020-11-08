package test;

import junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class CalculatorTest {

    /**
     * 初始化方法：
     *  用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init ......");
    }

    /**
     * 释放资源方法：
     *  在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close....");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        System.out.println("testAdd...");

        //1.创建计算器对象
        Calculator c = new Calculator();

        //2.调用add方法
        int result = c.add(1, 3);
        System.out.println(result);

        //3.断言  我断言这个结果是3
        Assert.assertEquals(4, result);
    }

    /*
        init ......
        testAdd...
        4
        close....
    * */


    @Test
    public void testSub(){
        System.out.println("testSub.....");

        //1.创建计算器对象
        Calculator c  = new Calculator();

        int result = c.sub(3, 1);
        Assert.assertEquals(2, result);

    }

    /*
        init ......
        testSub.....
        close....
    */
}
