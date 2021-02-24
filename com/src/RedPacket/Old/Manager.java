package RedPacket.Old;

import java.util.ArrayList;

public class Manager extends user {
    public Manager() {
    }

    public Manager(String name, int age, int money) {
        super(name, age, money);
    }

    //发红包功能实现
    public ArrayList<Integer> send(int total, int count) {
        ArrayList<Integer> Redpacket = new ArrayList<>(); //装包,定义一个集合用来存放红包
        int money = Manager.super.getMoney();//查看群主现在有多少钱

        if (money < total) {//判断钱是否够用来发红红包
            System.out.println("你个穷鬼，钱不够！");
            return Redpacket ;
        } else {
            int A = total / count;
            int y = total % count;
            for (int i = 0; i < count-1; i++) {
                Redpacket.add(A);
            }
            Redpacket.add(A+y);
            Manager.super.setMoney(money-total);
        }

        return Redpacket ;
    }

}
