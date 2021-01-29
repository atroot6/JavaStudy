package part1.com.RedPacket.Old;

import java.util.ArrayList;
import java.util.Random;

public class Member extends user {
    public Member(String name, int age, int money) {
        super(name, age, money);
    }

    public Member() {
    }

    //收红包
    public void receive(ArrayList<Integer> Redpacket) {
        int w = new Random().nextInt(Redpacket.size());
        int q = Redpacket.get(w);
        Redpacket.remove(w);
        Member.super.setMoney(q + Member.super.getMoney());
    }


}
