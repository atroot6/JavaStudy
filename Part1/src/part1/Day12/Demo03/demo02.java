package part1.Day12.Demo03;

public class demo02 extends demo03 implements demo01 {
public void method00(){
//    如何在实现类的方法中调用中父类、接口中被重写的方法
    demo01.super.method1();//在接口的实现类调用接口里的默认方法
    demo01.super.method2();
}
}
