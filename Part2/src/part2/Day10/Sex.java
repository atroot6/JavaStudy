package part2.Day10;

/**
 * className: Sex
 * @author theoldzheng@163.com  @ZYD
 * @version 1.0
 * @description 性别枚举类
 * @create in 2021.2.16 23:42
 */
public enum Sex {
    MALE("男"), FEMALE("女");

    private final String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
