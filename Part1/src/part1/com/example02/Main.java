package part1.com.example02;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("小红");
        hero.setGrade(21);
        Weapon weapon = new Weapon("国之利刃");
        hero.setWeapon(weapon);
//        System.out.println("年龄为"+hero.getGrade()+"的"+hero.getName()+"拿着"+hero.getWeapon().getCode()+"去打妖怪升级");
        hero.attack();
    }
}
