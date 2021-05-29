package com.cpucode.pattern.prototype.deep;

/**
 *  克隆的目标的对象是单例对象，那意味着，深克隆就会破坏单例。
 *  实际上防止克隆破坏单例解决思路非常简单，禁止深克隆便可
 *
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 17:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();

            System.out.println("深克隆： " + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        }catch (Exception e){
            e.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);

        System.out.println("浅克隆： " + (q.jinGuBang == n.jinGuBang));
    }
}
