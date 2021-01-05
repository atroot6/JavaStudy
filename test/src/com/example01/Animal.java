package com.example01;

public abstract class Animal { //定义一个抽象类
    String  animal;
    int num=190;

    public Animal() {//无参构造方法
    }
    /*public void show(){
        System.out.println(num);
    }*/

    public Animal(String animal) { //构造方法
        this.animal = animal;
    }

    public abstract void eat(); //抽象方法吃东西
    /*public abstract void showvoice();*/

}
