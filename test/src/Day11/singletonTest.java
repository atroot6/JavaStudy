package Day11;

public class singletonTest {
    /**
     * 单例设计模式
     * 1.单例模式，用一定的手段，使软件系统中，某个类只能存在一个对象实例
     * 提前就造好了对象
     * 缺点：加载时间过长
     * 优点：线城市安全的
     * 2.实现方法
     * 私有类的构造器
     */

    public static void main(String[] args) {
        test instance = test.getInstance();
    }
}

//饿汉式
class test {
    private test() { //私有化构造器

    }

    private static test t1 = new test(); //在类内部创建对象

    public static test getInstance() { //创建静态方法 获取到返回的唯一对象
        return t1;
    }
}