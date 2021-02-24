package GenericTest;

import org.junit.Test;

/**
 * className: test
 * @author theoldzheng@163.com  @ZYD
 * @description 测试类
 * @create 2021.2.20 11:38
 */
public class testForGeneric2 {
    @Test
    public void test01(){
        DAO<User> dao = new DAO<User>();
        dao.save("101",new User("雷神",101,22));
        dao.save("102",new User("黄大锤",102,19));
        dao.save("103",new User("灭霸",103,46));
        dao.save("104",new User("美国队长",104,42));

        System.out.println(dao.list());

        User delete = dao.delete("102");
        System.out.println(delete.getName() + " is delete successful!");
        System.out.println(dao.list());

        Object o = dao.get("103");
        System.out.println(o);

        dao.update("101",new User("许仙",101,22));
        System.out.println(dao.list());

    }
}
