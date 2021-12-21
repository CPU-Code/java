package com.cpucode.java.test.overrideTest;

/**
 * @author : cpucode
 * @date : 2021/12/21 15:33
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class OverrideTest {
    public static void main(String[] args) {
        Base b = new Derived();
        b.f();
        b.g();
    }
}


class Base {
    public Base() {
        g();
    }

    public void f() {
        System.out.println("Base f");
    }

    public void g() {
        System.out.println("Base g");
    }
}

class Derived extends Base {
    public void f() {
        System.out.println("Derived f()");
    }

    public void g() {
        System.out.println("Derived g()");
    }
}