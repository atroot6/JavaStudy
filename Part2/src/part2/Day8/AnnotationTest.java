package part2.Day8;

import java.util.ArrayList;

/**
 *
 */
@Deprecated
public class AnnotationTest {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        int num = 19;

        @SuppressWarnings({"rawtypes", "unused"})  //去除警告
        ArrayList arrayList = new ArrayList();
    }
}
