package part1.Day02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    /**
     * get time 方法用于获取当前系统时间的毫秒值(从1970.1.1 00:00:00 到现在为止的毫秒值) 相当于 System.currentTimeMillis()
     * DateFormat 是个 抽象类 无法进行直接创建对象来使用 但是可以使用其DateFormat类的子类 java.text.SimpleDateFormat extends DateFormat
     * 用来格式化时间
     * yyyy-MM-dd HH-mm-ss
     * 使用步骤
     * 1. 创建DateFormat对象(传入指定格式) yy-MM-dd  HH:mm:ss
     * 2. 利用对象进行调用format方法 并给format方法传参 这里的参数指的就是 我们拿到的毫秒级的数据
     */

    public static void main(String[] args) {
//    System.out.println(System.currentTimeMillis());
//    Date date = new Date(0); //东八区 在原点时间的基础上加8个小时
//    System.out.println(date);
//    date = new Date(1610250681539L); //传入long类型的值
//    System.out.println(date);//Date类重写了 toString方法
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        String f1 = s1.format(new Date());
        String f2 = s2.format(new Date());
        System.out.println(f1);
        System.out.println(f2);




    }
}