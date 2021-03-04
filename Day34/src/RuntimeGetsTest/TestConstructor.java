package RuntimeGetsTest;

import ReflectionTest.person;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * className: TestConstructor<p>
 * description: 获取指定的构造器
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.4 20:31
 */
public class TestConstructor {
    @Test
    public void test01() throws Exception {
        //获取指定的构造器 getDeclaredConstructor()  参数: 指明构造器的参数列表
        Class<person> clazz = person.class;
        Constructor<person> constructor = clazz.getDeclaredConstructor();

        //保证此构造器是可被访问的
        constructor.setAccessible(true);

        //调用此构造器创建运行时类的对象
        person person = constructor.newInstance();
        System.out.println(person);


    }

}
