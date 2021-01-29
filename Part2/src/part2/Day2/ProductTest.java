package part2.Day2;

public class ProductTest {
    public static void main(String[] args) {
        /*Clerk clerk = new Clerk();        //暂时到这里
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer();
        new */
        System.out.println("hello");

    }
}

class Producer implements Runnable {  //生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    public Producer() {

    }

    @Override
    public void run() {

    }
}

class Clerk { // 店员
    private Producer producer;

    public Clerk(Producer producer) {
        this.producer = producer;
    }

    public Clerk() {

    }
}

class Consumer implements Runnable { //消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    public Consumer() {

    }

    @Override
    public void run() {

    }
}
