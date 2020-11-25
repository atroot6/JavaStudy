package USBexample;

public class NoteBook {

    public void powerON() {
        System.out.println("笔记本电源已经打开");
    }

    public void powerOFF() {
        System.out.println("笔记本电源已经关闭");
    }

    public void Device(USB usbDevice) {
        usbDevice.turnOn();
        if (usbDevice instanceof keyBoard) {
            keyBoard jianpan = (keyBoard) usbDevice;

            jianpan.InPut();

        } else if (usbDevice instanceof Mouse) {
            Mouse shu = (Mouse) usbDevice;

            shu.InPut();

        }

        usbDevice.turnOff();

    }
}
