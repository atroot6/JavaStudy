package CollectionsTest;


/**
 * @ClassName: people
 * @Description: 人类
 * @Author: @theoldzheng@163.com
 * @Date: Create in 2021.2.10 20:13
 * @Version: 1.0
 */

@SuppressWarnings({"rawtypes", "unused"})
public class person implements Comparable {
    private String name;
    private int age;
    private Sex SEX = null;


    public person() {
    }

    public person(String name, int age, Sex SEX) {
        this.name = name;
        this.age = age;
        this.SEX = SEX;
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

    public Sex getSex() {
        return SEX;
    }

    public void setSex(Sex sex) {
        this.SEX = sex;
    }

    @Override
    public String toString() {
        return "{name=" + name +
                ", age=" + age +
                ", sex=" + SEX +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        person person = (person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return SEX != null ? SEX.equals(person.SEX) : person.SEX == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (SEX != null ? SEX.hashCode() : 0);
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

