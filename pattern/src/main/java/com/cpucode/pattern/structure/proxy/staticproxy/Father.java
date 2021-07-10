package com.cpucode.pattern.structure.proxy.staticproxy;

/**
 * 父亲要帮儿子相亲，实现 Father 类
 *
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 23:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Father {
    private Son son;

    public Father(Son son){
        this.son = son;
    }

    /**
     * 目标对象的引用给拿到
     */
    public void findLove(){
        System.out.println("父母物色对象");

        this.son.findLove();

        System.out.println("双方同意交往， 确立关系");
    }
}
