package GenericTest;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * className: test
 * @author theoldzheng@163.com  @ZYD
 * @description 关于泛型子父类
 * @create in 2021.2.19 14:47
 */
public class testForGeneric1 {
    /**
    关于子父类泛型关系的描述：
    如果 A 是 B的父类，那么，他们之间如果泛型不统一，是不能够写多态性形式的，他们之间是并列关系的
    例如： A<String> a = new A<>();
          B<Integer> b = new B<>();
          a = b; 不成立
    如果他们之间的泛型是统一的那么  a = b;是正确的
     */

    /**
     * 通配符 ? 的使用：
     * 类A 是 类B的父类，G<A> G<B> 属于并列关系，他们的共同父类为 :G<?>
     *
     */
    @Test
    public void test01(){
        List<Object> list1 = null;
        List<String> list2 = null;

//        list1 = list2;  编译错误！

        List<?> list =null;
        list = list1;
        list = list2;

    }
    public void Print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
