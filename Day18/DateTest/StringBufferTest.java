package DateTest;

/**
 * 关于StringBuffer的使用
 * String、StringBuffer、StringBuilder的区别
 * String：不可变的字符序列
 * StringBuffer：可变的字符序列，线程安全，效率偏低
 * StringBuilder：可变的字符序列，效率高，但是线程不安全，基于jdk5.0新增 *
 * 上述三种类共同点：底层用char[] 数组存储
 * <p>
 * StringBuffer类无参构造创建一个长度大小为16的char型数组
 * 如果添加不下，那么就需要将原来的数组空充为原来的2倍 + 2，同时会将原有的数组复制到新的数组当中去
 * 建议使用StringBuffer类中的有参构造 指定大小 容量 StringBuffer(int capacity)
 * 三者效率：StringBuilder > StringBuffer > String
 * <p>
 * 增 append
 * 删 delete
 * 改 replace
 * 查 indexOf
 * 插 insert
 * 长度 length
 * 遍历 toString \ for 循环 +charAt
 * String --> StringBuffer、StringBuilder ：直接调用他们的构造器String类型传参即可，反之亦然
 * 也可以通过toString来转换
 */


public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("abc");
        System.out.println("长度为：" + s1.length());//3
        System.out.println(s1);
        s1.append("def");
        System.out.println("长度为：" + s1.length());//6
        s1.insert(2, "123");//在指定位置（非索引）之后插入指定字符串
        System.out.println(s1);
        s1.replace(2, 5, ""); //替换指定位置之后的指定字符串 左闭右开区间
        System.out.println(s1);
        s1.delete(3, 4);     //删除指定位置之后的字符串 左闭右开区间
        System.out.println(s1);
        s1.reverse(); //当前字符串翻转
        System.out.println(s1);
//        indexOf() 查询字符第一次出现位置的索引
        String substring = s1.substring(0, 3); //返回索引区间内的一个子字符串 左开右闭
        System.out.println(substring);


        String s3 = "abc";
        StringBuffer stringBuffer = new StringBuffer(s3);
        System.out.println(stringBuffer);
        StringBuffer stringBuffer1 = new StringBuffer("def");
        String s = stringBuffer1.toString();
        System.out.println(s);

    }

}
