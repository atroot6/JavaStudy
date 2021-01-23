package Day12.Demo01;

/**
 * 代理类
 * 代理类里声明一个私有的接口类型的变量，并将其写入构造函数，将已经实现了接口的类的对象传入该变量
 */
class proxy implements interfaceTest {   //代理
    private interfaceTest i1;

    public proxy(interfaceTest i1) {
        this.i1 = i1;
    }

    private void check() {
        System.out.println("联网前检查操作！");
    }

    @Override
    public void NetWork() {
        check();
        i1.NetWork();
    }
}