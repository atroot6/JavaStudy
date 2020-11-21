package com.company;
public class person {
    private String name;
    private int age;
    private String sex;

    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }



    public person() {
        this.name = "无参构造 初始化";
        this.age = 0;
        this.sex = "？";
        System.out.println("姓名："+name+"年龄："+age+"性别："+sex);
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
