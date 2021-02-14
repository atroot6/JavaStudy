package part2.Day07;

import org.junit.Test;


public class SystemTest {
    /**
     * System等常用类的使用
     */
    @Test
    public void test1(){
        String version = System.getProperty("java.version");
        String home = System.getProperty("java.home");
        String name = System.getProperty("os.name");
        String version1 = System.getProperty("os.version");
        String name1 = System.getProperty("user.name");
        String home1 = System.getProperty("user.home");

        System.out.println(version);
        System.out.println(home);
        System.out.println(name);
        System.out.println(version1);
        System.out.println(name1);
        System.out.println(home1);

    }

    /**
     * Math类
     * java.long.Math 提供了一系列静态方法用于科学计算，其方法的参数和返回值类型一般为double
     * 略
     */
    /**
     *
     */
}
