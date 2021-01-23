package com.RedPacket.Old;

import java.util.ArrayList;

public class Rush {
    public static void main(String[] args) {
        Manager hlk = new Manager("黄龙康  ", 20, 1000);
        Member nie = new Member("聂诗璇  ", 21, 0);
        Member dbk = new Member("邓柏康  ", 22, 0);
        Member zyd = new Member("郑艳东  ", 23, 0);
        hlk.show();
        nie.show();
        dbk.show();
        zyd.show();
        ArrayList<Integer> redlist = hlk.send(50, 3);
        nie.receive(redlist);
        dbk.receive(redlist);
        zyd.receive(redlist);
        System.out.println("==========接受红包后=========");
        hlk.show();
        nie.show();
        dbk.show();
        zyd.show();


    }


}
