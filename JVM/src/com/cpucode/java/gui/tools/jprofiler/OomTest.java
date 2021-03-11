package com.cpucode.java.gui.tools.jprofiler;

import java.util.ArrayList;
import java.util.Random;

/**
 * -Xms600m -Xmx600m -XX:SurvivorRatio=8
 *
 * @author : cpucode
 * @date : 2021/2/14
 * @time : 19:28
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OomTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();

        while (true){
            try{
                Thread.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            list.add(new Picture(new Random().nextInt(100 * 50)));
        }
    }
}

class Picture{
    private byte[] pixels;

    public Picture(int length){
        this.pixels = new byte[length];
    }
}
