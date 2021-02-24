package GenericTest;

import java.util.ArrayList;
import java.util.List;

/**
 * className: subEmployee1
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 继承实现泛型类
 * @create in 2021.2.18 18:08
 */
public class subEmployee1<T> extends Employee1<T>{  //这样一来 subEmployee1仍然为泛型类
    //泛型类与其所属类是否是泛型类无关，且允许定义为静态方法
    public <E> List<E> example(E [] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e:arr) {
            list.add(e);
        }
        return list;
    }
}
