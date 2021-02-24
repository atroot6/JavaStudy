package ThreadTest3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 方法四 线程池
 * 利用线程池来创建线程
 * 1.提供指定数量的线程池
 * 2.执行指定的线程操作，需要提供实现Runnable接口或者Callable接口实现类的对象
 * 3.关闭连接池
 *
 * 优点：1.提高响应速度(减少了创建新进程的时间)
 *      2.降低资源消耗(重复利用线程池中的线程，不需要每次都创建)
 *      3.便于线程管理
 *          corePoolSize:线程池的大小
 *          maximumPoolSize：最大线程数
 *          keepAliveTime:线程没有任务时最多保持多长时间后会终止
 *
 */
public class ThreadPool implements Runnable{
    @Override
    public void run() {
        int num = 0;
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                num += i;
            }
        }
    }

    public static void main(String[] args) {
        //1.提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10); //这里的Executors是一个工具类
        //2.执行指定的线程操作，需要提供Runnable接口或者Callable接口实现类的对象
        service.execute(new ThreadPool());
        //3.关闭连接池
        service.shutdown();
    }
}
