/*
 * @由于个人水平有限, 难免有些错误, 还请指点:  
 * @Author: cpu_code
 * @Date: 2020-09-14 14:00:14
 * @LastEditTime: 2020-09-14 14:00:26
 * @FilePath: \java\object\polymorphic\polymorphic6\Laptop.java
 * @Gitee: [https://gitee.com/cpu_code](https://gitee.com/cpu_code)
 * @Github: [https://github.com/CPU-Code](https://github.com/CPU-Code)
 * @CSDN: [https://blog.csdn.net/qq_44226094](https://blog.csdn.net/qq_44226094)
 * @Gitbook: [https://923992029.gitbook.io/cpucode/](https://923992029.gitbook.io/cpucode/)
 */
package com.cpucode.java.polymorphic.polymorphic6;

public class Laptop {
        // 笔记本开启运行功能
        public void run() {
            System.out.println("笔记本运行");
        }
    
        // 笔记本使用usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
        public void useUse(Use usb){
            // 判断是否有USB设备
            if(usb != null){
                usb.open();
    
                // 类型转换,调用特有方法
                if(usb instanceof Mouse){
                    Mouse m = (Mouse) usb;
                    m.click();
                } else if(usb instanceof KeyBoard) {
                    KeyBoard kb = (KeyBoard)usb;
                    kb.type();
                }
                usb.close();
            }
        }
    
        public void shoutDown(){
            System.out.println("笔记本关闭");
        }
}
