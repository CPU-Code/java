/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-13 16:39:50
 * @LastEditTime: 2020-09-13 17:38:20
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.Abstract.abstract2;

public class User {
    // 成员变量
    private String username;    // 用户名
    private double leftMoney;   // 余额

    // 构造方法
    public User(){

    }

    public User(String username, double leftMoney){
        this.username = username;
        this.leftMoney = leftMoney;
    }

    // get/set方法
    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    // 展示信息的方法
    public void show(){
        System.out.println("用户名 :" + username + ", 余额 :" + leftMoney + "元");
    }
}
