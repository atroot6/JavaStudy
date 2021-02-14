package part2.Day06;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 练习
 */
public class SimpleDateFormatTest {
    //字符串 转换为 java.sql.Date
    @Test
    public void test1() throws ParseException {
        //将一个字符串转换为一个sql类的Date
        String s1 = "2020-09-08";
        SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = spd.parse(s1);
        System.out.println(parse);

        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);
    }
}