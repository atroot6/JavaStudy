package netWorkTest2;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * className: URLTest<p>
 * description:
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.3 11:13
 */
public class URLTest {
    @Test
    public void test01(){
        BufferedOutputStream bos = null;
        InputStream is = null;
        try {
            //创建URL对象
            URL url = new URL("http://img01.jituwang.com/170503/256967-1F50310035695.jpg");
            //创建URLConnect连接  并将其强转为HttpURLConnect类型
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection hun = (HttpURLConnection) urlConnection;
            is = hun.getInputStream();
            bos = new BufferedOutputStream(new FileOutputStream("图片.jpg"));
            int len;
            byte [] buffer = new byte[100];
            while((len = is.read(buffer)) != -1){
                bos.write(buffer,0,len);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        if (bos != null){
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (is != null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
