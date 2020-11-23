package com.company;

public class haha implements MyInterface {

    @Override
    public void show() {
        System.out.println("456");
    }

    @Override
    public void add() {
        System.out.println("直接调用实现类的");

    }
}
