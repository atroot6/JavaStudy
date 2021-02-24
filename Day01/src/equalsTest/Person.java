package equalsTest;

import java.util.Objects;

public class Person {
    private String name;
    private int age;


//    此处重写equals方法 目的是达到比较对象里的内容->属性值
@Override
public boolean equals(Object o) {
    if (this == o) return true; //提高效率
    if (o == null || getClass() != o.getClass()) return false;  //反射  提高效率
    Person person = (Person) o; //向下强转型
    return age == person.age && Objects.equals(name, person.name); //进行比较 并返回布尔值
}

    @Override   //必须要有的部分 日后作解释 2021.1.9
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
