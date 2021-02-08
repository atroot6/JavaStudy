package part2.Day6;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDate、LocalTime、LocalDateTime
 *
 */
public class DateTimeTestForJDK8 {

    @Test
    public void test(){
        //now() : 获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //Of(): 设置指定的年、月、日、时、分、秒，没有偏移量
        LocalDateTime ofDateTime = LocalDateTime.of(2020, 11, 11, 23, 56, 56);
        System.out.println(ofDateTime);

        //get() 方法 获取信息
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        //体现了不可变性 localDate  with设置相关的时间
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(18);
        System.out.println(localDateTime);//原来的时间 保持不变
        System.out.println(localDateTime1); //修改过日期后的时间

        //在当前的基础上 增加\减少时间
        LocalDateTime localDateTime2 = localDateTime.plusDays(2);

        LocalDateTime localDateTime3 = localDateTime.minusDays(2);
    }
}
