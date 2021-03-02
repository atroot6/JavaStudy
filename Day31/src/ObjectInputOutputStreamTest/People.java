package ObjectInputOutputStreamTest;

import java.io.Serializable;

/**
 * className: People<p>
 * description:
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.2 14:51
 */
public class People implements Serializable {
    private String name;
    private int age;
    private static final long serialVersionUID = 4654462L;  //序列化的版本号

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
