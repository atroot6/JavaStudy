package ListAndSetTest;

import org.junit.Test;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeArray.sort;

/**
 *ClassName: SetTest
 *@Description: Set接口的描述
 *  Set接口是Collection的子接口,Set接口没有提供额外的方法.Set接口存储无序,不可重复的数据
 *  Set接口不允许包含相同的元素,若添加相同元素则会添加操作失败
 *  Set中判断两个对象是否相同只能用equals();不能使用 "=="
 *      要求，在Set中添加数据时，其所在类一定要重写equals();hashCode();
 *           重写的equals()、hashCode();必须保持一直，保证相等的对象的散列码时相同的，
 *           即，当两个对象的equals();的返回true，这两个对象的hashCode()返回的值也是相同的
 *      无序性以及不可重复性的的理解：
 *           底层数据的存储依然是以数组的形式进行存储，但是无序不等于随机，当我们添加数组的时候，并不是按照数组的索引
 *           进行添加，而是根据哈希值进行添加。
 *           当存储一个数据的时候会计算其哈希值，如果计算的哈希值不同，则表明数据不一样，直接添加成功，
 *           如果计算的哈希值相同，那么就会调用其equals();进行比较，如果经过equals();比较厚返回的值不是true那么证明不一样，添加成功。
 *                  如果哈希值相同，那么就会在对应的哈希值的位置以链表的方式添加数据。以链表的方式添加数据的规则
 *                      基于JDK7.0：新的元素放到数组中，并指向原来的旧元素
 *                      基于JDK8.0：原来的元素在数组中，指向新的元素
 *                 总结：七上八下
 *  Set接口有三个实现类:
 *      1.HashSet 作为Set接口的主要实现类，线程不安全，可以存储null值
 *          2.LinkedHashSet作为HashSet的子类，遍历其中的元素，可以按照添加顺序来遍历，对于频繁的遍历操作，效率高于HashSet
 *              是因为，在HashSet的基础上在数组给每个元素都加上了指针，使数据变成双向链表。
 *      3.TreeSet 可以按照对象的指定属性进行排序，要求添加的数据是相同类的对象
 *
 *@Author: @theoldzheng@163.com
 *@Date: Create in 2021.2.10 16:03
 *@Version: 1.0
 */
@SuppressWarnings({"rawtypes", "unchecked", "OverwrittenKey", "WhileLoopReplaceableByForEach", "Convert2Lambda"})
public class SetTest {
//    Set的实现类HashSet的实现以及练习

    @Test
    public void test1() {
        Set set = new HashSet();
        set.add("hello");
        set.add(123);
        set.add("abc");
        set.add(123);
        set.add(new person("小红", 29, Sex.MALE));
        set.add(new person("小红", 29, Sex.MALE));
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    // LinkedHashSet  HashSet的子类，根据添加元素的顺序来遍历集合
    @Test
    public void test2() {
        Set set = new LinkedHashSet();
        set.add("hello");
        set.add(123);
        set.add("abc");
        set.add(123);
        set.add(new person("小红", 29, Sex.MALE));
        set.add(new person("小红", 29, Sex.MALE));
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //TreeSet,向TreeSet中添加数据，要求是相同类的对象，两种排序方式：1.自然排序、定制排序
    //自然排序中，比较两个对象是否相同的标准为：compareTo();返回0,而不再是equals();方法
    //定制排序中，比较两个对象是否相同的标准是compare();但是规则是一样的
    @Test
    public void test3() {
        //编写比较规则
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof person && o2 instanceof person) {
                    person p1 = (person) o1;
                    person p2 = (person) o2;
                    return p1.getName().compareTo(p2.getName());
                } else {
                    throw new RuntimeException("数据异常！");
                }
            }
        };
        //应用比价规则
        TreeSet treeSet = new TreeSet(comparator);  //在有参数的情况下，会根据参数对象中所定义的排序方式进行排序，
        // 若没有，将会按照添加的对象中实现的comparable接口后重写的compareTo();的规则进行排序
        treeSet.add(new person("孔乙己", 33, Sex.FEMALE));
        treeSet.add(new person("祥林嫂", 22, Sex.MALE));
        treeSet.add(new person("鲁迅", 18, Sex.FEMALE));


        Iterator iterator = treeSet.iterator();//通过age进行自然排序
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}