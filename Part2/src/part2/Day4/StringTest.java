package part2.Day4;

/**
 * 为了便于理解String 对其的用法进行了一些测试
 * String类的测试
 */
public class StringTest {
    String a = new String("good");

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");


        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false


        String a = new String("abc");
        System.out.println(a.getClass()+"@"+a.hashCode());
        a = "cde";
        String c = a;
        System.out.println(a.getClass()+"@"+a.hashCode());
        System.out.println(c.getClass()+"@"+c.hashCode());


    }
}
