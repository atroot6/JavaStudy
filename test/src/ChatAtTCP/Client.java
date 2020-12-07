package ChatAtTCP;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            InetAddress byAddress = InetAddress.getByName("127.0.0.1");
            int port = 2020; //端口号
            Socket socket = new Socket(byAddress,port);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("这是一个测试内容！ This is a test.".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
