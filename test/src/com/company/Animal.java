package com.company;

public abstract class Animal { //定义一个抽象类
    String  animal;

    public Animal() {//无参构造方法
    }

    public Animal(String animal) { //构造方法
        this.animal = animal;
    }

    public abstract void eat();
    public abstract void showvoice();
}
