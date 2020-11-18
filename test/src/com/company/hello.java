package com.company;

import java.util.ArrayList;
import java.util.Random;

//框架
/*public class hello {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("你好 Java");
    }
}*/









/*
//用ArrayList作为返回值类型使用的练习：
public class hello {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; i++) { //添加20个100以内的随机数字到集合里
            a.add(new Random().nextInt(100) + 1);
        }
        System.out.println(evennumber(a));
        System.out.println();
        System.out.println("你好 Java");
    }

    public static ArrayList<Integer> evennumber(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                b.add(a.get(i));
            }
        }

        return b;
    }

}
*/







/*
//定义一个方法，并用ArrayList 作为方法参数，按特定格式输出遍历
public class hello {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("小红");
        a.add("小白");
        a.add("小黑");
        a.add("小黄");
        System.out.println("输出一次基本遍历结果：" + a.toString());
        printarray(a);
        System.out.println();
        System.out.println("你好 Java");
    }

    public static void printarray(ArrayList<String> a) {
        System.out.print("结果为：{");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            if (a.size() - 1 == i) {
                System.out.println("}");
            } else {
                System.out.print("@");
            }

        }
    }
}
*/







/*
//定义四个学生对象，添加到集合，并遍历
public class hello {
    public static void main(String[] args) {
        ArrayList<student> s = new ArrayList<>(); //创建一个学生对象类型的集合
        student a = new student("小红", 20, "女", 66);//创建四个学生对象
        student b = new student("小黄", 23, "男", 69);
        student c = new student("小率", 22, "男", 99);
        student d = new student("小白", 21, "女", 56);
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);

        for (int i = 0; i < 4; i++) {
            System.out.print("遍历" + (i + 1) + ":");
            student j = s.get(i);//学生对象创建后放到集合里，遍历时，需要从集合中拿出来，放到学生对象中才能进行遍历，否则输出的是地址值
            System.out.println("name：" + j.getName() + "  age:" + j.getAge() + "  sex:" + j.getSex() + "  score:" + j.getScore());
        }
        System.out.println("你好 Java");
    }
}
*/


//生成6个随机值（1-33），并放入集合中，并遍历集合。
/*public class hello {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        for (int i = 0; i < 6; i++) {
            a.add(new renumber().getA());
        }

        System.out.println(a.toString());
        System.out.println(a);
        System.out.println("数组中第三个元素为：" + a.get(2));
        System.out.println("你好 Java");
    }
}

class renumber {

    private int a = new Random().nextInt(33) + 1;

    public renumber() {
    }

    public renumber(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}*/


/*//实践ArrayList 的应用
        ArrayList<String> a = new ArrayList<>();
        a.add("小红");
        a.add("小放");
        a.add("小蓝");
        boolean b = a.add("小紫");
        System.out.println("添加小紫success?:  " + b);
        System.out.println("未删除前："+a.toString());//未删除前
        boolean c = a.remove("小放");
        System.out.println("删除小放 success ?  " + c);
        System.out.println("提取第二个元素为："+a.get(1));//输出第二个元素值,返回值用get
        System.out.println("集合的大小为：" + a.size());
        //遍历集合
        //集合的长度调用方法size();来求得
        System.out.println("遍历数组如下：");
        for (int i = 0; i < a.size(); i++) {
            System.out.println("第"+(i+1)+"号元素为："+a.get(i));
        }
        System.out.println(a.toString());*/


/*// 实现小游戏猜拳，有结果就退出
        int a = 0;
        int b = 0;

        while (a == b) {
            System.out.println("请输入0-2，分别代表，石头剪刀布：");
            a = new Random().nextInt(3);
            a = new Random().nextInt(3);
            b = new Scanner(System.in).nextInt();

            switch (b) {
                case 0:
                    System.out.println("你出石头");
                    break;
                case 1:
                    System.out.println("你出剪刀");
                    break;
                case 2:
                    System.out.println("你出布");
                    break;
                default:
                    System.out.println("输入格式有误！再来！");
                    continue;
            }
            if (a == b) {
                System.out.println("平局！");

            } else if (a == 0 && b == 1) {
                System.out.println("你输了！");
                break;
            } else if (a == 0 && b == 2) {
                System.out.println("你赢了！");
                break;
            } else if (a == 1 && b == 0) {
                System.out.println("你赢了");
                break;
            } else if (a == 2 && b == 0) {
                System.out.println("你输了！");
                break;
            } else if (a == 1 && b == 2) {
                System.out.println("你输了");
                break;
            }

        }*/



 /*   int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("交换前："+Arrays.toString(a));
                //将数组中的值倒置
                int min = 0;
                int max = a.length - 1;
                for (int i = 0; min < max; i++) {
        int temp = 0;
        temp = a[min];
        a[min] = a[max];
        a[max] = temp;
        min++;
        max--;
        }
        System.out.println("交换后："+Arrays.toString(a));*/

//数组最大值
   /* int[] arr = new int[]{1, 2, 3, 4, 5, 1, 6, 9};
    int max=arr[0];
        for (int i = 1; i < arr.length ; i++) {
        if (arr[i]>max){
        max=arr[i];
        }
        }*/

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

*/



/*//构造方法的使用--初始化
public class hello {
    public static void main(String[] args) {
        person p = new person("小红", 20);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
*/

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