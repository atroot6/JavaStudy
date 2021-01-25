package Day13.Demo01;

import java.util.Scanner;

public class Demo01 {
    /**
     * 异常处理
     * 两种方式
     * 方式一  --> try - catch - finally
     * 方式二  --> throws + 异常类型
     */
    public static void main(String[] args) {
        /* 方式一：
         *异常的处理、抓抛模型
         * 抛  程序在正常执行的过程中，一旦出现异常，就会在代码异常处生成一个对应的异常类对象，并将此对象抛出
         * 抛出后，其后面的代码将不再执行
         *
         * 抓  异常的处理方式：1.解决异常try-catch-finally、2.继续向上抛出异常.
         *
         * try-catch-finally
         * try{ //包装可能出现问题的代码 出现异常后，会生成对应的异常对象，根据此对象去匹配catch中的异常类型
         *      //在没有写finally结构的情况下执行完catch语句就直接跳出try-catch结构，继续执行其后面的代码         *
         *   }catch（异常类型1  变量名1 ）{
         *      catch处理方式：1.String getMessage()  2.printStackTrace打印堆栈信息
         *   }catch（异常类型2  变量名2 ）{
         *
         *   }....
         * finally{ //finally是一个可选的结构
         *   一定会执行的代码；即使try、catch中有return语句  或者catch中又出现异常 finally也会执行
         *   例如：数据库的连接、输入输出流、网络编程socket等资源，JVM是不能自动回收的，我么需要自己手动进行资源的释放
         *      资源的释放就要放在finally里面
         *
         * }
         *
         * 方式二  --> throws + 异常类型
         * throws + 异常类型  鞋子啊方法声明处，指明在方法执行是可能会抛出异常，一旦方法体执行抛出异常
         * 仍然会在代码异常处生成一个异常类的对象此对象满足throws的异常类型时，就会被抛出，异常后续的代码将不再执行
         *
         * 我们“主动抛一个异常”
         *throw  new RuntimeException("抛出异常");  运行时异常我们一般不做处理
         *throw new Exception("错误信息");  此时我们就需要对异常进行处理 需要处理或者向上抛出
         *
         *自定义异常类 见Demo02Exception
         *
         */
        try {
            int[] a = null;
            System.out.println(a[2]);
            System.out.println("hello");
        } catch (NullPointerException e) {
            //catch中的异常类型一定要是从小到大，父类在下、子类在上
            System.out.println("出现空指针异常！");
        }

        int a = new Scanner(System.in).nextInt();
        try {
            if (a >= 0) {
                System.out.println("");
            } else {
                throw new RuntimeException("数字非法！"); //手动抛出异常  手动生成异常
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        int b = new Scanner(System.in).nextInt();
        try {
            if (b >= 0) {
                System.out.println("");
            } else {
                throw new Exception("数字非法！"); //手动抛出异常  手动生成异常
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("已经处理");
        }
        if (b >= 0) {
            System.out.println("");
        } else {
            try {
                throw new demo02Exception("自定义异常：非法数据！"); //手动抛出异常  手动生成异常
            } catch (demo02Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            } finally {
                System.out.println("已经处理！");
            }
        }
        System.out.println("hello");
    }
}