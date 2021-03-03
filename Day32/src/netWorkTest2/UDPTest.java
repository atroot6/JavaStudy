package netWorkTest2;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * className: UDPTest<p>
 * description:
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.3 10:40
 */
public class UDPTest {
    @Test
    public void Sender(){
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            String str = "UDP数据发送成功！";
            byte[] bytes = str.getBytes();
            InetAddress inet = InetAddress.getLocalHost();
            DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,inet,9999);
            ds.send(datagramPacket);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        ds.close();

    }
    @Test
    public void Receive(){
        DatagramSocket datagramSocket = null;
        DatagramPacket datagramPacket = null;
        try {
            datagramSocket = new DatagramSocket(9999);
            byte [] buffer = new byte[100];
            datagramPacket = new DatagramPacket(buffer,0,buffer.length);
            datagramSocket.receive(datagramPacket);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        String s = new String(datagramPacket.getData(),0,datagramPacket.getLength());
        System.out.println(s);
        datagramSocket.close();
    }
}
