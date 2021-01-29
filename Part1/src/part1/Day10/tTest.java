package part1.Day10;

import org.junit.Test;

public class tTest {
    /**
     * 包装类的使用
     * Test基本应用
     * <p>
     * 基本数据类型、包装类型、String类的相互转化
     * JDK5.0 可以自动装箱自动拆箱
     */
    @Test
    public void test1() {
        int a = 20;
        Integer integer = new Integer(a);  // int ->  Integer
        System.out.println(integer.toString());
        System.out.println("*****************");
        Integer integer1 = new Integer("123"); //String(数字) -》 Integer
        System.out.println(integer1);
        System.out.println("*****************");

        /**包装类 -> 基本类型.
         *
         */
        Integer integer2 = new Integer(30);
        int i = integer2.intValue();
        System.out.println(i);
        System.out.println("*****************");
        int b = 40;
        Integer i1 = b;  //自动装箱
        boolean b1 = true;
        Boolean b2 = b1;

        System.out.println(i1); // 自动拆箱
        int num = i1;
        System.out.println(num);
        boolean b3 = b2;
        System.out.println(b2);

        System.out.println("*****************");
        /**
         * 基本类型 、 包装类型 --> String
         */
        //方式一 做连接运算
        int num1 = 10;
        String str1 = num1 + "";
        String str2 = "" + num1;
        System.out.println(str1.toString());
        System.out.println(str2.toString());

        System.out.println("*****************");
        //方式二 调用重载方法valueOf()
        float f1 = 5.6f;
        String s3 = String.valueOf(f1);
        System.out.println(s3.toString());

        System.out.println("*****************");
        /**
         * String -> 基本数据类型、包装类
         */
         String s = "123";
        Integer i2 = Integer.parseInt(s);
        System.out.println(i2.toString());

    }
}
