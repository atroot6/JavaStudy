package part1.Day12.Demo03;

/**
 * JDK 8:新特性 除了可以定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 *
 */
public interface demo01 {

    public static void method() { //静态可以写方法体
        System.out.println("这是一个静态方法");
    }

    public default void method1() { //默认方法
        System.out.println("这是一个默认方法");
    }

    public default void method2(){
        System.out.println("这是第二个默认方法");

    }

}
