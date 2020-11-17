package com.company;
//人类
class person {
    private String name;
    private int age;
    private String sex;

    public person(String name) {
        this.name = "有参构造 初始化";
        this.age = 0;
        this.sex = "？";

    }

    public person() {
        this.name = "无参构造 初始化";
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
//学生类继承人类
class student extends person {
    private int score;

    public student() {
        this.score = 60;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
//手机类
class phone {

}