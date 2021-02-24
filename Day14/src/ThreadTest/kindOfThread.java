package ThreadTest;

/**
 * 线程 一个程序可以分为多个线程、线程是程序内部的一条执行路径
 * 线程作为调度和执行的单位，每个线程都拥有独立的运行栈和程序计数器（pc），线程切换的开销小
 * 多个线程会共享进程的相同的内存单元和堆（方法区和堆）
 * 线程的创建和使用
 * java.lang.Thread
 * 方式一：创建一个继承于Thread类的子类，并重写Thread中的run（）方法 将次线程要做的事 写在run里
 *          创建Thread类的子类的对象 ，通过此对象调用start（）方法
 */
public class kindOfThread extends Thread {
    //重写run
    @Override
    public void run() {
        super.run();
        //写该线程要做的事情
        //寻找0-100里的偶数
        for (int i = 0; i <= 100; i++) {
            if ( i % 2 == 0){
                System.out.println(i + "\t" + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        //创建子类对象 并调用start方法
        kindOfThread thread = new kindOfThread(); //主线程
        //start(); 启动当前线程  调用当前线程的run方法
        //不能通过直接调用 run方法来开辟多线程
        //不可以让已经用过的start的线程再去执行
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("hello"+ "\t" + Thread.currentThread().getName());
        }

        kindOfThread thread1 = new kindOfThread();
        thread1.start();

        //也可以应用匿名子类的方法来写多线程
    }

}
