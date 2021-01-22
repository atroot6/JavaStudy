package Day10;

import org.junit.Test;

public class tTest1 {
    @Test
    public void test1() {
        Object o1 = false ? new Integer(1) : new Double(2);  //自动类型提升
        System.out.println(o1);

        System.out.println("***********");
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);     //这里new了两个新的对象 所以比较的其地址值是不相同的  ->false

        //true 原因在于 Integer内部定义了IngeterCache结构 ，IngeterCache中定义了Integer[]
        //其中保存了 -128 ~ 127 的整数 ，所以我们要用的时候会直接从缓存区里拿出来 而不用重新new
        System.out.println("************");
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        System.out.println("*************");
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}