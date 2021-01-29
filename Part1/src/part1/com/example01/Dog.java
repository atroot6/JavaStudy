package part1.com.example01;

public class Dog extends Animal {
    public Dog(String animal) {  //构造方法
        super(animal);
    }

    public Dog() {//构造方法
    }

    @Override
    public void eat() {
        System.out.println("狗吃shi");
    }

    /*@Override*/
    public void showvoice() {
        System.out.println("汪汪汪！");
    }
}
