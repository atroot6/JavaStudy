package IOTest;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * className: Demo06<p>
 * description: WordCount
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.24 13:03
 */
public class WordCountTest {
    //实现文字技术功能（利用Map）
    @Test
    public void test01() {
        //创建一个Map，用来存储对应字符以及出现的次数
        Map<Character, Integer> map = new HashMap<>();
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //创建文件
            File file1 = new File("文字.txt");
            File file2 = new File("WordCount.txt");

            //创建流来处理文件，用字符流
            fr = new FileReader(file1);
            fw = new FileWriter(file2);

            //进行处理文件

            int len;
            while ((len = fr.read()) != -1) {
                char ch = (char) len;
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
            //对map进行遍历写出
            Set<Map.Entry<Character, Integer>> set = map.entrySet();

            Iterator<Map.Entry<Character, Integer>> iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry<Character, Integer> next = iterator.next();
                switch (next.getKey()) {
                    case ' ':
                        fw.write("空格：" + next.getValue());
                        break;
                    case '\t': //制表符Tab
                        fw.write("Tab" + next.getValue());
                        break;
                    case '\r': //回车
                        fw.write("回车：" + next.getValue());
                        break;
                    case '\n': //换行
                        fw.write("换行：" + next.getValue());
                        break;
                    default:
                        fw.write(next.getKey() + ":" + next.getValue());
                        break;
                }
                fw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

//            关闭流
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}