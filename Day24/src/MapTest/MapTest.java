package MapTest;

import org.junit.Test;

import java.util.*;

/**
 * MapTest<p>
 * Map实现类的基本框架
 * *@author  theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description: Map实现类的基本框架
 * Map--并列于Collection的接口，用于存储双列数据(键值对key-value)
 * 1.HashMap---Map的主要实现类，线程不安全，但是效率高，可以存储空值null的key-value
 * 2.LinkedHashMap---Hash的子类，Map的实现类,在HashMap底层的基础上，添加了指针，构成链表对于频繁的遍历操作，执行效率高于HashMap
 * 3.TreeMap---按照添加的key-value对进行排序，实现排序遍历
 * 3.1底层实现使用的是红黑树
 * 4.Hashtable---作为古老的实现类，线程安全，效率低下，不能够存储null的key-value
 * 5.Properties:常用来处理配置文件，key-value都是String类型
 * <p>
 * HashMap的底层:数组+链表(jdk7及以前)
 * 数组+链表+红黑树(jdk8+)
 * <p>
 * 面试题：HashMap底层实现原理？
 * HashMap和Hashtable的异同？
 * CurrentHashMap 与 Hashtable的异同？
 * 对于Map结构的理解：
 * Map中的key:无序的、不可重复的、使用Set存储所有的key  ---key所在的类要重写 equals()和 hashCode()
 * Map中的value:无序的、可重复的，使用Collection存储所有的value
 * 一个键值对:key-value 构成一个Entry对象。
 * Map中的entry:无序的、不可重复的，使用Set存储所有的entry
 * <p>
 * HashMap的底层实现原理：
 * <p>
 * JDK7为例说明：
 * HashMap map = new HashMap(); 在实例化之后，底层创建了一个长度为16的一维数组Entry [ ] table。
 * <p>
 * map.put(ket1,value1);
 * 首先调用key1所在类的hashCode()计算哈希值，若哈希值所对应的Entry数组的位置上的数据为空，那么此时的(key1,value)添加成功
 * 如果哈希值对应的Entry数组对应的位置上不为空(意味着此位置上存在一个或多个数据---以链表的形式存在)，继续通过equals()与其他已经存在的值进行比较，如果返回false，
 * 那么添加成功，如果返回值为true，那么会用新的的value替换旧的
 * <p>
 * 以上哈希值相同的情况均以链表的方式进行存储（遵循七上八下）
 * 在不断地添加过程中会涉及扩容问题，当size超出临界值且要存放的位置非空，扩容为原来的两倍，并将原来的数据复制过来
 * <p>
 * JDK8 在底层与JDK7的不同之处：
 * 1.new HashMap();底层没有创建一个长度为16的数组
 * 2.JDK8底层的数组是Node [ ]，而非Entry[ ]
 * 3.首次使用put()，的时候，底层创建长度为16的数组
 * 4.jdk7底层结构只有：数组+链表。而JDK8底层结构为 数组+链表+红黑树。
 * 当数组的某一个索引位置上的元素以链表的形式存在的数据个数 >8，且当前数组的长度>64时，此时此索引位置上的所有数据改为红黑树存储
 * <p>
 * 底层主要关键字
 * DEFAULT_INITIAL_CAPACITY (初始默认容量):HashMap的默认容量：16
 * DEFAULT_LOAD_FACTOR(HashMap的默认加载因子):0.75
 * threshold(扩容的临界值):容量*扩容因子：16*0.75 = 12
 * TREEIFY_THRESHOLD_THRESHOLD:Bucket中链表长度大于该默认值，就转化为红黑树：8
 * MIN_TREEIFY_CAPACITY: 桶中的Node被树化时最小的hash表容量：64
 * @Create in 2021.2.14 12:00
 */
@SuppressWarnings("ALL")
public class MapTest {
    /**
     * Map中定义的方法
     * put(Object key,Object value)将指定的key-value添加(修改)到当亲的map对象中
     * putAll(Map m) 将m中所有的key-value放到map中
     * remove(Object key) 移除指定key的key-value对，并返回value
     * clear() 清空当前map中的所有数据
     */

    @Test
    public void test01() {
        Map hashMap = new HashMap();
        hashMap.put(null, null);
        hashMap.put("小红", 23);
        hashMap.put("小兰", 66);
        hashMap.put("洪七公", 89);
        //修改替换
        hashMap.put("小红", 65);
        System.out.println(hashMap);
        //删除
        Object value = hashMap.remove("小兰"); //返回要删除对应的value
        System.out.println(value + "已删除！");
        System.out.println(hashMap);
        Map m = new HashMap();
        m.put("张三", 22);
        m.put("周五", 45);
        m.put("李四", 38);
        m.putAll(hashMap); //putAll();
        System.out.println(m);

        m.clear(); //并不等于m = null;
        System.out.println(m.size()); //所以不会空指针异常
        System.out.println(m);
    }


    /**
     * 元素查询的操作：
     * Object get(Object key):获取指定key值的value
     * boolean containsKey(Object key) 是否包含指定的key
     * int size() :返回map中key-value对的个数
     * boolean isEmpty(): 判断当前map是否为空
     * boolean equals(Object obj): 判断当前map和参数对象obj是否相等
     */
    @Test
    public void test02() {
        Map hashMap = new HashMap();
        hashMap.put("小红", 23);
        hashMap.put("小兰", 66);
        hashMap.put("洪七公", 89);

        Object o1 = hashMap.get("小红");
        System.out.println(o1);

        boolean b = hashMap.containsKey("小兰");
        System.out.println(b); //true
        boolean b1 = hashMap.containsValue(89);
        System.out.println(b1); //true
        System.out.println(hashMap.size()); //3
//        hashMap.clear();
        boolean empty = hashMap.isEmpty();
        System.out.println(empty); //true

        HashMap hashMap1 = new HashMap();
        hashMap1.put("洪七公", 89);
        hashMap1.put("小红", 23);
        hashMap1.put("小兰", 66);
        boolean equals = hashMap.equals(hashMap1);
        System.out.println(equals); //true
    }

    //遍历
    @Test
    public void test03() {
        //由其底层原理可知，key是由Set保存的，value是由Collection保存的

        Map hashMap = new HashMap();
        hashMap.put("小红", 23);
        hashMap.put("小兰", 66);
        hashMap.put("洪七公", 89);

        //1. 遍历hashMap中的key --> keySet()
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**********");
        //2. 遍历value  --> value()
        Collection values = hashMap.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("**********");
        //3. 遍历key-value  --> entrySet()
        //由其底层结构可知，key-value的底层为一个entry对象，由Set保存
        Set entrySet = hashMap.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next(); //获得了entry对象
            //把其entry对象强转为 Map.entry
            Map.Entry mapEntry = (Map.Entry) next;
            System.out.println(mapEntry.getKey() + "--->" + mapEntry.getValue());
        }
        System.out.println("**********");
        //4. 通过key来getValue() 的方法来实现遍历的操作
        Set keySet = hashMap.keySet();
        Iterator iterator3 = keySet.iterator();
        while (iterator3.hasNext()) {
            Object key = iterator3.next(); //获得key
            System.out.println(key + "--->" + hashMap.get(key));
        }
    }

    //向TreeMap中添加key-value，要求key必须是由同一个类创建的对象，因为要按照key进行排序：自然排序、定制排序
    //注意：不能通过 value进行排序
    @Test
    public void test04() {
        Comparator comparator = new Comparator() { //定制排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof person && o2 instanceof person) {
                    person p1 = (person) o1;
                    person p2 = (person) o2;
                    return p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("参数不匹配");
            }
        };
        TreeMap treeMap = new TreeMap(comparator);
        person p1 = new person("猪坚强", 36, Sex.MALE);
        person p2 = new person("东方不败", 26,  Sex.FEMALE);
        person p3 = new person("魏忠贤", 56,  Sex.FEMALE);
        person p4 = new person("曹操", 66,  Sex.MALE);

        treeMap.put(p1, 88);
        treeMap.put(p2, 76);
        treeMap.put(p3, 99);
        treeMap.put(p4, 56);

        //遍历
//        Set set = treeMap.keySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            Object key = iterator.next();
//            Object value = treeMap.get(key);
//            System.out.println(key + "---->" + value);
//        }
        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry mapEntry = (Map.Entry) next; //强转为map的Entry
            Object key = mapEntry.getKey();
            Object value = mapEntry.getValue();
            System.out.println(key + "----->" + value);
        }
    }
}
