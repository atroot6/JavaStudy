package part2.Day9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 数组的特点
 * 数组一旦初始化就无法改变其长度,且类型也是确定好的
 * 数组提供的操作方法十分有限,对于添加删除插入等操作非常不便,且效率不高
 * 没有获取数组中具体元素个数的方法或属性
 * 数组存储数据的特点:有序\可重复,对于无序\不可重复的要求不能满足.
 * <p>
 * 集合的两种接口
 * Collection(1.List(元素有序的,可重复的集合) 2.Set(元素无序的,不可重复的集合))
 * Map(映射) 双列数据,保存具有映射关系的集合 key-value
 * <p>
 * Collection接口常用的的方法
 */

public class Demo1 {
    @SuppressWarnings({"rawtypes", "unchecked", "ConstantConditions", "StringOperationCanBeSimplified"}) //去除警告
    @Test
    public void test1() {

//1.add(Object obj); 添加一个元素  注意 在Collection接口的实现类对象中添加obj时,要求obj所在的类必须重写equals()方法
        Collection coll = new ArrayList();
        coll.add(132);
        System.out.println(coll);  //[132]

//2.addAll(Collection coll); 添加一个Collection的集合的全部元素到现有的集合中
        Collection coll1 = new ArrayList();
        coll1.add(555);
        coll1.addAll(coll);
        System.out.println(coll1); //[555, 132]

//3.int size(); 返回集合中元素的个数
        System.out.println(coll.size());  //1
        System.out.println(coll1.size()); //2

//4.void clear(); 清空集合
        coll1.clear();
        System.out.println(coll1.size()); //0

//5.boolean isEmpty(); 判断是否为空集合
        System.out.println(coll.isEmpty());  //false
        System.out.println(coll1.isEmpty()); //true

//6.boolean contains(Object obj); 底层是通过元素调用equals()方法,判断是否为同一个对象
// * 注意,在用contains()方法查看集合中是否有该对象时,会直接调用该对象所在类的equals()方法
        coll.add(new String("hello")); //此处用String时因为String类中对equals()类进行了重写
        boolean hello = coll.contains(new String("hello"));
        System.out.println(hello);  //true

//7.boolean containsAll(Collection coll);底层是通过调用equals()方法,对集合里的元素挨个比较 判断形参coll中的所有元素是否都在当前集合中
        coll1.add(555);
        coll.add(555);
        coll1.add(new String("hello"));
        boolean b = coll.containsAll(coll1);
        System.out.println(coll);  //[132, hello, 555]
        System.out.println(coll1);  //[555, hello]
        System.out.println(b);  //true

//7.boolean remove(Object obj); 通过元素的equals()方法判断是否是要删除的那个元素,只会删除找到的第一个元素
        coll.remove(555);
        System.out.println(coll); //[132, hello]

//8.boolean removeAll(Collection coll);取当前集合与形参里集合的差集
        coll.removeAll(coll1);
        System.out.println(coll); //[132]
//9.retainAll(Collection coll);获取当前集合对象和形参里集合的交集,并返回给调用者
        Collection coll2 = Arrays.asList(132,563);
        coll.retainAll(coll2);
        System.out.println(coll); //[132]
    }
//10.equals(Object obj); 比较两个集合里的元素是否一样  这里要注意区分 集合是否有序
}
