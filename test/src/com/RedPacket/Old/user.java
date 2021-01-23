package com.RedPacket.Old;

//用户类
public class user {
    private String name;
    private int age;
    private int money;

    public void show() {
        System.out.println("姓名： " + this.name + "年龄：" + this.age + "余额：" + this.money);
    }

    public user() {
    }

    public user(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
