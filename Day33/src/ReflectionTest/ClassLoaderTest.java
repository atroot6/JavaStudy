package ReflectionTest;

import org.junit.Test;

/**
 * className: ClassLoader<p>
 * description: 类加载器
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.3 16:39
 */
public class ClassLoaderTest {
    //加载器
    @Test
    public void test01(){
        //对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //调用扩展类的类加载器的getParent()：获取扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        //调用扩展类的加载器的getParent(); 无法获取引导类加载器
        //引导类加载器主要负责加载java的核心类库，无法加载自定义类的
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); //null

        ClassLoader aClass = String.class.getClassLoader();
        System.out.println(aClass); //null
    }
}
