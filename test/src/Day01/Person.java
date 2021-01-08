package Day01;

public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        //使用向下转型 将obj转换
        Person P = (Person) obj;  //向下强转
        boolean b = this.name.equals(P.name) && this.age == age;
        return b;
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
