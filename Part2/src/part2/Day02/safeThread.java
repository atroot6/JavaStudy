package part2.Day02;

/**
 * 线程的安全问题
 * 多个线程执行的不确定性引起执行结果的不稳定
 * 多个线程对账本的共享，会造成操作的不完整性，会破坏数据
 * <p>
 * 此处用卖票系统来做实例（卖票出现了重票错票）  称为线程安全问题
 * 出现问题的原因  多个线程同时操作数据
 * 解决措施：当线程在操作数据时，进行加锁 ，另其他线程无法君如操作
 * 在操作系统中我们常用的方式是加信号灯，通过操作信号灯 以及判断信号灯来实现线程、进程的控制
 * <p>
 * 在Java中我们通常有两种方式来解决该问题
 * 方式一：同步代码块
 * synchronized(同步监视器){
 * //需要被同步的代码块
 * }
 * 说明：1.操作共享数据的代码，要被放入被synchronized方法包含的代码块中
 * 2.同步监视器：俗称锁，是锁的一种应用体现，任何一个类的对象都可以充当一个锁，但是 要保证，多个线程必须同用一把锁
 * 方式二：同步方法
 *      如果要执行的 同步代码快在一个方法里  那么可以直接将方法声明为同步方法
 *      格式： public synchronized faction(){
 *          方法体;
 *      }
 *      注意：1.非静态同步方法体中的同步监视器为this，静态的同步方法中，同步监视器为当前类本身（***。class），类只有一个 所以为安全的
 *           2.若创建线程的方法为继承Thread类的，那么就需要将该同步方法体 设置为static的方法体
 *
 */
public class safeThread {

    public static void main(String[] args) {
        window w1 = new window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");
        t1.start();
        t2.start();
        t3.start();


    }
}

class window implements Runnable {
    int ticket = 100;

    //    Object o = new Object();
    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                if (ticket > 0) {
                    /*try { //在使用了synchronized（同步监视器） 同步代码块后 即使加上了阻塞，也不会有其他线程来占用CPU来执行他们的线程
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println(Thread.currentThread().getName() + "卖票成功  票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}
