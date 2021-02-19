package part2.Day14;

import org.junit.Test;

import java.util.List;

/**
 * className: test01
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 有界限的通配符使用
 * @create in 2021.2.19 16:59
 */
public class test01 {
    /**
     * 有限制的通配符的使用
     *    ? extends A:
     *          G<? extends A> (无穷小,A]
     *    ?  super A:
     *          G<? super  A>  [A,无穷大)
     *
     */
    @Test
    public void test1(){
        List<? extends personTest> list1 = null;  //(无穷小,personTest]
        List<? super personTest> list2 = null;  //[personTest,无穷大)

        List<studentTest> list3 = null;
        List<personTest> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
//        list1 = list5;  编译报错！

//        list2 = list3;
        list2 = list4;
        list2 = list5;

//        读取数据
        list1 = list3;
        personTest personTest0 = list1.get(0); //只看上边继承的(list1，只能是大于等于personTest) personTest,最小只能是person

        list1 = list4;
        personTest personTest = list1.get(0);

        list2 = list4;
        Object object = list2.get(0); //大于等于person，为了防止person不够，索性只能使用Object

//        写入数据
//        list1.add(new studentTest());  编译出错，不允许有 低的 赋给 高的情况的存在

        list2.add(new personTest()); //允许比person小的子类以及person，
        list2.add(new studentTest());
    }

}
