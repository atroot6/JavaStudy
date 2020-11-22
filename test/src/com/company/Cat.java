package com.company;

public class Cat extends Animal {
    public Cat(String animal) {//构造方法
        super(animal);
    }

    public Cat() {//构造方法
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }

    @Override
    public void showvoice() {
        System.out.println("喵喵喵！");
    }
}
