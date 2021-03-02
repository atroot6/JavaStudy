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
        Socket accept = null;
        InputStream is = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            ss = new ServerSocket(9999);
            accept = ss.accept();
            is = accept.getInputStream();
            bis = new BufferedInputStream(is);

            fos = new FileOutputStream("QQ图片复制版.jpg");
            bos = new BufferedOutputStream(fos);
            int len;
            byte[] buffer = new byte[1024];
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//        关闭
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
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
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void Cilent() {
        BufferedInputStream bos = null;
        Socket socket = null;
        OutputStream os = null;
        BufferedOutputStream bis = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File("QQ图片.jpg")));
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
            os = socket.getOutputStream();
            int len;
            byte[] buffer = new byte[20];

            while ((len = bos.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
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
