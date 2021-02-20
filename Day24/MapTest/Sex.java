package MapTest;

/**
 * className: Sex
 * @author theoldzheng@163.com  @ZYD
 * @version 2.0
 * @description 性别的枚举类，男性：MALE 女性：FEMALE
 * @create in 2021.2.16 23:42
 */
public enum Sex {
    MALE("男"), FEMALE("女");  //提供对象，以及其属性描述

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
