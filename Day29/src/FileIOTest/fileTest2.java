package FileIOTest;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * className: fileTest2<p>
 * description: 关于file的练习
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.2.21 10:35
 */
public class fileTest2 {
    @Test
    public void test01()  {
        File file = new File("file");
        boolean directory = file.isDirectory();
        if (directory) {
            System.out.println("目录已经存在");
        } else {
            boolean mkdir = file.mkdir();
            if (mkdir) {
                System.out.println("目录file已创建成功");
            }
        }


        File file1 = new File(file, "file1.txt");
        File file2 = new File(file, "file2.txt");
        File file3 = new File(file, "file3");
        File file4 = new File(file, "file4");

        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file3.mkdir();
        file4.mkdir();

        removeFile(file1);
        removeFile(file3);

    }

    @Test
    public void test02() {
        File file = new File("D:\\zyd\\Study\\ideaWorkSpace\\JavaStudy\\Day29");
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i].endsWith("jpg")) {
                System.out.println("已找到后缀为jpg的文件：" + list[i]);
            }
        }
    }
    //删除方法
    public boolean removeFile(File file) {
        boolean delete = file.delete();
        return delete;
    }
}