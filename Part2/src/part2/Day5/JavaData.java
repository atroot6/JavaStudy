package part2.Day5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * JDK 8 之前的日期和时间的API
 *java.sql.Date类 对应着数据库中的日期类型的变量
 *      如何将
 *
 * java.util.Date类
 *      两个方法
 *          toString() 显示当前的年 月 日 时 分 秒
 *          getTime()   获取当前Date对象对应的时间的毫秒值
 *      两个构造
 *          new Date()创建一个对应当前时间的Date对象
 *          new Date(long型的毫秒值)创建指定毫秒数的Date对象
 *
 *
 * DateFormat 是个 抽象类 无法进行直接创建对象来使用 但是可以使用其DateFormat类的子类 java.text.SimpleDateFormat extends DateFormat
 * 用来格式化时间
 * yyyy-MM-dd HH-mm-ss
 * 使用步骤
 * 1. 创建DateFormat对象(传入指定格式) yy-MM-dd  HH:mm:ss
 * 2. 利用对象进行调用format方法 并给format方法传参 这里的参数指的就是 我们拿到的毫秒级的数据
 */
public class JavaData {
    public static void main(String[] args) {
        //返回自1970年1月1日0时到目前的时间差 毫秒值  称为时间戳
        long time =System.currentTimeMillis();
        System.out.println(time);

        Date date = new Date(0); //创建当前时间的date对象
//        System.out.println(date.toString());
        System.out.println(date);
        long time1 = date.getTime(); //返回当前时间的毫秒值

        Date date1 = new Date(1612184771577L);
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd  HH/mm/ss");
        System.out.println(simpleDateFormat.format(date1));
    }
}
