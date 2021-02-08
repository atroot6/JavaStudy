package part2.Day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * JDK 8 之前的日期和时间的API
 * java.sql.Date类 对应着数据库中的日期类型的变量
 * sql类与util类的
 * <p>
 * java.util.Date类
 * 两个方法
 * toString() 显示当前的年 月 日 时 分 秒
 * getTime()   获取当前Date对象对应的时间的毫秒值
 * 两个构造
 * new Date()创建一个对应当前时间的Date对象
 * new Date(long型的毫秒值)创建指定毫秒数的Date对象
 * <p>
 * <p>
 * DateFormat 是个 抽象类 无法进行直接创建对象来使用 但是可以使用其DateFormat类的子类 java.text.SimpleDateFormat extends DateFormat
 * 用来格式化时间
 * yyyy-MM-dd HH-mm-ss
 * 使用步骤
 * 1. 创建DateFormat对象(传入指定格式) yy-MM-dd  HH:mm:ss
 * 2. 利用对象进行调用format方法 并给format方法传参 这里的参数指的就是 我们拿到的毫秒级的数据
 */
public class JavaData {
    public static void main(String[] args) throws ParseException {
        //返回自1970年1月1日0时到目前的时间差 毫秒值  称为时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);

        Date date = new Date(); //创建当前时间的date对象
//        System.out.println(date.toString());
        System.out.println(date);
        long time1 = date.getTime(); //返回当前时间的毫秒值

        Date date1 = new Date(1612184771577L);
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        String format = simpleDateFormat.format(date1);
        System.out.println(format);
        String format1 = simpleDateFormat1.format(date1);
        System.out.println(format1);

        //解析
        //将要进行解析的字符串(符合要求类型的)，赋给SimpleDateFormat对象的parse方法在做参数
        //但是，如果其对象有格式初始化，就需要对字符串做出相同的字符串格式要求
        Date parse = simpleDateFormat.parse(format);
        System.out.println(parse);

        String date2 = "2020-09-08";
        //将util下的Date转换为sql下的Date   进行强转
        Date date4 = new java.sql.Date(561455532154l);
        java.sql.Date date3 = (java.sql.Date) date4;
        System.out.println(date3);

    }
}