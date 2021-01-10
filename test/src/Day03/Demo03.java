package Day03;

public class Demo03 {
    /*
    String 他的底层是一个byte类型的final数组   字符串是常量不可改变
    StringBuilder类
    StringBuilder是一个字符缓冲区,他的存在是为了提高效率 塔尔底层也是一个数组byte 但是没有被final修饰 可以改变长度 初始大小为16
    StringBuilder的常用方法
    append()  添加任意数据类型的字符串形式 并返回当前对象自身
    String与StringBuilder的互相转化
    1.String->StringBuilder
    Stringbuilder(String str);
    2.StringBuilder->String
    public String  toString();
     */
    public static void main(String[] args) {
//无参构造
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1:" + s1);
//有参构造
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println("s2:" + s2);
//append方法
        StringBuilder s3 = new StringBuilder();
        System.out.println("s3:" + s3);

        s3.append("abc");
        System.out.println("s3:" + s3);
        System.out.println(s2 == s3);
        s2.append("dadfa");
        System.out.println("s2:" + s2);


    }
}
