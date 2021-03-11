package com.cpucode.queue;

import java.util.Scanner;

/**
 * @author : cpucode
 * @date : 2021/3/11
 * @time : 20:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ArrayQueue {
    public static void main(String[] args) {
        //创建一个队列
        ArrayQueueClass queue = new ArrayQueueClass(3);
        //接收用户输入
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        //输出一个菜单
        while(loop){
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");

            //接收一个字符
            key = scanner.next().charAt(0);

            switch (key) {
                case 's':
                    queue.showQueue();

                    break;
                case 'e':
                    //退出
                    scanner.close();
                    loop = false;

                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);

                    break;
                case 'g':
                    //取出数据
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }

                    break;
                case 'h':
                    //查看队列头的数据
                    try {
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }

                    break;
                default:
                    break;
            }
        }

        System.out.println("程序退出~~");

    }
}

/**
 * 使用数组模拟队列-编写一个ArrayQueue类
 */
class ArrayQueueClass{
    /**
     * 表示数组的最大容量
     */
    private int maxSize;

    /**
     * 队列头
     */
    private int front;

    /**
     * 队列尾
     */
    private int rear;

    /**
     * 该数据用于存放数据, 模拟队列
     */
    private int[] arr;

    /**
     * 创建队列的构造器
     */
    public ArrayQueueClass(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];

        //指向队列头部，分析出front是指向队列头的前一个位置.
        front = -1;

        //指向队列尾，指向队列尾的数据(即就是队列最后一个数据)
        rear = -1;
    }

    /**
     * 判断队列是否满
     */
    public boolean isFull(){
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty(){
        return rear == front;
    }

    /**
     * 添加数据到队列
     */
    public void addQueue(int n){
        //判断队列是否满
        if (isFull()){
            System.out.println("队列满，不能加入数据~");

            return;
        }

        //让rear 后移
        rear++;
        arr[rear] = n;
    }

    /**
     * 获取队列的数据, 出队列
     */
    public int getQueue(){
        //判断队列是否空
        if (isEmpty()){
            //通过抛出异常
            throw new RuntimeException("队列空，不能取数据");
        }

        // front后移
        front++;

        return arr[front];
    }

    /**
     * 显示队列的所有数据
     */
    public void showQueue(){
        //遍历
        if (isEmpty()){
            System.out.println("队列空的，没有数据~~");

            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    /**
     * 显示队列的头数据， 注意不是取出数据
     * @return
     */
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空的，没有数据~~");
        }

        return arr[front + 1];
    }
}