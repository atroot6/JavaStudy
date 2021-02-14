package part2.Day10;


/**
 *ClassName: people
 *@Description: 人类
 *@Author: @theoldzheng@163.com
 *@Date: Create in 2021.2.10 20:13
 *@Version: 1.0
 */

@SuppressWarnings({"rawtypes", "unused"})
public class person implements Comparable {
    private String name;
    private int age;
    private String sex;

    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public person() {
        this.name = "无参构造 初始化";
        this.age = 0;
        this.sex = "？";
        System.out.println("姓名：" + name + "年龄：" + age + "性别：" + sex);
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        person person = (person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return sex != null ? sex.equals(person.sex) : person.sex == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof person) {
            person p = (person) o;
            return Integer.compare(this.age, p.age);
        } else {
            throw new RuntimeException("数据异常！");
        }
    }
}
