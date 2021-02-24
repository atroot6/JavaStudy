package ThreadTest3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的 方式三
 * 实现Callable接口
 * 1.创建Callable的实现类
 * 2.实现call方法，将线程需要的具体操作声明在call()中，同时call()方法可以有返回值
 * 3.创建Callable实现类的对象
 * 4.将Callable实现类的对象作为参数传递到FutureTask的构造器，并创建FutureTask的对象
 * 5.将FutureTask的对象作为参数传递到Thread类的构造器 创建Thread类的对象，并调用start方法
 * 6.FutureTask类有一有一个get方法可以用于获得上述第2步的返回值
 * <p>
 * 与实现Runnable的创建线程方法，对比，该方法的优势
 * call()方法可以有返回值
 * call()方法可以抛出异常被外界所捕获
 * call()可以支持泛型
 */
public class ThreadNew implements Callable {
    @Override
    public Object call() {
        int num = 0;
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                num += i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        ThreadNew threadNew = new ThreadNew();  //创建Callable类的实现类的对象
        FutureTask futureTask = new FutureTask(threadNew); //创建以Callable实现类对象为参数的FutureTask对象
        Thread thread = new Thread(futureTask); //将FutureTask类的对象作为参数传入Thread类的对象，实现线程的创建


        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
