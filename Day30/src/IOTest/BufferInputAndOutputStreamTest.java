package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * className: bufferedTest<p>
 * description: 缓冲流的测试
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.23 20:09
 */
public class BufferInputAndOutputStreamTest {
    /**
     * 缓冲流，提高流的读取、写入速度
     */
    @Test
    public void test01() {
        long l2 = System.currentTimeMillis();
        NodeStream("QQ图片.jpg", "QQ图片1.jpg");
        long l3 = System.currentTimeMillis();
        System.out.println("成功拷贝，用时：" + (l3 - l2) + "ms");

        long l = System.currentTimeMillis();
        bufferedStream("QQ图片.jpg", "QQ图片2.jpg");
        long l1 = System.currentTimeMillis();
        System.out.println("成功拷贝，用时：" + (l1 - l) + "ms");
    }

    public void NodeStream(String src, String dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建文件源，与目标文件
            File srcFile = new File(src);
            File destFile = new File(dest);

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

    //基于buffer缓冲流的文件拷贝方法
    public void bufferedStream(String src, String dest) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //建立文件对应的对象
            File srcFile = new File(src);
            File destFile = new File(dest);

            //建立文件流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //开始进行操作:
            byte[] buffer = new byte[5];
            int len;

            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流：要注意的是，只需要关闭处理流buffer即可
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
