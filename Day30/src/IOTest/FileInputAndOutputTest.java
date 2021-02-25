package IOTest;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * className: Demo02<p>
 * description: 利用FileInputStream等实现图片等类型文件的拷贝
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.23 17:46
 */
public class FileInputAndOutputTest {
    @Test
    public void test01() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建文件源，与目标文件
            File srcFile = new File("D:\\zyd\\QQ图片.jpg");
            File destFile = new File("QQ图片.jpg");

            //创建文件读取、写出流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //进行操作--文件拷贝
            byte[] buffer = new byte[5];
            int len; //用来记录读入的数据个数

            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //进行关闭文件读入、写出流
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
