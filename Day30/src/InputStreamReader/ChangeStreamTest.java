package InputStreamReader;

import org.junit.Test;

import java.io.*;

/**
 * className: Demo01<p>
 * description: 处理流中的：转换流：字节流转换为字符流，字符流转换为字节流
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.24 19:13
 */
public class ChangeStreamTest {
    //文本文档写入内存时，我们可以采用字节流读取到内存，再利用InputStreamReader来转换为字符流
    @Test
    public void test01() {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            //创建文件、流
            FileInputStream fis = new FileInputStream("WordCount.txt");
            FileOutputStream fos = new FileOutputStream("WordCountTest-gbk.txt");
            //创建处理流，转换对应的文件流
            isr = new InputStreamReader(fis, "UTF-8"); //将字节流转换为字符流,默认转换为UTF-8
            osw = new OutputStreamWriter(fos, "gbk"); //将字节流转换为字符流

            //读取到内存
            char[] buffer = new char[5];
            int len;
            while ((len = isr.read(buffer)) != -1) {
                //String str = new String(buffer,0,len);
                //System.out.println(str);OutputStreamWriter osw = new OutputStreamWriter(fis);
                for (int i = 0; i < buffer.length; i++) {
                    System.out.print(buffer[i]);
                }
                osw.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}