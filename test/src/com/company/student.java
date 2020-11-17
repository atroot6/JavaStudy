package com.company;


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