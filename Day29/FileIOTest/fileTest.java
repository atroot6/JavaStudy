package FileIOTest;

import org.junit.Test;

import java.io.File;
import java.util.Date;

/**
 * className: FileTest
 * @author theoldzheng@163.com  @ZYD
 * @description 文件类File的使用
 * @create 2021.2.20 14:42
 */
public class fileTest {
    /*
     * 三种实例化File对象的方法
     *
     * File的三个构造器:
     *   File(String filePath) //可根据绝对路径、或者相对路径创建File对象
     *   File(String parentPath,String childPath) //可在指定目录下创建路劲或文件
     *   File(File parentFile,String childPath)  //在已有的File对象的路径之下创建路径或文件
     */
    @Test
    public void test01() {
        File file1 = new File("D:\\zyd\\Study\\ideaWorkSpace\\JavaStudy\\Part2");//    "\\"为反转义
        System.out.println(file1);

        File file2 = new File("D:\\zyd\\Study\\ideaWorkSpace\\JavaStudy\\Part2", "hello");
        System.out.println(file2);

        File file3 = new File(file2, "hi.txt");
        System.out.println(file3);
    }

    @Test
    public void test02() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\zyd\\Study\\ideaWorkSpace\\JavaStudy\\hi.txt");

        System.out.println(file1.getAbsoluteFile()); //D:\zyd\Study\ideaWorkSpace\JavaStudy\Part2\hello.txt
        System.out.println(file1.getPath()); //hello.txt
        System.out.println(file1.getName()); //hello.txt
        System.out.println(file1.getParent()); //null  只会在当前指定的hello.txt 相对路径下寻找
        System.out.println(file1.length());  //7
        System.out.println(new Date(file1.lastModified())); //Sat Feb 20 15:42:02 CST 2021


        System.out.println(file2.getAbsoluteFile()); //D:\zyd\Study\ideaWorkSpace\JavaStudy\Part2\hi.txt
        System.out.println(file2.getPath()); //D:\zyd\Study\ideaWorkSpace\JavaStudy\Part2\hi.txt
        System.out.println(file2.getName()); //hi.txt
        System.out.println(file2.getParent()); //D:\zyd\Study\ideaWorkSpace\JavaStudy\Part2
        System.out.println(file2.length());  //0  因为当前并无真实文件的存在，所以为0
        System.out.println(file2.lastModified()); //0
    }

    @Test
    public void test03() {
        File file = new File("D:\\zyd\\Study\\ideaWorkSpace\\JavaStudy");
        String[] list = file.list();
        for (String s: list){
            System.out.println(s);
        }
        System.out.println("**********");
        File file1 = new File("D:\\zyd\\Study\\ideaWorkSpace\\JavaStudy");
        File[] files = file1.listFiles();
        for (File file2:files) {
            System.out.println(file2);
        }
    }

}

