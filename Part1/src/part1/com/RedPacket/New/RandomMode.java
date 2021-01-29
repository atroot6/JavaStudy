package part1.com.RedPacket.New;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> Mode(final int totalMoney,final int totalCount) {        //建立红包个数  totalCount
        //手气红包
        //随机分配,最少一分钱,最多不超过平均数的二倍
        ArrayList<Integer> list = new ArrayList<>(); //创建整形集合 list
        //创建随机生成器
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            int money = random.nextInt((leftMoney / leftCount) * 2) + 1;
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }
        return list;
    }
}
