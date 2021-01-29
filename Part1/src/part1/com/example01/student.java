package part1.com.example01;

/**
 * 对于super等关键字的理解使用
 */
//学生类继承人类
public class student extends person {
    private int score;
    private static int Sid;

    public student(String name, int age, String sex, int score) {
        super(name, age, sex);
        this.score = score;
        this.Sid=++Sid; //全参构造中 实现学号创建并自动编号
    }

    public student() {
        this.Sid=++Sid;  //无参构造中 实现学号创建并自动编号
    }

    public student(int score) {
        this.score = score;
        this.Sid=++Sid;  // 构造方法中实现学号创建并自动编号（只要创建对象就创建学号+1）
    }
}