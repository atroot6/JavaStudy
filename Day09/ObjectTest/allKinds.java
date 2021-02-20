package ObjectTest;

public class allKinds { //多态的理解及其应用
    /**
     * 理解多态性 理解为一个事物的多种形态
     * person p = new man(); 父类的引用指向子类的对象  ||  子类的对象赋给父类引用
     * 编译看左边  运行看右边
     * 对象的多态性只适用于方法 不适用于属性
     * <p>
     * 向上转型 左父 右子  此时 堆内存中已经加载了子类的变量和方法 只是因为声明是父类 所以无法调用子类的方法
     * 此时我们就需要 向下转型 （强制转换符）
     */

    public static void main(String[] args) {
        Animal a = new cat();
        a.eat();
        System.out.println();
        a.shot();
        System.out.println();
//        a.test();
//        System.out.println("***********");

        cat c = (cat) a; //向下转型
        c.eat();
        System.out.println();
        c.shot();
        c.test();
    }
}

class cat extends Animal {
    public cat(String name, String age) {
        super(name, age);
    }

    public cat() {
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("猫猫吃小鱼罐头！");
    }

    @Override
    public void shot() {
        super.shot();
        System.out.println("喵喵喵");
    }
    public void test(){
        System.out.println("子类的特有方法已经执行！");
    }
}

class Animal {
    String name;
    String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void eat() {
        System.out.println("动物吃东西！");
    }

    public void shot() {
        System.out.println("动物发出叫声！");
    }

}