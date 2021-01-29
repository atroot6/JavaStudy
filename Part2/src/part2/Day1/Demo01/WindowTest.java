package part2.Day1.Demo01;

/**
 * 创建三个窗口卖票，总票数为100
 * 这里略过了创建线程的一种方式 ：通过创建类继承Thread 而创建多个对象的方式实现多线程
 *
 * 创建多线程的方式二：
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类 覆写Runnable中的抽象方法
 * 3.创建实现类的对象，并将该对象传递到Thread类的构造器当中，创建Thread类的对象
 * 4.通过Thread类的对象调用start方法
 * 实质剖析：
 * 通过Thread类的对象调用start()，调用的是Runnable类型里的target的run()方法
 * 然而我们在这里重写了 run方法 ，最后将实现类对象直接当做target对象传入构造方法
 *
 * 两种方式的比较
 * 在实际应用中 优先选择实现接口的这种方法
 * 实现的方式没有类的单继承性的局限性
 * 实现的方式更适合来处理多个线程共享数据的情况
 *
 * 共同点
 * 两种方式都需要重写run()，将线程要执行的逻辑写到里面
 *
 */

public class WindowTest {
    public static void main(String[] args) {
//        创建实现类对象
        Window window = new Window();  //共享对象  共享变量ticket
//        将创建好的实现类对象传入Thread类的构造函数创建对象
        Thread thread = new Thread(window);
        thread.setName("窗口1：");
//        通过该对象调用start方法
        thread.start();

        Thread thread1 = new Thread(window);
        thread1.setName("窗口2：");
        thread1.start();

        Thread thread2 = new Thread(window);
        thread2.setName("窗口3:");
        thread2.start();

        //实现卖票 总票数为100

    }
}

class Window implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票成功  票号为" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}