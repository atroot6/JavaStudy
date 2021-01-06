package com.example03;

public class Hero {
    private String name;
    private Skill skill; //将接口作为类型应用

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }
    public void attack(){
        System.out.println(name+"释放技能");
        skill.use();//类型为接口
        System.out.println("释放完成!");
    }
}
