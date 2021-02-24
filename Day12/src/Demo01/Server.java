package Demo01;

/**
 * 设备一 服务器连接网络
 * 负责 准备提供一个 服务器实例
 */
class Server implements interfaceTest {  //服务器实现接口

    @Override
    public void NetWork() { // 网络功能
        System.out.println("服务器网络已连接 正在正常工作！");
    }
}