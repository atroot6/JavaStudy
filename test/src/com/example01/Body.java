package com.example01;

/**
 * 成员内部类
 * 局部内部类（包含匿名内部类）
 * 局部内部类,顾名思义 是局部的 是出了某个区域就不能使用了的 ,一般是定义在一个方法里的
 * 注意：内用外，可以随意访问调用，外用内，则需要内部类对象来间接调用
 * 调用方式
 * 1.通过外部类的外部方法进行间接调用
 * 2.直接new 一个 内部类出来
 * 基本格式如下  外部类.内部类  对象名  =  new 外部类().new 内部类();
 * 对象名.方法();
 * 成员变量的重名现象
 * <p>
 * 类的权限修饰符 界限
 * public>protected>(default)>private
 * 1.外部类:只能使用public 或者default
 * 2.成员内部类:四种修饰符都可以使用
 * 3.局部内部类:(default)
 * 局部内部类的注意事项: 当局部内部类要调用外部类的常量时,可以直接调用,但是保证它是有效的final常量
 * 重点 内部类  匿名内部类
 * 例如 接口中  实现接口使用匿名内部类
 * 格式:  接口名  对象名  =  new 接口名(){
 *   里边要覆写所有的抽象方法
 * }; //末尾的分号不能丢掉
 */
public class Body { //外部类
    String name = "小明";


    public class heart {  //成员内部类
        String name = "小黄";

        public void beat() {    //内部类的方法
            String name = "小绿";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Body.this.name); //用来调用 外部类的成员变量的格式
//            System.out.println("This is a internalClass");
//            System.out.println(name);//调用外部类
        }

    }

    public void methodBody() {  //外部类方法
        System.out.println("This is a externalClass");
//        new heart().beat();  //通过外部方法间接调用该内部类
    }

    public static void main(String[] args) {
//        new Body().methodBody();
        new Body().new heart().beat();
//        Body.heart heart = new Body().new heart();
//        heart.beat();
    }
}
