package Day12.USBexample;

import java.util.Scanner;

public class RunIt {
    public static void main(String[] args) {
        //先新建一个电脑
        NoteBook computer = new NoteBook();
        computer.powerON();
        Scanner a = new Scanner(System.in);
        System.out.println("输入1为插入键盘，2为鼠标！");
        int b = a.nextInt();
        switch (b) {
            case 1:

                Mouse m = new Mouse();
                computer.Device(m);
                break;
            case 2:

                keyBoard k = new keyBoard();
                computer.Device(k);
                break;
            default:
                break;
        }
        computer.powerOFF();

//        computer.powerOFF();


    }
}
