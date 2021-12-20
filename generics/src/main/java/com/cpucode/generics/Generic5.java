package com.cpucode.generics;

public class Generic5 {
    public static void main(String[] args) {
        MyImp2<String> my = new MyImp2<String>();

        my.add("cpucode");

        System.out.println(my.getE());
    }
}

interface MyGenericInterface<E>{
    public abstract void add(E e);

    public abstract E getE();
}

class MyImp2<E> implements MyGenericInterface<E> {
    E e;
    
    @Override
    public void add(E e){

    }

    @Override
    public E getE() {
        return null;
    }
}