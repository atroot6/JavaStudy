package ObjectInputOutputStreamTest;

import org.junit.Test;

import java.io.*;

/**
 * className: ObjectStream<p>
 * description: 对象流的序列化
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.2 14:26
 */
public class ObjectStream {
    //对象流进行序列化（将对象写出到磁盘或者通过网络进行传输）
    //要求：1.对象类要进行实现 标识接口 Serializable (可序列化)，其中的属性也要实现(Serializable)
    //     2.对象类要进行标识号
    //注意： static 和 transient(短暂的) 修饰的成员变量不能被序列化

    @Test
    public void test01() {
        ObjectOutputStream oos = null;
        try {
//        创建文件输出流
            FileOutputStream fos = new FileOutputStream("test.dat");
//        创建对象输出流
            oos = new ObjectOutputStream(fos);
//        将对象进行写出
            oos.writeObject(new String("hello,world  你好 世界！"));
            oos.flush();
            oos.writeObject(new People("小王", 25));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//        进行关闭流操作
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test02() {
        ObjectInputStream ois = null;
        String str = null;
        People people = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("test.dat"));
            Object obj = null;
            Object o = null;
            try {
                obj = ois.readObject();
                o = ois.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            str = (String) obj;
            people = (People) o;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        if (ois != null) {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(str);
        System.out.println(people);
    }
}
