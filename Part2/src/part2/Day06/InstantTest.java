package part2.Day06;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Instant类的使用
 * now()获取本初子午线对应的标准时间
 * 添加时间偏移量instant.atOffset
 * toEpochMilli 获取自1970年1.1 0：0:0开始计算的毫秒数
 *
 *
 */
public class InstantTest {
    @Test
    public void test() {
        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        long l = instant.toEpochMilli();
        System.out.println(l);

    }


}
