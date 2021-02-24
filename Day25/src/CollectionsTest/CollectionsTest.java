package CollectionsTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * className: CollectionsTest
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description Collections工具类，是一个用来操作Set、List、Map等集合的工具类
 * @create in 2021.2.17 13:53
 */
public class CollectionsTest extends Thread {
    @Override
    public void run() {
        super.run();

    }

    @Test
    public void test01() {
        List list = new ArrayList();
        list.add(new person("张三", 22, Sex.MALE));
        list.add(new person("王芳", 23, Sex.FEMALE));
        list.add(new person("赵四", 18, Sex.MALE));
        list.add(23);
        list.add(33);
        list.add(24);
        System.out.println(list); //[{name=张三, age=22, sex=男}, {name=王芳, age=23, sex=女}, 23, 33, 24]
//          1.reverse(List);用于反转集合中的元素的顺序
//        Collections.reverse(list);
//        System.out.println(list); //[24, 33, 23, {name=王芳, age=23, sex=女}, {name=张三, age=22, sex=男}]
//          2.shuffle(List);对集合元素进行随机化
//        Collections.shuffle(list);
//          3.前提要对数据进行统一化，才能进行比较排序
//        Collections.sort(list);
//          4.根据指定的Comparator产生的顺序，对List进行排序
//        Collections.sort(list, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//               if (o1 instanceof person && o2 instanceof person){
//                   person p1 = (person) o1;
//                   person p2 = (person) o2;
//                   return Integer.compare(p1.getAge(),p2.getAge());
//               }
//                   throw new RuntimeException("数据类型不匹配！");
//            }
//        });
//          5.指定List集合中 两处位置的元素进行位置互换
//        Collections.swap(list,2,3);
//        System.out.println(list);
//          6.根据元素的自然顺序,返回给定集合中的最大元素
//        Comparable max = Collections.max(list);
//        Collections.max(Collection,Comparator); 根据Comparator指定的顺序返回给定集合中的最大元素
//          7.最小
//        Collections.min(Collection);
//        Collections.min(Collection,Comparator) //最小
//          8.返回指定集合中指定元素的出现次数
//        int frequency = Collections.frequency(list, new person("张三",22,Sex.MALE));
//        System.out.println(frequency);
//          9.将src中的内容复制到dest中
//        注意：不能使用：List list1 = new ArrayList(list.size()),这样只是制定了数组的大小，并没有实际的用元素将集合撑起来
        List list1 = Arrays.asList(new Object[list.size()]);
        System.out.println(list1);
        Collections.copy(list1, list);
        System.out.println(list1);
//          10.将旧值用新值替换boolean replaceAll()
//        Collections.replaceAll()
//          11.通过方法Collections.synchronizedList();返回一个线程安全的List
        List list2 = Collections.synchronizedList(list); //此时返回的list2即为线程安全的list，可以进行线程操作

    }
}
