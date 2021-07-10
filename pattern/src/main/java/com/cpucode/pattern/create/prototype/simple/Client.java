package com.cpucode.pattern.create.prototype.simple;

/**
 * @author : cpucode
 * @date : 2021/5/29
 * @time : 12:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Client {
    private Prototype prototype;

    public Client(){}

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
        return (Prototype)concretePrototype.clone();
    }
}
