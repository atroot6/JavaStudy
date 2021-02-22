package FileIOTest;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * className: fileMethodTest2<p>
 * description: File类的常用方法二
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.20 20:21
 */
public class fileMethodTest2 {
    /*
     * public boolean isDirectory();  判断文件是否是文件目录
     * public boolean isFile();  判断是否是文件
     * public boolean exists();  判断文件是否存在
     * public boolean canRead();  判断文件是都可读
     * public boolean canWrite();  判断是都可写
     * public boolean isHidden();  判断是都隐藏
     *
     * public boolean createNewFile(); 创建文件，若文件存在，则返回false
     * public boolean mkdir();  创建文件目录，如果文件存在，就不会创建。若此文件的上层也不存在，则不创建
     * public boolean mkdirs();  创建文件目录，如果上层文件不存在，则一并创建
     * 注意：如果创建文件或文件目录没有写盘符，那么默认创建在项目路径下
     * public boolean delete();  删除文件或者文件夹,要注意的是Java中的删除，并不走回收站，而是直接删除！
     *
     */
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");
        if (!file.exists()){
            file.createNewFile();
            System.out.println("文件不存在，创建成功！");
        }else{
            file.delete();
            System.out.println("文件存在，删除成功！");
        }
    }

    @Test
    public void test2(){
        File file = new File("D:\\zyd\\Study\\Study1");
        boolean mkdir = file.mkdir();
        if (mkdir){
            System.out.println("创建成功！");
        }else{
            System.out.println("已存在,创建失败！");
            boolean delete = file.delete();
            System.out.println("已删除,可重新创建！");
        }
    }
}