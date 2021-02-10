package part2.Day9;

/**
 * Collection的子接口List
 * List中元素有序\可重复
 *      List接口有三个实现类 ArrayList(作为List接口的主要实现类)\LinkedList()\Vector(作为List接口的古老实现类)
 *          三个类都实现了List类,存储数据的特点相同:存储有序的,可重复的数据
 *          特点\不同:ArrayList:作为List接口的主要实现类,线程不安全,但是效率极高,底层使用的Object {} elementData 存储数据
 *                   LinkedList:对于频繁的插入,删除等操作,使用此类比ArraysList类的效率要高,底层使用的是双向链表
 *                   Vector:作为古老的实现类,线程安全,效率低下,底层使用Object {} elementData存储数据
 *  对于ArrayList的源码分析
 *      基于jdk1.7 ArrayList list = new ArrayList(); 底层创建了长度为10的Object [ ] 数组ElementData
 *                然后直接对创建好的数组进行赋值,如果不够则进行扩容(默认情况下扩容为原来的1.5倍),同事将原来的数组复制到新的数组当中
 *                结论:建议使用带有参数的构造器:ArrayList list = new ArrayList(int capacity);直接初始化容量
 *      基于jdk1.8 ArrayList list = new ArrayList; 底层数组 进行了初始化,Object [ ] elementData 初始化为{ } ,并没有创建长度
 *                当第一次调用add();添加元素时,底层才进行了创建长度为10的数组,并将数据添加到数组当中.气候的操作则与jdk1.7无异
 *           总结:jdk1.7中的ArrayList的对象的创建类似于单例的饿汉式,而jdk1.8中的ArrayList的对象的创建类似于单例模式的懒汉式,延迟了数组的创建,节省内存.
 *  对LinkedList的源码分析:
 *      LinkedList list = new LinkedList(); 内部声明了Node类型的first和last属性,默认值为null
 *      list.add();将对象封装到Node中,创建了Node对象
 *      Node的定义体现了 LinkedList的双向链表的说法
 *      private static class Node<E> {
 *         E item;  //数据
 *         Node<E> next;  //下一个值
 *         Node<E> prev;  //上一个值
 *
 *         Node(Node<E> prev, E element, Node<E> next) {
 *             this.item = element;
 *             this.next = next;
 *             this.prev = prev;
 *         }
 *     }
 */
public class Demo2 {

}
