package netWorkTest;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * className: TCPTest2<p>
 * description: 客户端发文件、服务端收文件且保存到本地
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.2 21:32
 */
public class TCPTest2 {
    @Test
    public void Server() {
        ServerSocket ss = null;
        InputStream is = null;
        BufferedOutputStream bos = null;
        try {
            ss = new ServerSocket(9999);
            Socket accept = ss.accept();
            is = accept.getInputStream();
            bos = new BufferedOutputStream(new FileOutputStream("QQ图片复制版.jpg"));
            int len;
            byte [] buffer = new byte[20];
            while ((len = is.read(buffer)) != -1){
                bos.write(buffer);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
            if (ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void Client() {
        BufferedInputStream bis = null;
        Socket socket = null;
        OutputStream os = null;
        try {
//        创建输入流
            bis = new BufferedInputStream(new FileInputStream("QQ图片.jpg"));
//        创建套接字对象
            InetAddress inet = InetAddress.getByName("localhost");
            socket = new Socket(inet, 9999);
//        创建输出流
            os = socket.getOutputStream();

            int len;
            byte[] buffer = new byte[20];
            while ((len = bis.read(buffer)) != -1) {
                os.write(buffer);
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        if (os != null){

            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bis != null){
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
