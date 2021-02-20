package Demo01;

/**
 * 接口的应用 代理模式
 * 理解：
 * 现有网络接口  服务器（被代理类）   代理类
 * 服务器以及代理类 都实现接口->网络接口
 * 主要部分在代理类以及测试类上边做文章
 * 代理类里声明一个私有的接口类型的变量，并将其写入构造函数，将已经实现了接口的类的对象传入该变量
 * 通过该变量进行方法调用
 */
//测试类
public class netWorkTest {
    public static void main(String[] args) {
        System.out.println("设备1");
        Server server = new Server();  //创建一个服务器实例
        proxy p1 = new proxy(server); //将创建好了的服务器实例丢到代理器当中 代理期将调用对应的方法
        p1.NetWork();
        System.out.println("*************");
        System.out.println("设备2");
        computer computer = new computer();
        new proxy(computer).NetWork();
    }

}
