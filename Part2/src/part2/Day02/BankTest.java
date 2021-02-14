package part2.Day02;

/**
 * 问题描述：两个用户，一个账户，两个用户每次向这个账户存钱1000，存3次，每次存完都要打印当前账户余额
 */
public class BankTest {
    public static void main(String[] args) {
        Account account = new Account();  //创建一个账户
        Customer customer = new Customer(account);
        Thread y1 = new Thread(customer);
        Thread y2 = new Thread(customer);

        y1.setName("张三");
        y2.setName("李四");

        y1.start();
        y2.start();
    }
}

class Customer implements Runnable {
    private Account acc; //声明一个账户acc

    public Customer(Account acc) {  //一定要记的对acc进行构造 初始化
        this.acc = acc;
    }

    @Override
    public void run() { //重写存钱方法，并加上同步机制
        addMoney(1000);
    }

    public synchronized void addMoney(int add) {
        for (int i = 0; i < 3; i++) {
            acc.addMoney(add);
            System.out.println("用户:" + Thread.currentThread().getName() + "存钱后\t余额：" + acc.getTotalMoney());
        }
    }
}

class Account {
    private int totalMoney = 0;

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void addMoney(int add) {
        totalMoney += add;
    }
}