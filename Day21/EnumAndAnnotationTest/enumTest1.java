package EnumAndAnnotationTest;

public class enumTest1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        Season1 summer = Season1.SUMMER;
        System.out.println(spring);
        System.out.println(summer);
        //values() 返回枚举类型数组
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        //values() 精确查找  根据提供的参数找到枚举类的相关对象 如果没有则会抛出异常
        Season1 spring1 = Season1.valueOf("SPRING");
        System.out.println(spring1);

        //toString() 方法  返回枚举类对象当前的常量名称
        //使用enum关键字定义的枚举类实现接口的情况
            //实现接口  并且在enum类中实现\重写抽象方法

    }
}

/**
 * 使用enum来定义枚举类
 * enum 会自动继承java.lang.Enum类
 */
enum Season1 {
    //提供当前枚举的多个对象
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "雪花纷飞");

    private final String seasonName;
    private final String seasonDesc;

//    私有化构造器，并给对象属性初始化
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


//    提供枚举类的对象属性的获取方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //重写toString方法  可写可不写,若不写,那么就会执行其父类的toString()方法
    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}