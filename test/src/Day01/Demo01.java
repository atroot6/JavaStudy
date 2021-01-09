package Day01;


public class Demo01 {
    /*equals();
对于equals的学习使用
隶属于object类,所有类都会默认的继承其祖宗类->object 因此可以使用其equals方法
equals方法的描述:
equals 在没有重写(String\Integer.....就对equals方法就行了重写)的情况下 用于比较两个对象的地址是否相等.
用法:  a.equals(b);  比较a,b是否相等 返回一个布尔值ture  or  false

经过重写equals 方法 可以比较其内容(利用对其里的内容进行下下转型  使其类型一致  达到比较的目的) String等类中就对equals方法进行了重写

Object类中的equals方法是容忍空指针异常的
总结
== 与 equals() 的区别
== 用于基本类型的时候  用来比较值是否相等
   用于应用类型的时候  用来比较地址值是否相等
equals 的作用
默认情况下 用于比较引用类型 比较地址值是否相同.但是可以按照逻辑重写equals方法达到比较内容的效果

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
//    此处重写equals方法 目的是达到比较对象里的内容->属性值

/*
对于String的补充
String 是一种非常特殊的类
String s = "abc132"; 是一种非常特殊的形式 这里暂且叫他形式赋值 其在Java中被叫做直接量  跟new有着本质的区别 ,他是java中唯一一个不需要new 就产生的对象
众所周知 new 出来的对象通常会被放在堆里 而 形式赋值产生的直接量在创建的时候  会在JVM内部发生字符串扣留->1.先查看常量池中是否有内容相同的字符串
若有 ,则将其直接指向常量池中已有的字符串 ,偌常量池中没有声明的该字符串,则创建一个字符串将其放入常量池中
注意: 偌用普通对象的创建方法来创建该字符串 则其属性就会与原来一模一样  例如-> String s = new String("abc123");

 */


    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 20;
        if (a == b) System.out.println("a=b");


        Person p1 = new Person("天残脚", 20);
        Person p2 = new Person("天残脚", 20);
        Person p3 = new Person("哮天犬", 30);
        if (p1 == p2) System.out.println("p1=p2");
        if (p1 == p3) System.out.println("p1=p3");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));  //由于比较的都是地址值  所以 都不相同
//        int a = 1;
//        int b = 2;


    }
}
