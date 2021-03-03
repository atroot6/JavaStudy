package ReflectionTest2;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * className: getInstanceTest<p>
 * description: 创建运行时类的对象
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.3 20:43
 */
public class getInstanceTest {
    /**
     * 我们在运行时创建对应的运行时类的对象，内部调用了运行时类的空参构造
     * <p>
     * 所以要想此方法能够正常的创建运行时类的对象，必须要求：
     * 1.运行时类必须保证存在空参构造器
     * 2.空参的构造器的访问权限必须得够得着，通常设置为public
     * <p>
     * 在javabean中也有类似的要求
     * 在Javabean中要求提供一个public的空参构造器，原因为：
     * 1.便于通过反射，创建运行时类的对象
     * 2.便于子类继承该类时，默认调用super()时，保证父类有此构造器，防止报错！
     */


//    classPath:指定类的全类名
    //定义一个能够返回指定运行时对象的方法
    public Object getInstance(String classPath) throws Exception {
        Class aClass = Class.forName(classPath);
        return aClass.newInstance();
    }

    @Test
    public void test01() throws Exception {
        Object instance = getInstance("ReflectionTest.person");
        Class aClass = instance.getClass();
        //getFields()获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("**************");
        //getDeclaredFields() 获取当前运行时类中声明的所有属性(不包含父类中声明的属性)
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
    }

    //权限修饰符、数据类型、变量名
    @Test
    public void test02() throws Exception {
        Object instance = getInstance("ReflectionTest.person");
        Class aClass = instance.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            //权限修饰符
            int modifiers = field.getModifiers();
            String s = Modifier.toString(modifiers);
            System.out.print(s + "\t");
            //变量名
            String name = field.getName();
            System.out.print(name + "\t");
            //数据类型
            Class type = field.getType();
            System.out.print(type + "\t");


            System.out.println();
        }
    }

    //方法和属性雷同
    @Test
    public void test03() throws Exception {
        Object instance = getInstance("ReflectionTest.person");
        Class aClass = instance.getClass();
        Method[] methods = aClass.getMethods(); //获取当前运行时类及其所有父类中声明为public权限的方法
        //获取当前运行时类中声明的所有方法，不包含父类中声明的方法
        Field[] declaredFields = aClass.getDeclaredFields();

    }

    @Test
    public void test04() throws Exception {
        Object instance = getInstance("ReflectionTest.person");
        Class aClass = instance.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        //获取方法声明的注解
        for (Method method :declaredMethods){
            Annotation[] annotations = method.getAnnotations();
            for (Annotation a : annotations){
                System.out.println(a);
            }
            //方法权限修饰符
            method.getModifiers();
            //返回值类型
            method.getReturnType();
            method.getReturnType().getName();
            //方法名
            method.getName();

            //形参列表
            Class[] parameterTypes = method.getParameterTypes();
            //遍历

            //抛出的异常
            Class [] exceptionTypes = method.getExceptionTypes();

        }

    }

}
