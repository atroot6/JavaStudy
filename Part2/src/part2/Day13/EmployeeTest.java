package part2.Day13;

/**
 * className: EmployeeTest
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 利用泛型重写Employee类
 * @create in 2021.2.18 15:31
 */
public class EmployeeTest implements Comparable<EmployeeTest> {
    private String name = null;
    private int age = 0;
    private int id;

    public EmployeeTest()  {
    }

    public EmployeeTest(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(EmployeeTest o) {
        return Integer.compare(this.age,o.age);
    }
}
