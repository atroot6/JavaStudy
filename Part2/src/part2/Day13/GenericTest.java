package part2.Day13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * className: GenericTest
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 泛型的使用，JDK1.5+的新特性，所谓泛型，就是允许在定义类、定义接口的时候通过一个标识
 * 来表示类中某个属性的类型或者是某个方法的返回值以及参数类型，这个类型参数将在使用的时候(例如继承或实现这个接口的，用这个类型声明变量、创建对象时)
 * 确定(即传入实际的类型参数，也称为类型实参)
 * <p>
 * 集合接口或集合类在JDK5.0时都修改为带泛型的结构
 * 在实例化集合类时，可以指明具体的泛型类型
 * 在指明以后，在集合类或接口中凡是定义类或接口时，其内部结构(比如方法、构造器、属性等)都将收到泛型的约束
 * 泛型必须都是类、不能是基本数据类型，需要基本数据类型的，必须用其包装类替换
 * 如果实例化，没有指明泛型的类型，那么默认类型将为Object --- java.lang.Object
 *
 * 注意：1.泛型类可能会有多个参数，<E1,E2,E3..>
 *      2.泛型类的构造器不用加括号，但是其实例化时，要根据需要增加泛型类型
 *      3.泛型不同的应用不能相互赋值
 *      4.泛型如果不指定，将被擦出，反省对应的类型均按照Object来处理,但是不等于Object
 *      5.泛型，要么一路用，要么一路不用。
 *      6.如果泛型类是一个接口或者抽象类，则不可创建泛型类的对象
 *      7.在静态方法中不能使用类的泛型
 *      8.异常类不能是泛型的
 *      9.不能使用new E []，但是可以使用 E [] elements = (E []) new Object[capacity];
 *
 * @create in 2021.2.18 9:07
 */
public class GenericTest {
    @Test
    public void test01() {
        EmployeeTest e1 = new EmployeeTest("王强", 22, 1001);
        EmployeeTest e2 = new EmployeeTest("张璋", 19, 1002);
        EmployeeTest e3 = new EmployeeTest("李长超", 56, 1003);
        EmployeeTest e4 = new EmployeeTest("洪涛", 23, 1004);
        TreeSet<EmployeeTest> ept = new TreeSet<>();
        ept.add(e1);
        ept.add(e2);
        ept.add(e3);
        ept.add(e4);

        Iterator<EmployeeTest> iterator = ept.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test02() {
        //如果定义了泛型而没有使用，则认为其为Object类型
        //要求，若定义了泛型就要使用
        Employee1 epy2 = new Employee1("小lan", 23, "");
        epy2.setAge(123);
        epy2.setName("aaa");

        Employee1<String> epy1 = new Employee1<String>("小红", 23, "可以作为对对象的描述");
        epy1.setT("我是小红！");


    }

    @Test
    public void test03() {//这里将会有两种情况，是在继承自定义泛型类的时候，是否将本类指定为泛型类
        //1.其一，父类指定但是本类不指定，那么该类将将不再是泛型类
        subEmployee subEmployee = new subEmployee();
        subEmployee.setT(23); // 因为在继承的时候指定了 其泛型类型为Integer
        //2.其二，父类指定，本类也指定，本类继续为泛型类
        subEmployee1<Integer> sey = new subEmployee1<Integer>();
        sey.setT(22);
    }

    //测试调用定义的泛型方法，声明:泛型方法与其所属类是否为泛型类没有关系
    @Test
    public  void test04(){
        subEmployee subEmployee = new subEmployee();
        Integer [] integers = new Integer[]{1,2,3,4};

        List <Integer> list = subEmployee.example(integers);

        System.out.println(list);
    }


}
