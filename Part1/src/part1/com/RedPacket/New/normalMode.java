package part1.com.RedPacket.New;

import java.util.ArrayList;

public class normalMode implements OpenMode {


    @Override
    public ArrayList<Integer> Mode(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg=totalMoney / totalCount;  //用来均分红包
        int mod = totalMoney % totalCount; //用来抹零
        //开始包红包
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }
}
