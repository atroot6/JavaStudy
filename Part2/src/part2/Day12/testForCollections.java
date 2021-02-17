package part2.Day12;

import org.junit.Test;
import part2.Day10.Sex;
import part2.Day10.person;

import java.util.*;

/**
 * className: testForCollections
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 练习
 * @create in 2021.2.17 15:54
 */
public class testForCollections {

    //从键盘收入10个数字，存到List集合中，并以此将其倒序、从大到小的顺序显示
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个数据：");
        for (int i = 0;i < 10;i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(list);
        System.out.println("倒序：");

        Collections.reverse(list);
        System.out.println(list);

        System.out.println("从大到小排列：");
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer){
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return -i1.compareTo(i2);
                }
                throw new RuntimeException("参数不匹配！");
            }
        });
        System.out.println(list);
    }
}
