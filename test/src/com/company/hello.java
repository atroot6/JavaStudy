package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//框架
/*public class hello {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("你好 Java");
    }
}*/

public class hello {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("你好 Java");
    }
}








//方法的理解应用
/*public class hello {
    public static void main(String[] args) {

        int c = add(4, 5);
        System.out.println("c=" + c);
        System.out.println("你好 Java");
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}*/


//对于super关键字的理解
/*class person {
    protected String name;
    protected int age;

   *//* public person() {//在父类中定义一个无参构造

    }*//*

    public person(String name, int age) {

    }
}

class student extends person {
    protected int score;

    public student(String name, int age, int score) {
        super(name, age);   //在子类中用super关键字直接调用
        this.score = score;
    }
}*/


/*
public class hello {
    public static void main(String[] args) {
        student s = new student();
        s.setName("王五");
        s.setAge(21);
        s.setSex("男");
        s.setScore(98);
        System.out.println("姓名：" + s.getName());
        System.out.println("年龄：" + s.getAge());
        System.out.println("性别：" + s.getSex());
        System.out.println("得分：" + s.getScore());
        System.out.println("你好 Java");
    }
}

class person {
    private String name;
    private int age;
    private String sex;

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

class student extends person {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
*/

/*
public class hello {
    public static void main(String[] args) {
        person p = new person();
        person s = new person("张三");
        System.out.println(p.getName());
        System.out.println(s.getName());
        p.setName("小王八");
        s.setName("卖", "豆腐");
        System.out.println(p.getName());
        System.out.println(s.getName());
    }
}

class person {
    private String name;

    public person(String name) {
        this.name = "有参构造 初始化";

    }

    public person() {
        this.name = "无参构造 初始化";
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setName(String name, String name1) {
        this.name = new String(name + "  " + name1);
    }

    public String getName() {
        return name;
    }
}*/



/*//构造方法的使用--初始化
public class hello {
    public static void main(String[] args) {
        person p = new person("小红", 20);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
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
}*/

/*//对于创建对象的理解
public class hello {
    public static void main(String[] args) {
        Book c = new Book();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入书名：");
        String a = s.nextLine();
        System.out.println("请输入书号：");
        int b = s.nextInt();
        c.setName(a);
        c.setNumber(b);
        System.out.println(c.getName());
        System.out.println(c.getNumber());
    }
}

// 定义类区域
class Book {
    private String name = "";
    private int number = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

}*/

   /* //冒泡排序算法
    int[] a = {15, 11, 16, 58, 42, 51, 25, 62, 33};
        System.out.printf("排序前：");
                System.out.println(Arrays.toString(a));
                for (int i = 0; i < a.length - 1; i++) { //共需要 a.length-1轮排序，每次排序都把大数放在后面
        for (int d = 0; d < a.length - 1 - i; d++) {  //比较次数(a.length-1-i)随着轮数的递增而递减
        //a.length - 1 - i;  -i的目的在于精简算法，由于每次把较大的数放在后面，所以后面的数不用再比较，因此用来减少比较次数
        //每轮成一个较大数
        if (a[d] > a[d + 1]) {//比较前后两个数的大小，并实现交换位置
        int temp = 0;
        temp = a[d];
        a[d] = a[d + 1];
        a[d + 1] = temp;

        }
        }
        }
        System.out.printf("排序后：");
        System.out.println(Arrays.toString(a));*/


//利用for-each 求数组中元素的和
/* int[] ns = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int a : ns) {
            sum += a;
        }
        System.out.println("sum=" + sum); // 55*/

/* int[] ns = { 1, 4, 9, 16, 25 };
        for (int i= ns.length-1;i>=0;i--) {
            System.out.println(ns[i]);
        }*/

    /*int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);*/

//do-while实现 1-100 加法
  /*  int sum = 0;
    int n = 1;
        do {
                sum = sum + n;
                n ++;
                } while (n <= 100);
                System.out.println(sum);*/

//Switch 的理解及应用
/*for (int x = 0; x == 0; ) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            switch (a) {
                case 1:
                    System.out.println("输入的是1");
                    break;
                case 2:
                    System.out.println("输入的是2");
                    break;
                case 3:
                    System.out.println("输入的是3");
                    break;
                case 4:
                    System.out.println("输入的是4");
                    break;
                case 5:
                    System.out.println("输入的是5");
                    break;
                case 6:
                    System.out.println("输入的是6");
                    break;
                default:
                    x = 1;
                    System.out.println("您选择退出");
                    break;
            }
        }*/

//利用if判断引用类型相等
       /* int a=60;//定义及格标准
        System.out.println("请输入你的成绩：");
        Scanner b =new Scanner(System.in);
        int d = b.nextInt();
        if (d>a){
            System.out.println("你超出及格线啦！");
            }else  if (d==a){   //双等于号 判断
            System.out.println("你刚好及格");
        }else {
            System.out.println("继续加油！");
        }*/

//输出联系
/*  Scanner s =new Scanner(System.in); //创建Scanner对象 并传入System.in
        System.out.println("请输入想要打印的字符：");
        String a = s.nextLine(); //将输入的字符传入a中
        System.out.println("请输入想要打印的整数：");
        int b =s.nextInt();   //输入的整数传入b
        System.out.println(a);
        System.out.println(b);*/

// 格式化输出
/*  double d = 12900000;
        System.out.printf("%.2f\n",d); // 1.29E7
        System.out.println("Hello  Java");*/