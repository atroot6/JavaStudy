package Day01;


public class Demo01 {
    /*
对于equals的学习使用
隶属于object类,所有类都会默认的继承其祖宗类->object 因此可以使用其equals方法
equals方法的描述:
equals 用于比较两个对象是否"相等"  默认比较的是地址值
用法:  a.equals(b);  比较a,b是否相等 返回一个布尔值ture  or  false

经过重写equals 方法 可以比较其内容(利用对其里的内容进行下下转型  使其类型一致  达到比较的目的)
 */


    public static void main(String[] args) {

       /* Person a = new Person("天残脚", 20);
        Person c = new Person("天残脚", 20);
        Person b = new Person("哮天犬", 30);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));  //由于比较的都是地址值  所以 都不相同*/
        int a = 1;
        int b = 2;



    }
}
