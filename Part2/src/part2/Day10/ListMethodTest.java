package part2.Day10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 *@Description List接口的方法
 * 总结:常用方法
 * 增add(Object obj) 删(remove(int index)\remove(Object obj)) 改(set(int index,Object ele)) 查get(int index)
 * 插add(int index,Object ele)  长度size()  遍历Iterator迭代器\foreach
 *@Author @theoldzheng@163.com
 *@Date Create in 2021.2.10 13:43
 *@Version 1.0
 */
public class ListMethodTest {
    //add();添加元素
    @Test
    public void test() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(556);
        list.add("hello");
        list.add(new person("小红", 23, "女"));
        System.out.println(list);//[123, 556, hello, person{name='小红', age=23, sex='女'}]
    }

    //在指定索引位置插入ele元素 add(int index,ele);
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(556);
        list.add("hello");
        list.add(new person("小红", 23, "女"));
        System.out.println(list);//[123, 556, hello, person{name='小红', age=23, sex='女'}]
        list.add(2, new person("小黄", 22, "男"));
        System.out.println(list); //[123, 556, person{name='小黄', age=22, sex='男'}, hello, person{name='小红', age=23, sex='女'}]
    }

    //从指定索引位置开始将eles中的所有元素都添加进来
    @Test
    public void test2() {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        list.add(123);
        list.add(556);
        list.add("hello");
        list.add(new person("小红", 23, "女"));
        list1.add(45);
        list1.add(36);
        list1.add(86);
        System.out.println(list1); //[45, 36, 86]
        list1.addAll(2, list);
        System.out.println(list1);//[45, 36, 123, 556, hello, person{name='小红', age=23, sex='女'}, 86]
    }

    //获取指定索引位置的元素 get(int index);
    @Test
    public void test3() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(556);
        list.add("hello");
        list.add(new person("小红", 23, "女"));
        System.out.println(list);//[123, 556, hello, person{name='小红', age=23, sex='女'}]
        System.out.println(list.get(3)); //person{name='小红', age=23, sex='女'}
    }

    //返回obj在集合中首次出现的位置 int indexOf(Object obj); 返回obj在当前集合首次出现的位置
    @Test
    public void test4() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(556);
        list.add("hello");
        System.out.println(list.indexOf(556)); //1
    }

    //返回obj在集合中最后一次出现的位置
    @Test
    public void test5() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(556);
        list.add(556);
        list.add(123);
        list.add("hello");
        System.out.println(list.lastIndexOf(123)); //4
    }

    //移除指定索引位置的元素,并返回该元素 Object remove(int index);
    @Test
    public void test6() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(556);
        System.out.println("移除前:" + list); //移除前:[123, 123, 556]
        Object remove = list.remove(2);
        System.out.println("移除的值为:" + remove); //移除的值为:556
        System.out.println("移除后:" + list); //移除后:[123, 123]
    }

    //指定索引位置的元素设置为ele
    @Test
    public void test7() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(556);
        System.out.println("设置前:" + list); //设置前:[123, 123, 556]
        list.set(0, new person("小明", 23, "男"));
        System.out.println("设置后:" + list); //设置后:[person{name='小明', age=23, sex='男'}, 123, 556]
    }

    //返回指定区间的集合的子集合 List subList(int fromIndex,int toIndex);
    @Test
    public void test8() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(556);
        list.add("hello");
        list.add(new person("小红", 23, "女"));
        List list1 = list.subList(1, 3);
        System.out.println(list); //[123, 556, hello, person{name='小红', age=23, sex='女'}]
        System.out.println(list1); //[556, hello]
    }
}
