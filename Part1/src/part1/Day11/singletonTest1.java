package part1.Day11;

/**
 * 单例模式的懒汉式实现
 * 懒汉式 用的时候采取造对象
 * 缺点：线程不安全
 * 优点：延迟对象的创建
 */
public class singletonTest1 {
    public static void main(String[] args) {

    }
}

class test1 {

    //私有化构造器

    private test1() {
    }

    //创建test1类型 变量t2
    private static test1 t2 = null;

    public static test1 getInstance() {
        if (t2 == null) {
            t2 = new test1();
        } else {
            return t2;
        }
        return t2;
    }
}