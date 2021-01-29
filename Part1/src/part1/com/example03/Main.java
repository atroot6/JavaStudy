package part1.com.example03;

//匿名内部类的实现场景

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("小兰");
//        普通的调用方式-使用实现接口类调用
       /* hero.setSkill(new SkillImpl()); //使用单独定义的实现类
        //设置技能  因为技能是一个接口  所以必须是先得实现接口中的技能才能对其进行调用*/
        //使用匿名内部类来调用
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("使用匿名内部类来完成技能释放!");
//            }
//        };
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("使用匿名内部类来完成技能释放!");
            }
        });
        hero.attack();
    }
}