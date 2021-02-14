package part2.Day11;

import org.junit.Test;


import java.util.*;

/**
 *ClassName: MapTest
 *@Description: Map实现类的基本框架
 *      Map--并列于Collection的接口，用于存储双列数据(键值对key-value)
 *          HashMap---Map的主要实现类，线程不安全，但是效率高，可以存储空值null的key-value
 *              LinkedHashMap---Hash的子类，Map的实现类,在HashMap底层的基础上，添加了指针，构成链表对于频繁的遍历操作，执行效率高于HashMap
 *          TreeMap---按照添加的key-value对进行排序，实现排序遍历
 *              底层实现使用的是红黑树
 *          Hashtable---作为古老的实现类，线程安全，效率低下，不能够存储null的key-value
 *              Properties:常用来处理配置文件，key-value都是String类型
 *
 *    HashMap的底层:数组+链表(jdk7及以前)
 *                 数组+链表+红黑树(jdk8+)
 *
 *  面试题：HashMap底层实现原理？
 *         HashMap和Hashtable的异同？
 *         CurrentHashMap 与 Hashtable的异同？
 *  对于Map结构的理解：
 *      Map中的key:无序的、不可重复的、使用Set存储所有的key  ---key所在的类要重写 equals()和 hashCode()
 *      Map中的value:无序的、可重复的，使用Collection存储所有的value
 *      一个键值对:key-value 构成一个Entry对象。
 *      Map中的entry:无序的、不可重复的，使用Set存储所有的entry
 *@Author: @theoldzheng@163.com
 *@Date: Create in 2021.2.14 12:00
 *@Version: 1.0
 */
@SuppressWarnings({"rawtypes", "MismatchedQueryAndUpdateOfCollection", "unchecked"})
public class MapTest {
    @Test
    public void test01() {
        Map hashMap = new HashMap();
        hashMap.put(null, null);
        hashMap.put("小红", 23);
        hashMap.put("小兰", 66);
        hashMap.put("洪七公", 89);

    }
}
