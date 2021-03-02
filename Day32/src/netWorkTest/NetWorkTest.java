package netWorkTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * className: NetWorkTest<p>
 * description: 网络编程部分
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.2 20:13
 */
public class NetWorkTest {
    /**
     *  IP：用于辨识网络上的唯一一台计算机
     *  端口：规定为计算机上一个16位的整数0 - 65535 用于标识正在计算机上运行的进程
     *  端口分类： 0-1023 公认端口 被预先定义好的服务通信占用(HTTP:80 FTP:21 Telnet:23)
     *           1024-49151 注册端口，分配给用户进程或者系统进程使用(Tomcat:8080 Mysql:3306 Oracle:1521)
     *           49152-65535 动态/私有端口
     *     端口与IP 的组合得出一个网络套接字Socket
     *  本机回路地址: 127.0.0.1 - localhost
     *
     *  Java中提供一个类用于获取ip : InetAddress
     *
     *  实例化InetAddress的两个方法 getByName()、getByLocalHost()
     *     两个常用方法  getHostName()、getHostAddress()
     *
     *  TCP/IP协议簇
     *    传输层中的两个重要的协议:
     *     TCP:传输控制协议
     *     UDP:用户数据报协议(User Datagram Protocol)
     *  TCP/IP以其两个主要协议：传输控制协议(TCP) 和网络控制协议(IP) 而得名，实际上是一组协议，包括多个具有不同功能且护卫关联的协议
     *   高效的四层体系结构
     *       物理链路层、IP层、传输层、应用层
     *   TCP：慢速、可靠、低效率，需要三次握手建立连接、释放连接等操作
     *   UDP：每个数据段限制在64K以内、不可靠传输、开销小、速度快、无需建立、释放连接
     */
    public static void main(String[] args) {
        try {
            //InetAddress
            InetAddress inet1 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet1); //www.baidu.com/14.215.177.39
            InetAddress inet2 = InetAddress.getByName("192.168.0.2");
            System.out.println(inet2);
            InetAddress inet3 = InetAddress.getByName("localhost");
            System.out.println(inet3); //localhost/127.0.0.1
            System.out.println("----------");
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);  //PC-ZYD/192.168.244.1  返回了主机名以及当前所在局域网分配的IP地址

            System.out.println(inet4.getHostAddress()); //192.168.244.1

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
