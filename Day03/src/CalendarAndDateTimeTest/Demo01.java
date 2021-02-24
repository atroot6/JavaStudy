package CalendarAndDateTimeTest;

import java.util.Calendar;

/*
    java.util.Calendar 类 日历类
    Calendar类 是一个抽象类,里边提供了很多操作日历字段的方法(YEAR \ MOUTH \ DAY_OF_MOUTH \ HOUR)
    Calendar类无法直接创建对象使用,其中的getInstance(),该方法返回了Calendar类的子类对象
    Calendar中有很多成员方法用于对用于日历字段的操作
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历
    get()具体使用方法 1.使用多态的方法 左父右子 调用Calendar的getInstance方法获得calendar的对象
                2.将上一步中的对象直接调用get方法 并传入参数  该方法返回指定的日历字段的值
     set()方法的具体使用
                1.获取对象
                2.进行设置set
                3.调用get方便输出

 */
public class Demo01 {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
        demo();
        System.out.println("==============");
        demo01();

    }

    private static void demo01() {
        //set()方法的使用
        //获取一个对象
        Calendar c = Calendar.getInstance();
//        c.set(Calendar.YEAR,2000);
//        c.set(Calendar.MONTH,5);
//        c.set(Calendar.DAY_OF_MONTH,4);
//        c.set(Calendar.HOUR,18);
//        c.set(Calendar.MINUTE,23);
//        c.set(Calendar.SECOND,56);
        c.set(2021,11,12,21,12,23);

//        输出部分
        int year = c.get(Calendar.YEAR);
//        System.out.println(year);
        int month = c.get(Calendar.MONTH) + 1; //西方的月份是从0 -11
//        System.out.println(month);

        int day = c.get(Calendar.DAY_OF_MONTH);
        int i = c.get(Calendar.HOUR);
        int i1 = c.get(Calendar.MINUTE);
        int i2 = c.get(Calendar.SECOND);

//        System.out.println(year + "." + month + "." + day + "  " + (i + 12)+ ":" + i1 + ":" + i2);
        System.out.println(year + "." + month + "." + day + "  " + (i + 12)+ ":" + i1 + ":" + i2);
    }

    private static void demo() {
//        get()方法的使用
        //使用Clendar的get方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
//        System.out.println(year);
        int month = c.get(Calendar.MONTH) + 1; //西方的月份是从0 -11
//        System.out.println(month);

        int day = c.get(Calendar.DAY_OF_MONTH);
        int i = c.get(Calendar.HOUR);
        int i1 = c.get(Calendar.MINUTE);
        int i2 = c.get(Calendar.SECOND);
        System.out.println(year + "." + month + "." + day + "  " + (i + 12)+ ":" + i1 + ":" + i2);
    }
}
