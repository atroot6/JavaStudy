package RuntimeGetsTest;

import ReflectionTest.person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * className: TestField<p>
 * description: 测试
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.4 19:36
 */
public class TestField {
    @Test
    public void test01() throws Exception{
        Class<person> clazz = person.class;
//        创建运行时类的对象
        person person = clazz.newInstance();

        //获取指定的属性:要求运行时类中属性声明为public
        Field id = clazz.getField("id");
        System.out.println(id);


        //设置当前属性值
//        set():参数一:指明调用者是哪个对象，参数二:将此属性设置为某个值
        id.set(person,55);

        //获取当前属性的值
//        get(): 参数: 获取哪个对象的属性值
        int pId = (int) id.get(person);
        System.out.println(pId);
    }

    @Test
    public void test02() throws Exception {
        Class<person> clazz = person.class;

        //创建对象
        person person = clazz.newInstance();

        //获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");

        //保证当前属性是可访问的
        name.setAccessible(true);
        //获取、设置指定对象的此属性值
        name.set(person,"Jerry");
        System.out.println(name.get(person));


    }
    @Test
    public void test03() throws Exception {
        Class<person> clazz = person.class;

        //创建对象
        person person = clazz.newInstance();

        //获取指定的某个方法 getDeclaredMethod() : 参数一：指明获取的方法的名称 参数2： 指明获取方法的形参列表
        Method showTest = clazz.getDeclaredMethod("showTest", String.class, int.class);

        //访问通道打开，保证当前方法可以被访问
        showTest.setAccessible(true);

        //通过方法的invoke()来调用
        showTest.invoke(person,"abcde",121212);
    }

    @Test
    public void test04() throws Exception {
        Class<person> clazz = person.class;

        //创建对象
        person person = clazz.newInstance();

        //调用静态方法
        Method staticMethodTest = clazz.getDeclaredMethod("staticMethodTest");
        //确保能被调用
        staticMethodTest.setAccessible(true);

        //开始调用
        Object invoke = staticMethodTest.invoke(person.class);
        System.out.println(invoke);




    }

}
