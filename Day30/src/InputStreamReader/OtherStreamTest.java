package InputStreamReader;

import org.junit.Test;

import java.io.*;

/**
 * className: OtherStreamTest<p>
 * description: 其他流的测试
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.25 13:13
 */
public class OtherStreamTest {
    @Test
    public void test01() {
        //测试标准输入输出流
        BufferedReader bufferedReader = null;
        try {
            InputStream in = System.in;
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            bufferedReader = new BufferedReader(inputStreamReader);

            while (true) {
                System.out.println("请输入字符：");
                String data = bufferedReader.readLine();
                if (("e".equalsIgnoreCase(data)) || "exit".equalsIgnoreCase(data)) {
                    System.out.println("The program is over！");
                    break;
                }
                String s = data.toUpperCase();
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //打印流  PrintStream 字节输出流  PrintWriter 字符输出流
    //其中提供了一系列的重载的print()，和println()
    @Test
    public void printStreamTest() {
        FileOutputStream fileOutputStream = null;
        try {
            //创建打印输出流，实现打印数据到控制台，或者改写到写入文件
            fileOutputStream = new FileOutputStream("D:\\zyd\\Study\\ideaWorkSpace\\JavaStudy\\Day30\\text.txt");

            //创建打印流,并将自动刷新模式设置为true：写入换行符或者'\n'时会自动刷新缓冲区
            PrintStream printStream = new PrintStream(fileOutputStream, true);

            if (printStream != null) { //把标准输出流改成文件输出
                System.setOut(printStream);
            }

            //用打印Ascii来做例子
            for (int i = 0; i < 255; i++) {
                System.out.print((char) i);
                if (i % 50 == 0)
                    System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //关闭流文件
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //数据流  DataInputStream  DataOutputStream
    //用于读取或写出基本类型数据类型的变量或字符串
    @Test
    public void DataOutputStream() {
        DataOutputStream dataOutputStream = null;
        try {
            //创建文件输出流
            FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            //创建数据流写出对象
            dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeUTF("张三");
            dataOutputStream.flush();
            dataOutputStream.write(22);
            dataOutputStream.flush();
            dataOutputStream.writeBoolean(true);
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        //关闭流
        if (dataOutputStream != null) {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void DataInputStream(){
        DataInputStream dataInputStream = null;
        String name = null;
        int age = 0;
        Boolean sex = null;
        try {
            //创建要读入文件的对象
            FileInputStream fileInputStream = new FileInputStream("data.txt");
            //创建数据流读入对象
            dataInputStream = new DataInputStream(fileInputStream);

            name = dataInputStream.readUTF();  //读取文件的顺序要和写入时的顺序保持一致
            age = dataInputStream.read();
            sex = dataInputStream.readBoolean();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        System.out.println("name:" + name + " age:" + age + " sex:" + sex);

        //关闭流
        if (dataInputStream != null){
            try {
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
