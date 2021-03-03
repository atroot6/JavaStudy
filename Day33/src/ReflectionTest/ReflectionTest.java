package ReflectionTest;

import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * className: ReflectionTest<p>
 * description: 反射机制的概述以及基本使用测试
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.3 14:22
 */
public class ReflectionTest {
    /**
     * Reflection 反射，被视为动态语言的关键，反射机制允许程序直接接触Reflection API 直接取得任何类的内部信息、操作任意对象的内部属性和方法
     * 反射机制所提供的的功能
     * 在运行时判断任何一个对象所属的类
     * 在运行时构造任何一个类的对象
     * 在运行时判断任意一个类所具有的成员变量和方法
     * 在运行时获取泛型信息
     * 在运行时调用一个类所具有的成员变量和方法
     * 在运行时处理注解
     * 生成动态代理
     * <p>
     * 反射相关的主要API
     * java.lang.Class:代表一个类
     * java.lang.reflect.Method:代表类的方法
     * java.lang.reflect.Field:代表雷的成员变量
     * java.lang.reflect.Constructor:代表类的构造器
     * ......
     * <p>
     * 关于封装性与反射的理解
     * 封装性的目的在于建议你用什么、不建议用什么。而不是完全禁用
     * 反射，在运行时的任何位置都可以创造任何一个类的对象，调用其方法、修改其属性等操作
     * 关于反射的应用场景
     * 反射的应用场景在于，当程序已经启动，而程序启动之前，我们并不知道要创建哪个类的什么对象，在程序运行时来动态的创建对象的时候，就有了Class的用武之地
     * <p>
     * 类的加载过程
     * 程序经过javac.exe命令后，会生成一个或多个字节码文件(.class结尾)
     * 在经过java.exe命令对某个字节码文件进行解释运行，相当于某个字节码文件加载到内存中，此过程就称为类的加载，我们称之为运行时类，此运行时类，就是一个Class的实例
     */
    //获取Class实例的方式
    @Test
    public void test01() throws ClassNotFoundException {
        //1.调用运行时类的属性 .class
        Class<person> personClass = person.class;
        System.out.println(personClass);
        //2.通过运行时类的对象，调用getClass();
        person person = new person();
        Class aClass = person.getClass();
        System.out.println(aClass);
        //3.调用Class的静态方法: forName(String classPath)
        Class aClass1 = Class.forName("ReflectionTest.person");
        System.out.println(aClass1);

    }

    @Test
    public void test02() {
        //Class类可以说明的结构的类型
        Class<Object> objectClass = Object.class;
        Class<Comparable> comparableClass = Comparable.class;
        Class<String[]> aClass = String[].class;
        Class<int[][]> aClass1 = int[][].class;
        Class<ElementType> elementTypeClass = ElementType.class;
        Class<Override> overrideClass = Override.class;
        Class<Integer> integerClass = int.class;
        Class<Void> voidClass = void.class;
        Class<Class> classClass = Class.class;

        //只要元素类型、维度一样、就是同一个Class  那么在短时间内就会存在于混存起中，他们是同一个类

    }
}
