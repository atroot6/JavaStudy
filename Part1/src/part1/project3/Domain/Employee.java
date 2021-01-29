package part1.project3.Domain;

public class Employee {
    private int Id;
    private String name;
    private int age;
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name, int age, double salary) {
        this.Id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String  getDetails(){
        return   Id + "\t" + name  + " \t" + age + "\t" + salary ;
    }

    @Override
    public String toString() {
        return   Id + "\t" + name  + " \t" + age + "\t" + salary ;
    }
}