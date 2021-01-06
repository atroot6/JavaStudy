package com.example02;

public class Hero {
    private String name;
    private Weapon weapon;
    private int grade;

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int grade) {
        this.name = name;
        this.weapon = weapon;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void attack(){
        System.out.println("年龄为"+getGrade()+"的"+getName()+"拿着"+weapon.getCode()+"去打妖怪升级");
    }
}
