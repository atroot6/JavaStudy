package part2.Day3;

/**
 * 线程的通信
 * 经典例题：生产者消费者问题
 * 生产者producer 店员clerk 消费者customer
 * 店员只能持有20个产品 当持有大于等于20的时候 会命令生产者暂时停止生产
 * 等店里有了位置放产品，会再次通知生产者 继续开始生产
 * 如果店里没有产品，那么会通知消费者等一下，等店里有了产品再通知消费者来取走产品
 * <p>
 * 问题考虑：生产者比消费者快时，消费者会漏掉一些产品没有取到，消费者比生产者快的时候，消费者会取到相同的数据
 * <p>
 * 多线程：生产者线程、消费者线程
 * 存在共享数据、产品的数量、店员(或者产品)
 * 同步机制、线程通信
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer Consumer = new Consumer(clerk);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(Consumer);

        t1.setName("生产者");
        t2.setName("消费者");

        t1.start();
        t2.start();


        System.out.println("hello");

    }
}

class Clerk {
    private int productCount = 0;

    //生产产品
    public synchronized void produceProduct() {
        if (productCount < 20) {
            productCount++;
            System.out.println(Thread.currentThread().getName() + ":开始生产产品" + productCount);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消费产品
    public synchronized void consumerProduct() {
        if (productCount > 0) {
            System.out.println(Thread.currentThread().getName() + "：开始消费产品" + productCount);
            productCount--;
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable { //生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产商品！");
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Consumer implements Runnable {     //消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费商品！");
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumerProduct();
        }
    }
}