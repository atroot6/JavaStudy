package com.company;

public interface MyInterface {
    public abstract void show();

    public default void add(){
        System.out.println("接口默认方法实现");
    }
}

