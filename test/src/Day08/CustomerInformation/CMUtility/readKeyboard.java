package Day08.CustomerInformation.CMUtility;

import java.util.Scanner;

/**
 * 工具类
 */
public class readKeyboard {
    private char inputChar;
    private String inputString;
    private int inputInt;

    public readKeyboard() {
    }

    public char readChar() {
        return new Scanner(System.in).next().charAt(0);
    }

    public String readString() {
        return new Scanner(System.in).next();
    }

    public int readInt(){
        return new Scanner(System.in).nextInt();
    }
}
