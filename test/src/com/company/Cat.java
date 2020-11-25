package com.company;

public class Cat extends Animal {
   int num=200;

    public Cat(String animal) {//构造方法
        super(animal);
    }

    public Cat() {//构造方法
    }
    /*@Override
    public void show(){
        System.out.println(num);
    }*/

    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    } //重写构造方法eat（）


    public void showvoice() {
        System.out.println("喵喵喵！");
    }
}
