package chatattcp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            //创建一个服务器端口号
            ServerSocket serverSocket = new ServerSocket(2020);
            while (true) {
                Socket accept = serverSocket.accept(); //创建接受
                InputStream inputStream = accept.getInputStream(); //接收流
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//输出
                byte[] buffer = new byte[2020];//定义数组存放数据
                inputStream.read(buffer);//把接收的信息放入buffer
                byteArrayOutputStream.write(buffer, 0, buffer.length - 1);
                System.out.println(byteArrayOutputStream.toString());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
