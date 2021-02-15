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
 *
 *      HashMap的底层实现原理：
 *      JDK7为例说明：
 *      HashMap map = new HashMap(); 在实例化之后，底层创建了一个长度为16的一维数组Entry [ ] table。
 *
 *      map.put(ket1,value1);
 *      首先调用key1所在类的hashCode()计算哈希值，若哈希值所对应的Entry数组的位置上的数据为空，那么此时的(key1,value)添加成功
 *      如果哈希值对应的Entry数组对应的位置上不为空(意味着此位置上存在一个或多个数据---以链表的形式存在)，继续通过equals()与其他已经存在的值进行比较，如果返回false，
 *      那么添加成功，如果返回值为true，那么会用新的的value替换旧的
 *
 *      以上哈希值相同的情况均以链表的方式进行存储（遵循七上八下）
 *      在不断地添加过程中会涉及扩容方式，扩容为原来的两倍，并将原来的数据复制过来
 *
 *      JDK8 在底层与JDK7的不同之处：
 *      1.new HashMap();底层没有创建一个长度为16的数组
 *      2.JDK8底层的数组是Node [ ]，而非Entry[ ]
 *      3.首次使用put()，的时候，底层创建长度为16的数组
 *      4.jdk7底层结构只有：数组+链表。而JDK8底层结构为 数组+链表+红黑树。
 *        当数组的某一个索引位置上的元素以链表的形式存在的数据个数 >8，且当前数组的长度>64时，此时此索引位置上的所有数据改为红黑树存储
 *
 *        底层主要关键字
 *        DEFAULT_INITIAL_CAPACITY (初始默认容量):HashMap的默认容量：16
 *        DEFAULT_LOAD_FACTOR(HashMap的默认加载因子):0.75
 *        threshold(扩容的临界值):容量*扩容因子：16*0.75 = 12
 *        TREEIFY_THRESHOLD_THRESHOLD:Bucket中链表长度大于该默认值，就转化为红黑树：8
 *        MIN_TREEIFY_CAPACITY: 桶中的Node被树化时最小的hash表容量：64
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
