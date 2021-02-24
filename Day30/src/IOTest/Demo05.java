package IOTest;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * className: Demo05<p>
 * description: 实现文件的加密、解密操作
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.24 12:31
 */
public class Demo05 {
    //这里以对图片的加密为例
    @Test
    public void test01() {
        FileInputStream fis = null;
        FileOutputStream fos = null; //可以直接写String name
        try {
            fis = new FileInputStream(new File("QQ图片1.jpg"));
            fos = new FileOutputStream("QQ图片.jpg");

            byte[] buffer = new byte[5];
            int len;

            while ((len = fis.read(buffer)) != -1) {
                //对buffer中的数据进行加密操作
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
    //解密操作
    @Test
    public void test02() {
        FileInputStream fis = null;
        FileOutputStream fos = null; //可以直接写String name
        try {
            fis = new FileInputStream(new File("QQ图片.jpg"));
            fos = new FileOutputStream("QQ图片3.jpg");

            byte[] buffer = new byte[5];
            int len;

            while ((len = fis.read(buffer)) != -1) {
                //对buffer中的数据进行加密操作
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
