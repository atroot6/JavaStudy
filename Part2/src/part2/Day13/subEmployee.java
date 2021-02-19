package part2.Day13;

import java.util.ArrayList;
import java.util.List;

/**
 * className: subEmployee
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 自定义泛型类的子类
 * @create in 2021.2.18 17:46
 */
public class subEmployee extends Employee1<Integer>{  //sunEmployee 将不再是泛型类
    //泛型类与其所属类是否是泛型类无关，且允许定义为静态方法
    public <E> List<E> example(E [] arr){  //泛型方法定义的格式  public <泛型> 返回值类型  方法名(参数){}
        ArrayList<E> list = new ArrayList<>();
        for (E e:arr) {
            list.add(e);
        }
        return list;
    }
}
