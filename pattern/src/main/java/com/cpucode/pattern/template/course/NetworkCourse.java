package com.cpucode.pattern.template.course;

/**
 * 模板会有一个或者多个未现实方法 , 且这几个未实现方法有固定的执行循序
 * @author : cpucode
 * @date : 2021/6/2
 * @time : 14:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public abstract class NetworkCourse {
    protected final void createCourse(){
        //1、 发布预习资料
        this.postPreResource();

        //2、 制作 PPT 课件
        this.createPPT();

        //3、 在线直播
        this.liveVideo();

        //4、 提交课件、 课堂笔记
        this.postNote();

        //5、 提交源码
        this.postSource();

        //6、 布置作业， 有些课是没有作业， 有些课是有作业的
        // 如果有作业的话， 检查作业， 如果没作业， 完成了
        if(needHomework()){
            checkHomework();
        }
    }

    abstract void checkHomework();

    /**
     * 钩子方法： 实现流程的微调
     *  目的是用来干预执行流程，使得我们控制行为流程更加灵活，更符合实际业务的需求
     * @return
     */
    protected boolean needHomework(){
        return false;
    }

    final void postSource(){
        System.out.println("提交源代码");
    }

    final void postNote(){
        System.out.println("提交课件和笔记");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }

    final void createPPT(){
        System.out.println("创建备课 PPT");
    }

    final void postPreResource(){
        System.out.println("分发预习资料");
    }

}
