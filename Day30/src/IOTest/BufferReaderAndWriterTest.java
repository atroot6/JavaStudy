package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * className: BufferReaderAndWriterTest<p>
 * description: BufferReaderAndBufferWriter的测试类
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.23 23:59
 */
public class BufferReaderAndWriterTest {
    @Test
    public void test01() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("hello2.txt")));
            //方式一：
//            char[] buffer = new char[5];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                bw.write(buffer, 0, len);
//                bw.flush();
//            }
            //方式二：
            String buffer;
            while ((buffer = br.readLine()) != null) {  //一次性读取一行
                bw.write(buffer);  //默认情况下是不会换行的，这里可以手动加上换行 “\n” ，或者加上bw.newLine();
                bw.flush();
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}