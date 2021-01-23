package Day12.USBexample;

public class Mouse implements USB {
    @Override
    public void turnOn() {
        System.out.println("打开设备--鼠标");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭设备--鼠标");
    }
    public void InPut(){
        System.out.println("鼠标输入！");
    }
}
