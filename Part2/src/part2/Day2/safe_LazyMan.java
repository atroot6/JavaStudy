package part2.Day2;

/**
 * 用同步机制，将单例模式中的懒汉式改为线程安全的
 */
public class safe_LazyMan {
}

class Bank {
    private Bank() {

    }

    private static BankTest instance = null;

    /*
        public static synchronized  Bank getInstance(){  //加关键字synchronized 或者方法体
            if (instance == null){                       //或者加上同步代码快
                instance = new Bank();                   //以上两种方式都是比较慢的方式
            }
            return instance;
        }*/
    //效果最好
    public static BankTest getInstance() {
        if (instance == null) { ///将入双重的判断  如果不满足直接不进行排队，直接拿结果
            synchronized (BankTest.class) {
                if (instance == null) {
                    instance = new BankTest();
                }
            }
        }
        return instance;
    }
}