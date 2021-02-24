package CalendarAndDateTimeTest;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * 格式化 或 解析时间、日期
 * 类似于SimpleDateFormat
 */
public class DateTimeFormatterTest {
    @Test
    public void test() {
        LocalDateTime localDateTime = LocalDateTime.now();

        //方式一：预定义的标准格式
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化  日期-->字符串
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1); //2021-02-03T22:01:32.344
        String format = d1.format(date1);
        System.out.println(format); //2021-02-03T22:01:32.344
        System.out.println(d1); //ParseCaseSensitive(false)(Value(Year,4,10,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2))'T'(Value(Ho
        //解析
        TemporalAccessor parse = d1.parse("2021-02-03T21:50:09.970");
        System.out.println(parse); //{},ISO resolved to 2021-02-03T21:50:09.970

        //方式二：本地化相关的格式
        //本地化相关的格式。例如：ofLocalizedDateTime()
        //FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT : 适用于LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String format1 = dateTimeFormatter.format(localDateTime);
        System.out.println(format1); //21-2-3 下午9:58
        String format2 = dateTimeFormatter1.format(localDateTime);
        System.out.println(format2); //2021年2月3日 下午10时01分32秒
        String format3 = dateTimeFormatter2.format(LocalDate.now());
        System.out.println(format3); //2021年2月3日 星期三

        //方式三   自定义的格式 ofPattern("yyyy-MM-dd ......")
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String format4 = dateTimeFormatter3.format(localDateTime);
        System.out.println(format4); //2021.02.03 22:38:05

        //解析
        TemporalAccessor parse1 = dateTimeFormatter3.parse("2021.02.03 22:38:05");
        System.out.println(parse1); //{},ISO resolved to 2021-02-03T22:38:05
    }
}