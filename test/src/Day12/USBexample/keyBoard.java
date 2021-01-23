package Day12.USBexample;

public class keyBoard implements USB {

    @Override
    public void turnOn() {
        System.out.println("打开设备--键盘");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭设备--键盘");
    }
    public void InPut(){
        System.out.println("键盘输入！");
    }
}
