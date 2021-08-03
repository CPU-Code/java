package com.cpucode.java.block;

/**
 * @author : cpucode
 * @date : 2021/8/3
 * @time : 9:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserService {
    public static void main(String[] args) {
        new UserService().register();
    }

    public boolean register(){
        User user = new User();
        user.setName("cpucode");

        addUser(user);
        sendPoints(user);

        return true;
    }

    private void addUser(User user){
        System.out.println("添加用户： " + user);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sendPoints(User user){
        System.out.println("发送积分给指定用户:" + user);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
