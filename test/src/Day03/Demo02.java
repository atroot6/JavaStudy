package Day03;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Demo02 {
    /*
        System类
        System类属于java.lang包下  无需导包 可直接使用 被用于获取与系统相关的信息或者系统级操作

        public static long currentTimeMillis() 返回以毫秒为单位的当前时间

        arraycopy 的使用  public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
->
        src - 源数组。
        srcPos - 源数组中的起始位置。
        dest - 目标数组。
        destPos - 目标数据中的起始位置。
        length - 要复制的数组元素的数量。
    */
    public static void main(String[] args) {
//        demo01();
//        demo02();


    }

    private static void demo01() {
        long l1 = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long l2 = System.currentTimeMillis();
        l2 -= l1;
        System.out.println("程序运行共用了:" + l2 + "毫秒");
    }

    private static void demo02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
        System.out.println("====复制后====");
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));

    }
}
