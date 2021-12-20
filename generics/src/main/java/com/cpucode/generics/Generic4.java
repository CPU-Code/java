
package com.cpucode.generics;

public class Generic4 {
    public static void main(String[] args) {
        MyGenericMethod mm = new MyGenericMethod();

        mm.show("cpucode");
        mm.show(111);
        System.out.println(mm.show2(32.3));
    }
}

class MyGenericMethod {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
}
