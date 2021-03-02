package netWorkTest;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * className: TCPTest<p>
 * description: TCP客户端服务端通信测试
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.2 20:59
 */
public class TCPTest {
    @Test
    public void Server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream is = null;
        try {
            //指定端口号
            serverSocket = new ServerSocket(9999);
            accept = serverSocket.accept();
            is = accept.getInputStream();

            int len;
            byte[] buffer = new byte[5];
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            while ((len = is.read(buffer)) != -1) {
                //不推荐这样写
                //String str = new String(buffer,0,len);  //会产生异常  当内容足够多时，会出现乱码
                //System.out.println(str);

                bao.write(buffer, 0, len);
            }
            System.out.println(bao.toString());  //当数据全部存入ByteArrayOutputStream中的数组时，统一对其进行转换并输出
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//        关闭资源
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void Client() {
        Socket socket = null;
        OutputStream ops = null;
        try {
            InetAddress inet = InetAddress.getByName("localhost");
            socket = new Socket(inet, 9999);

            ops = socket.getOutputStream();

            ops.write("hello i am Client".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ops != null){
                try {
                    ops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket !=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
