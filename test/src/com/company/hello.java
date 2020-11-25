package com.company;

//框架
/*public class hello {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("\n你好 Java");
    }
}*/



public class hello {
    public static void main(String[] args) {
            
        System.out.println();
        System.out.println("\n你好 Java");
    }
}



/*

public class hello {
    public static void main(String[] args) {
        Animal animal = new Cat();//向上转型 猫转为动物 小转大，其子类的特有方法将无法调用

        if (animal instanceof Dog) {
            Dog gou = (Dog) animal;
            gou.showvoice();
            gou.eat();
        }
        if (animal instanceof Cat) {
            Cat mao = (Cat) animal;
            mao.showvoice();
            mao.eat();
        }
//        Cat mao = (Cat) animal; //向下转型语句
//        mao.showvoice();// 若不写 那么就会编译报错
//        Animal dog = new Dog();
//        dog.eat();
//        Dog gou = (Dog) dog;
//        gou.showvoice();

        System.out.println();
        System.out.println("\n你好 Java");
    }
}

*/


/*
public class hello {
    public static void main(String[] args) {
        Animal animal = new Cat();//向上转型 猫转为动物 小转大，其子类的特有方法将无法调用
        animal.eat(); //调用其抽象方法
        Cat mao = (Cat) animal; //向下转型语句
        mao.showvoice();// 若不写 那么就会编译报错
        Animal dog = new Dog();
        dog.eat();
        Dog gou = (Dog) dog;
        gou.showvoice();

        System.out.println();
        System.out.println("\n你好 Java");
    }
}
*/




/* Animal cat =new Cat(); //多态的代码体现形式
        // 左侧父类的引用指向了右侧子类的对象
        cat.show();
//        System.out.println(cat.num);//会直接调用等号左边父类当中的成员变量num=19*/


/*
public class hello {
    public static void main(String[] args) {
        haha haha=new haha();
        haha.MyInterfaceDefault();
        haha.showNum();
        haha.show();
        System.out.println();
        System.out.println("\n你好 Java");
    }
}
*/




/*
public class hello {
    public static void main(String[] args) {
        double a = -10.8;
        double b = 5.9;
        int count=0;
        for (int i = (int) Math.ceil(a); i < (int) Math.ceil(b); i++) {
            int s = Math.abs(i);
            if (s>6||s<2.1){
                count++;
                System.out.print(i+"  ");
            }
        }
        System.out.println("共有："+count+"个");
        System.out.println("\n你好 Java");
    }
}
*/






/*
public class hello {
    public static void main(String[] args) {
        test t = new test();
        test s = new test();
        System.out.println();
        System.out.println("\n你好 Java");
    }

}

class test {
    public test() {
        System.out.println("构造方法执行");
    }

    static {
        System.out.println("静态代码块执行");
    }
}
*/





/*
//static关键字的运用
public class hello {
    public static void main(String[] args) {
        example e1 = new example("小黄", 20);
        System.out.println("姓名：" + e1.getName() + "\n年龄：" + e1.getAge() + "\n学号：" + e1.getSid());
        example e2 = new example("小白", 22);
        System.out.println("\n姓名：" + e2.getName() + "\n年龄：" + e2.getAge() + "\n学号：" + e2.getSid());
        example e3 = new example();
        e3.setName("小红");
        e3.setAge(21);
        System.out.println("\n姓名：" + e3.getName() + "\n年龄：" + e3.getAge() + "\n学号：" + e3.getSid());
        e3.setSid(5);
        System.out.println("\n姓名：" + e3.getName() + "\n年龄：" + e3.getAge() + "\n学号：" + e3.getSid());
        System.out.println();
        System.out.println("\n你好 Java");
    }
}

class example {
    private String name;
    private int age;
    private static int Sid;

    public example() {
        this.Sid = ++Sid; //无参构造，学号+1，实现自动编入学号功能
    }

    public example(String name, int age) {
        this.name = name;
        this.age = age;
        this.Sid = ++Sid; //全参构造，学号+1，实现自动编入学号功能
    }

    public static int getSid() {
        return Sid;
    }

    public static void setSid(int sid) {
        Sid = sid;
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

}
*/




/*
//统计输入的字符串中各种类型字符的出现次数
public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要判定的字符串：");
        String scanner1 = scanner.next();

        int a = 0;//小写字符
        int b = 0;//大写字符
        int c = 0;//数字字符
        int d = 0;//特殊字符

        //先进行分割其成为字符数组 chars
        char[] chars = scanner1.toCharArray();
        //判断chars 数组中的元素
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                a++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                b++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                c++;
            } else {
                d++;
            }
        }
        System.out.println("小写字母的个数为：" + a);
        System.out.println("大写字母的个数为：" + b);
        System.out.println("数字字符的个数为：" + c);
        System.out.println("特殊字符的个数为：" + d);
        System.out.println("\n你好 Java");
    }
}
*/


//String中 与转换有关的方法
/*
public class hello {
    public static void main(String[] args) {
//将字符串拆分成 单个字符 存入chars 数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);//5
//转换成为字节数组
        byte[] bytes = "Qwert".getBytes();
        System.out.println(bytes[0]);
//替换字符串中的内容
        String s1 = "hhhhhh,哈哈哈呵呵呵";
        String replace1 = s1.replace("哈", "呵");
        System.out.println("替换前：" + s1);
        System.out.println("替换后：" + replace1);
        String replace2 = s1.replace("h", "哈");
        System.out.println("替换前：" + s1);
        System.out.println("替换后：" + replace2);
//切割字符串
        String[] split1 = s1.split(",");
        System.out.println("切割后" + Arrays.toString(split1));
//特别注意，如果以“.” 作为切割标记，那么需要写成 //.
        System.out.println();
        System.out.println("\n你好 Java");
    }
}
*/


//截取复制其中一部分字符串 substring()方法
/*public class hello {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 =s1.substring(s1.indexOf("W"));
        System.out.println(s2);
        s2 = s1.substring(s1.indexOf("e"),s1.indexOf("oW")+1); //左闭右开区间
        System.out.println(s2);  //此时，开辟了新的内存空间存放新的字符串
        System.out.println("\n你好 Java");
    }
}*/





/*
//String中与获取相关常用的方法
public class hello {
    public static void main(String[] args) {
        //计算字符数
        int a = "qwertyuiop".length();
        System.out.println("有几个字符？  " + a);
        //拼接字符串,当然了 也可以使用 + 直接连接两个字符串
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1.concat(s2);
        System.out.println(s1 + "," + s2 + "," + s3);
        //获取指定索引（从0开始）位置的字符
        char ch1 = s1.charAt(2);
        char ch2 = s2.charAt(1);
        System.out.println("hello中的第3个字符：" + ch1 + "" + "\n" + "world中的第一个字符：" + ch2);
        //查询某字符在字符串中的位置，若没有，则返回-1值
        String s4 = "ufgauogafhohfhaifhhip";
        int f = s4.indexOf("fh");
        int x = s4.indexOf("x");
        System.out.println("查找：fh第一次出现的位置"+f);
        System.out.println("查找：x 第一次出现的位置"+x);
        System.out.println("\n你好 Java");
    }
}
*/






/*

public class hello {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = null;
        System.out.println(s1.equals("hello"));
        System.out.println("hello".equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1)); //编译错误,空指针异常
        System.out.println();//在编程中同时拥有常量和变量时要避免将变量放在前面
        System.out.println("你好 Java");

    }
}

*/








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