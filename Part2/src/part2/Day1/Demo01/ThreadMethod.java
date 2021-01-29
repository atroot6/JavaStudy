package part2.Day1.Demo01;

/**
 * Thread中常用的方法
 * 1.start()方法 ：启动当前线程，调用线程中run方法
 * 2.run()方法 ：通过重写Thread中的该方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread()方法：静态方法，返回当前代码执行的线程
 * 4.getName()：返回当前线程的名字
 * 5.setName()：设置当前线程的名字  -->也可以通过构造器来对线程命名
 * 6.yield(): 释放当前线程CPU的执行权
 * 7.join()： 若在线程b中 调用线程a的join()方法，那么线程b会进入阻塞状态 直到线程a执行完毕，b才会恢复状态
 * 8.stop()：已过时 不推荐使用 强制结束当前线程
 * 9.sleep(long millitime)：静态 让指定线程睡眠 指定的毫秒值
 * 10.isAlive()：判断当前线程是否存活 返回true或false
 *
 * 线程通信 ：wait()/notify()/notifyAll() 这三个方法定义在object类中
 *
 * <p>
 * 线程的优先级
 * MAX_PRIORITY = 10 //最大
 * MIN_PRIORITY = 1  //最小
 * NORM_PRIORITY = 5 //默认
 * 1.如何获取和设置当前线程的优先级
 * getPriority()
 * setPriority()
 * 说明 高优先级的线程要抢占低优先级的线程的CPU控制权，但是并不会等高优先级的线程执行完毕才去执行低优先级的线程
 */
public class ThreadMethod extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + ":\t" + i + "优先级" + Thread.currentThread().getPriority());
        }
    }

    public ThreadMethod() {

    }

    public ThreadMethod(String name) {
        super(name);
    }

    public static void main(String[] args) {
        //getName setName方法的测试
        ThreadMethod threadMethod = new ThreadMethod("线程一");
        threadMethod.setPriority(MAX_PRIORITY);
        threadMethod.start();

        ThreadMethod threadMethod1 = new ThreadMethod();
        threadMethod1.setName("线程二");
        threadMethod1.start();

        Thread.currentThread().setName("主线程");
        System.out.println("主线程优先级为：" + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println("主线程优先级为：" + Thread.currentThread().getPriority());
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + ":\t" + i);
        }
    }
}
