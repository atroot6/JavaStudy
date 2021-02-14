package part2.Day06;

import org.junit.Test;

import java.util.Calendar;

/**
 * 日历类的使用
 * Calendar
 * 实例化
 * 1.创建其子类（GregorianCalendar）的对象
 * 2.调用其静态方法getInstance() 返回一个Calendar类的对象
 * 常用方法：
 * getTime() 日历类——>Date
 * setTime() Date——>日历类
 * get()
 * set()
 * add()
 */
public class CalenderTest {
    @Test
    public void test1() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        calendar.set(Calendar.DAY_OF_YEAR, 18);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

    }

}
