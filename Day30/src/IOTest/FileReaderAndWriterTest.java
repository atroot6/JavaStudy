package IOTest;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * className: FileReaderAndWriterTest<p>
 * description:
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.21 18:08
 */
public class FileReaderAndWriterTest {
    /**
     * File类声明在java.io包下
     * File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法，
     * 并未涉及到写入或读取文件内容的相关操作，如果需要读取或写入文件内容，必须使用IO流来完成
     * File的对象常会作为参数传递到流的构造器当中去，指明读取或写入文件的终点
     * <p>
     * 在IDEA中，
     * Junit的单元测试类的相对路径为当前module下，那么生成的文件、要读的文件，都应在module目录下
     * 而main()方法，对应的当前路径则为工程目录Project路径下
     * <p>
     * 在eclipse中:
     * main()方法和Junit单元测试类的相对路径都在当前工程目录Project下
     * <p>
     * 路径分隔符，windows和DOS系统默认使用"\"来表示   UNIX和URL使用 “/”来表示
     */
    //测试IO流
    /*流的体系结构，
     *抽象基类                          节点流（文件流）        缓冲流(处理流的一种)
     * InputStream(处理字节byte)       FileInputStream       BufferedInputStream   将字节流数据读入到内存
     * OutputStream                  FileOutputStream      BufferedOutputStream   将字节流数据写出到文件
     * Reader(处理字符char)           FileReader            BufferedReader          将字符流文件读入到内存
     * Writer                       FileWriter            BufferedWriter            将字符流文件写出到文件
     *
     * 结论: 对于文本文件(.txt\.java\.c\.cpp等)，需要使用字符流来处理
     *      对于非文本文件(.jpg\.mp3\.mp4\.doc等)，他们的底层为0 1数据，需要用字节流来处理
     */

    @Test
    public void test01() {
        //2.提供具体的流对象
        FileReader fr = null;
        try {
            //1.建立文件对象
            File file = new File("hello.txt");

            fr = new FileReader(file);
            //3.进行文件读取
            int len;
            while ((len = fr.read()) != -1) {
                System.out.print(len + " ");
                System.out.print((char) len + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (fr != null)  //防止空指针异常
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    //读数据到内存
    @Test
    public void test02() {
        FileReader fr = null;
        try {
            //利用数组进行读取数据操作
            File file = new File("hello.txt");
            fr = new FileReader(file);

            //进行读入操作
            char[] cBuffer = new char[5];  //构建一个char型数组用来读取字符  byte用来读取字节
            int len; //定义读取的字符的个数
            while ((len = fr.read(cBuffer)) != -1) {
                //方式一: 利用for循环遍历的方式进行读取数据
                //错误写法:直接对数组进行遍历,会将数组整个遍历，导致读取重复
                //            for (int i = 0; i < cBuffer.length; i++) {
                //                System.out.print(cBuffer[i]);
                //            }
                //正确写法:
                //            for (int i = 0; i < len; i++) {
                //                System.out.print(cBuffer[i]);
                //            }

                //方式二:  利用String的方法，将数组转化为String字符串进行输出
                //错误写法:
                //            String str = new String(cBuffer);
                //            System.out.print(str);
                //正确写法:
                String str = new String(cBuffer, 0, len);  //利用其构造器，指定读取的数组的个数，类似于上边
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (fr != null) //防止空指针异常
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    //从内存把数据写入文件
    //关于写数据流对象的构造器
    // 如果文件本身就存在的话：
    //    在构造器格式为：new File(""); \ new File("",false); 的情况下，那么写文件就会直接替换掉已经存在的文件
    //    在构造器格式为：new File("",true); 的情况下，那么就会在文件中续写文件
    @Test
    public void test03() {
        FileWriter fw = null;
        try {
            //创建文件对象，在写入时要注意，没有改文件则会在相对路径下创建，不会报异常
            File file = new File("hello1.txt");
            //创建写数据流对象
            fw = new FileWriter(file, true);
            //进行写数据
            fw.write("Hello World ! This is a test.\n");
            fw.write("Hello World ! This is a test.\n");
            fw.write("Hello World ! This is a test.\n");

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭写数据流
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    //实现文件拷贝功能(文本文件)
    @Test
    public void test04() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
//        创建文件对象
            File srcDocument = new File("hello1.txt");
            File destDocument = new File("D:\\zyd\\Study", "hello.txt");
//        创建文件读入、写出流对象
            fr = new FileReader(srcDocument);
            fw = new FileWriter(destDocument, true); //append： false为默认模式，意为直接覆盖  true则为在原有文件的基础上进行追加
//        进行文件读入、写出操作
            char[] src = new char[5];
            int len;
            while ((len = fr.read(src)) != -1) {
                try {
                    fw.write(src, 0, len);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//        关闭流
            if (fr != null )
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
