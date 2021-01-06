package RedPacket.New;

import java.util.ArrayList;

/*
红包新案例
1.普通红包
2.手气红包  最少1分钱  最多不超过平均数的2倍
 */
public class Start {
    public static void main(String[] args) {
        normalMode normalMode = new normalMode();
        ArrayList<Integer> mode = normalMode.Mode(20, 6);
        System.out.println(mode.toString());

    }

}
