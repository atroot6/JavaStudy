package com.company;


//学生类继承人类
class student extends person {
    private int score;

    public student(String name, int age, String sex, int score) {
        super(name, age, sex);
        this.score = score;
    }

    public student(int score) {
        this.score = score;
    }

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