package ReflectionTest;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * className: LoadProperties<p>
 * description: 加载配置文件的两种方式
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.3 16:47
 */
public class LoadProperties {
    @Test
    public void test01(){
        //读取配置文件
        //方式一：默认识别在当前Module下
        Properties properties = new Properties();
//        try {
//            FileInputStream fis = new FileInputStream("JDBC.properties");
//
//            properties.load(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//        }

        //方式二使用ClassLoader: 默认识别在当前Module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("JDBC1.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String name = properties.getProperty("name");
        String password = properties.getProperty("password");

        System.out.println(name + "=" + password);


    }
}