package RandomAccessFileTest;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * className: Test1<p>
 * description:RandomAccessFile 类 声明与java.lang包下但是继承于Object类 并实现了DataInput、DataOutput类  只允许以byte为单位的数据做输出输入
 * get FilePointer() 获取文件记录的当前指针的位置
 * void seek(lang pos) 将指针定位到pos的指定位置
 * 既可以满足读入操作也可以满足写出操作，即可读可写
 * <p>
 * 创建RandomAccessFile 类实例需要制定一个mode参数，对文件的访问权限进行限定
 * mode参数列表：r：以只读的方式打开
 * rw：打开以便读取和写入
 * rwd：打开以便读取和写入，同步文件内容更新
 * rws：打开以便文件的读取和写入，同步文件和元数据的更新
 * <p>
 * 构造器：
 * public RandomAccessFile(File file,String mode)
 * public RandomAccessFile(String name,String mode)
 * <p>
 * 当RandomAccessFile 作为输出流时，写出的文件如果不在的话，那么就会在执行的时候自动创建
 * 如果写出的文件是存在的话，会对源文件进行覆盖(默认情况下，从头覆盖)
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.2 16:04
 */
public class Test1 {
    @Test
    public void test01() {
        RandomAccessFile r = null;
        RandomAccessFile r1 = null;
        try {
            r = new RandomAccessFile("test1.txt", "r");
            r1 = new RandomAccessFile("test2.txt", "rw");
            byte[] buffer = new byte[2];
            int len;
            while ((len = r.read(buffer)) != -1) {
                r1.write(buffer, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (r1 != null) {
                try {
                    r1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test02() {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("test2.txt", "rw");
            raf.seek((new File("test2.txt").length())); //将指针移到对应的pos位置  索引
            raf.write("zzz".getBytes());  //默认情况下会从头对文件已有的内容进行覆盖 ,在进行一些操作后(StringBuilder)的操作后也可进行“插入”操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}