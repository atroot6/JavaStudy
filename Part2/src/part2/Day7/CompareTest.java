package part2.Day7;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparable接口的使用 ：
 * 1.String、包装类等 实现了Comparable接口 重写了compareTo()方法，给出了比较两个对象大小的方式，他们重写方法后 实现了可以从小到大的排列
 * 2.重写 compareTo()方法的规则
 *      如果当前对象this大于形参对象obj，则返回正整数
 *      如果当前对象this小于形参对象obj，则返回负整数
 *      如果当前对象this等于形参对象obj，则返回零
 *
 *
 */
public class CompareTest {

    @Test
    public void test1(){
        String [] a = {"a","q","z","b"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Goods [] g1 = new Goods[7];
        g1[0] = new Goods("红烧肉",12.0);
        g1[1] = new Goods("手撕包菜",8.0);
        g1[2] = new Goods("红烧鱼",18.0);
        g1[3] = new Goods("糖醋里脊",10.0);
        g1[4] = new Goods("佛跳墙",26.0);
        g1[5] = new Goods("雪山盖顶",8.0);
        g1[6] = new Goods("拔丝红薯",8.0);
        Arrays.sort(g1);

        System.out.println(Arrays.toString(g1));
    }

    /**
     * Comparator接口的实现场景
     * 当我们在已经对compareTo方法进行了重写，但是我们又要求别的排序方式时
     * 我们直接用comparator接口
     *
     * Comparable 与 comparator 的对比
     *  前者更适合用于 直接实现接口 ，之后在任何位置都可以直接调用compareTo方法  --一劳永逸
     *  后者 更适合于 不修改原来的代码，在任何位置直接新建一个comparator的实现匿名类，新建之后直接重写compare方法  --用一次new一次
     */
    @Test
    public void test2(){
        String [] s1 = new String[] {"aa","cc","dd","bb","ee","ff","aa"};
        Arrays.sort(s1,new Comparator(){  //创建匿名类 重写compareTo方法

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s2 = (String) o1;
                    String s3 = (String) o2;
                    return -s2.compareTo(s3);
                }
                throw new RuntimeException("数据类型不匹配！");
            }
        });
        System.out.println(Arrays.toString(s1));

    }


}
