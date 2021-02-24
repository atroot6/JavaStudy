package CollectionTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

public class CollectionMethodsTest {
    @SuppressWarnings({"rawtypes", "unchecked", "ConstantConditions", "StringOperationCanBeSimplified", "RedundantArrayCreation", "ArraysAsListWithZeroOrOneArgument"})
    //去除警告
    @Test
    public void test1() {

//1.add(Object obj); 添加一个元素  注意 在Collection接口的实现类对象中添加obj时,要求obj所在的类必须重写equals()方法
        java.util.Collection coll = new ArrayList();
        coll.add(132);
        System.out.println(coll);  //[132]

//2.addAll(Collection coll); 添加一个Collection的集合的全部元素到现有的集合中
        java.util.Collection coll1 = new ArrayList();
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
        java.util.Collection coll2 = Arrays.asList(132, 563);
        coll.retainAll(coll2);
        System.out.println(coll); //[132]
//10.equals(Object obj); 比较两个集合里的元素是否一样  这里要注意区分 集合是否有序

//11.hashcode(); 返回当前对象的哈希值

//12.toArray(); 集合-->数组
        Object[] objects = coll2.toArray();
        System.out.println(Arrays.toString(objects));
//13.数组-->集合 Arrays.asList();
        List list = Arrays.asList(45, 66, 48, "hello world");
        System.out.println(list); //[45, 66, 48, hello world]
        System.out.println("长度为:" + list.size());//长度为:4

        List<String> list1 = Arrays.asList(new String[]{"hello java", "你好"});
        System.out.println(list1); //[hello java, 你好]
        System.out.println("长度为:" + list1.size()); //长度为:2

        List list3 = Arrays.asList(new int[]{1, 3, 5});
        System.out.println("长度为:" + list3.size()); //长度为:1

        List list4 = Arrays.asList(new Integer[]{154, 15, 33, 46});
        System.out.println(list4);  //[154, 15, 33, 46]
        System.out.println("长度为:" + list4.size()); //长度为:4

//14.Iterator 遍历集合   用于遍历Collection集合
//        注意:集合对象每次调用iterator()都会得到一个全新的迭代器
        Iterator iterator = list4.iterator();
        //方式一:
//        System.out.println(iterator.next()); //每执行一次,遍历一个元素
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next()); //当超出数量时,会报异常

        //方式二: 通过for循环遍历   不推荐使用
//        for (int i = 0; i < list4.size(); i++) {
//            System.out.println("第"+ (i+1) +"个元素"+ iterator.next());
//        }
        //方式三: 通过 配合hasNext()方法使用while循环
        //hasNext() 判断下一个位置是否有元素
        while (iterator.hasNext()) {
//            next(),将指针下移,并输出下移后位置上的元素
            System.out.println(iterator.next());
        }
        //迭代器Iterator内部定义了remove(),但不同于集合的remove()

        //通过 foreach遍历集合  底层调用仍为Iterator迭代器
        //for(声明一个形参:对象){调用输出形参对象完成遍历}
        //for(声明集合元素的类型:集合对象)
        for (Object obj : list4) {
            System.out.println("from foreach: " + obj);
        }

    }
}