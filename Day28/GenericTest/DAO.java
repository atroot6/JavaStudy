package GenericTest;

import java.util.*;

/**
 * className: DAO
 * @author theoldzheng@163.com  @ZYD
 * @description 定义为一个泛型类，成员变量Map，Map的键为String类型，值为T类型
 * @create 2021.2.20 10:55
 */

public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    //保存T类型的对象到Map成员变量中
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    //从map中获取id对应的对象
    public T get(String id) {
        return map.get(id);
    }

    //替换map中key为id的内容，改为entity对象
    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    //返回map中存放的所有的T对象
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();

        Iterator<T> iterator = values.iterator();
        while(iterator.hasNext()){
            T next = iterator.next();
            list.add(next);
        }

        //错误写法：
//        Collection<T> values1 = map.values();
//        return (List<T>) values1;

        return list;
    }

    //删除指定的id的对象
    public T delete(String id) {
        T remove = map.remove(id);

        return remove;
    }
}
