package testForArray2;
// 失败品----
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int [] totalMoney = new int[20];
        totalMoney[0] = 2000;
        String [] kind_Of_money =new String[20]  ; //收支类型
        int[] inMoney = new int[20];        //收入金额
        int[] outMoney =new int[20] ;  //支出金额
        int x = 0; //记录寄了几次账本
        String[] kind_Statement = new String[20];  //说明
        int y = 0; //收入
        int f = 0; //支出
        int b = 0; // 控制循环是否执行
        while (b == 0) {
            System.out.println("***********************");
            System.out.println("********记账系统********");
            System.out.println("******1.收支明细********");
            System.out.println("******2.登记收入********");
            System.out.println("******3.登记支出*********");
            System.out.println("******4.退出系统*********");
            System.out.println("*********请选择!*********");
            int a = new Scanner(System.in).nextInt();
            switch (a) {
                case 1:
                    System.out.println("************欢迎进入明细查询系统************");
                    System.out.println("收支类型**账户总金额**收支金额**说明**");
                    for (int i = 0; i < x; i++) {
                        if (kind_Of_money[i].equals("收入")) {
                            System.out.println(kind_Of_money[i] + "     " + (totalMoney[i]-inMoney[i]) + "       " + inMoney[i] + "      "+kind_Statement[i]);
                        }
                        if (kind_Of_money[i].equals("支出")) {
                            System.out.println(kind_Of_money[i] + "     " + (totalMoney [i]+ outMoney[i] )+"          " + outMoney[i] + "      "+kind_Statement[i]);

                        }
                    }
                    continue;
                case 2:
                    kind_Of_money[y]= "收入";

                    System.out.println("登记收入:");
                    System.out.println("请输入收入说明:");
                    kind_Statement [y] = new Scanner(System.in).next();
                    System.out.println("请输入收入金额:");
                    inMoney [y] = new Scanner(System.in).nextInt();
                    totalMoney[y] = totalMoney[y] + inMoney[y];
                    y++;
                    x++;
                    continue;
                case 3:
                    kind_Of_money[y]= "支出";

                    System.out.println("登记支出:");
                    System.out.println("请输入支出说明:");
                    kind_Statement [y] = new Scanner(System.in).next();
                    System.out.println("请输入支出金额:");
                    outMoney [y] = new Scanner(System.in).nextInt();
                    totalMoney[y] = totalMoney[y] - outMoney[y];
                    y++;
                    x++;
                    continue;
                case 4:
                    System.out.println("你确定退出吗? 请输入0取消或者1确定退出");
                    int c = new Scanner(System.in).nextInt();
                    if (c == 0) {
                        System.out.println("请重新选择:");
                        continue;
                    }
                    if (c == 1) {
                        System.out.println("已退出!");
                        b++;
                        break;
                    }
                default:
                    System.out.println("输入错误!");
                    continue;

            }
        }


    }

}

/*
        int c = 10;
        int d = 10;
        for (int i = 0; i < 20; i++) {
            c = c * 2;
        }
        System.out.println(c);
        System.out.println(d<<20);
        */

/*      int b = 11;
        int c = 20;
        if (a == b & a == (c++)) {
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);
        System.out.println(b);
        */