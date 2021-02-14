package part2.Day08;

/**
 * 枚举类
 * 枚举类的对象是有限个，且是确定的。例如星期、性别、季节、支付方式、就职状态等等
 * 所以：当定义一组常量时，建议使用枚举类
 * 若枚举类只有一个对象，则可以作为一种单例模式的实现方式
 */
public class EnumTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        System.out.println(spring);
        System.out.println(summer);
    }
}

/**
 * 自定义枚举类
 */
class Season {
    private final String seasonName;
    private final String seasonDesc;

    //私有化构造器，并给对象属性初始化
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供当前枚举的多个对象
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "烈日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "雪花纷飞");

    //提供枚举类的对象属性的获取方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //重写toString方法

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}