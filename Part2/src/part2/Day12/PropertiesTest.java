package part2.Day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * className: PropertiesTest
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description Hashtable的子类Properties, Properties常用来处理配置文件，key和value都是String类型
 * @create in 2021.2.16 23:23
 */
public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fis = null; //创建文件输入流，并初始化
        try {
            Properties pros = new Properties(); //创建对象
            fis = new FileInputStream("JDBC.properties");
            pros.load(fis); //加载文件

            String name = pros.getProperty("name"); //key-value的类型都是String
            String password = pros.getProperty("password");
            System.out.println("name：" + name + ",密码：" + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fis != null) {
                try {
                    fis.close(); //关闭输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
