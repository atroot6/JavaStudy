package part2.Day08;

import java.util.ArrayList;

/**
 * 三种基本注解  @Override \@Deprecated \@SuppressWarnings
 * 分别为:重写\过时\抑制警告
 *
 *
 */
@Deprecated
@MyAnnotation("dada")
@MyAnnotation("dada")
public class AnnotationTest {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        int num = 19;

        @SuppressWarnings({"rawtypes", "unused"})  //去除警告
        ArrayList arrayList = new ArrayList();
    }
}
