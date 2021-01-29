package part2.Day2;

/**
 * 线程通信
 * 通过共享数据来实现
 * wait方法 执行后 当前线程进入阻塞状态 并释放同步监视器
 * notify 唤醒被被wait的一个方法
 * notifyAll 唤醒全部
 * <p>
 * 1.上述三个方法只能被用在synchronized同步方法体内或者同步代码块中
 * 2.上述三个方法的调用者必须是同步代码块或者同步方法中的同步监视器
 *      否则会出现异常
 * 上述三个方法被定义在java.Lang.Object中
 *
 * sleep() 和 wait()方法的异同
 * 1.相同点
 *      一旦执行，便可使当前线程进入阻塞状态
 * 2.不同点
 *      两个方法声明的位置不同、Thread中定义sleep()，Object中定义wait()
 *      对调用者的要求不同，sleep()可以在需要的任何场景通过Thread调用，而wait只能用在同步代码块或方法里
 *      关于释放同步监视器的问题，wait()会直接释放锁，再次获得需要被唤醒notify()、notifyAll()，然后才有资格再次获得监视器
 *                            sleep()不会释放锁.
 *    sleep():是线程类(Thread)的方法；作用是导致此线程暂停执行指定时间，给执行机会给其他线程，
 *           但是监控状态依然保持，到时后会自动恢复；调用sleep()不会释放对象锁。
 *    wait():是Object类的方法；对此对象调用wait方法导致本线程放弃对象锁，进入等 待此对象的等待锁定池。
 *          只有针对此对象发出notify方法(或notifyAll)后本线程才进入对象锁定池，准备获得对象锁进行运行状态。
 */
public class ThreadCommunication {
    public static void main(String[] args) {
        number number = new number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class number implements Runnable {
    private int num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}