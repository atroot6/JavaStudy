package part1.com.example01;

public interface MyInterface {
    public abstract void show();
    public static final int NUM =100; //接口中定义的常量可以省略前面的三个关键字

    public default void MyInterfaceDefault(){
        System.out.println("这是一个默认方法！");//接口实现类不用做任何操作，可直接调用
//        接口实现类可以对默认方法进行重写，如果不重写那么，在调用时就直接向上寻找接口中的方法
    }
}

