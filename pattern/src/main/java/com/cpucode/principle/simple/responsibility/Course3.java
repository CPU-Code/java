package com.cpucode.principle.simple.responsibility;

/**
 * @author : cpucode
 * @date : 2021/5/27
 * @time : 19:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Course3 {
    private void modifyUserName(String userName){
        userName = "Tom";
    }

    private void modifyAddress(String address){
        address = "Changsha";
    }

    public static void main(String[] args) {
        Course3 course3 = new Course3();

    }
}
