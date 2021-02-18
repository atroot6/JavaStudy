package part2.Day13;

/**
 * className: GenericTest1
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 自定义泛型类
 * @create in 2021.2.18 16:55
 */
public class Employee1<T> {
    T EmployeeT;
    private String name;
    private int age;

    public Employee1() {
    }

    public Employee1( String name, int age,T t) {
        this.EmployeeT = t;
        this.name = name;
        this.age = age;
    }

    public T getT() {
        return EmployeeT;
    }

    public void setT(T t) {
        this.EmployeeT = t;
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

    @Override
    public String toString() {
        return "Employee1{" +
                "t=" + EmployeeT +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
