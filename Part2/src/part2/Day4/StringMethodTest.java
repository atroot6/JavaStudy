package part2.Day4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/**
 * 关于String类的方法
 */
public class StringMethodTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "Hello World";
        System.out.println("原版" + s1); //原版Hello World
        System.out.println(s1.length());  //11
        //取指定索引位置的字符
        System.out.println(s1.charAt(0));//H
        System.out.println(s1.charAt(6));//W
        System.out.println(s1.charAt(7));//o
        //是否为空  返回布尔类型
        System.out.println(s1.isEmpty()); //false
        //转换大小写
        String s2 = s1.toLowerCase();//小写  //新创建
        System.out.println(s1);  //Hello World
        System.out.println(s2); //小写  hello world
        String s3 = s1.toUpperCase();
        System.out.println(s3);//大写 HELLO WORLD
        //忽略前导和尾部空白
        String s4 = "   hello wo r l d  ";
        String s5 = s4.trim();
        System.out.println("--" + s4 + "--"); //--   hello wo r l d  --
        System.out.println("--" + s5 + "--"); //--hello wo r l d--
        //equals()比较字符串内容
        //equalsIgnoreCase 忽略大小写比较
        String s6 = "hello world";
        System.out.println(s6.equals(s1)); //false
        System.out.println(s6.equalsIgnoreCase(s1)); //true
        //连接字符 concat
        String s7 = s1.concat("哈哈哈");
        System.out.println(s7);//Hello World哈哈哈
        //compareTo  调用者-被调用者 这里a-b
        String a = "a";
        String b = "b";
        System.out.println(a.compareTo(b)); //a -b = -1  会涉及到字符串排序
        //提取字符串
        String s8 = s1.substring(0, 5); //左闭右开区间
        System.out.println(s8); //Hello
        System.out.println(s1); //Hello World
        //endWith 是否以指定字符串结尾
        boolean ld = s1.endsWith("ld");
        System.out.println(ld); //true
        //startWith 是否以指定字符串开始
        boolean hell = s1.startsWith("Hell");
        System.out.println(hell); //true
        //字符串是否包含字符
        boolean hello = s1.contains("Hello");
        System.out.println(hello); //true
        //indexOf 查找指定字符第一次出现的位置的索引
        int wo = s1.indexOf("Wo"); //有则返回索引 无则返回-1
        System.out.println(wo); //6
        int lo = s1.indexOf("lo", 2);
        System.out.println(lo); //3
        //lastIndexOf 从后往前找
        //replaceAll  把字符串中的数字替换成，如果开头和结尾有“，”的话就去掉
        String s9 = "2heladfoj545542dada1";
        String s = s9.replaceAll("\\d", ",").replaceAll("^,|,$", ""); //正则表达式
        System.out.println(s9);  //2heladfoj545542dada1
        System.out.println(s);  //heladfoj,,,,,,dada
        //判断字符串是否全部由数字组成
        boolean matches = s1.matches("\\d+");
        System.out.println(matches); //false
        //判断是否为某地区被电话
        String tel = "0349-1234567";
        boolean matches1 = tel.matches("0349-\\d{7,8}");//后面跟了7、8位数字
        System.out.println(matches1); //true
        //split 切分
        //String  -> char []
        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));
        //将char型数组转为String
        char[] ch1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        String ss = new String(ch1);
        System.out.println(ss);
        //String 转换为 byte[]
        String str = "abc123汉字";
        byte[] bytes = str.getBytes();//默认采用UTF-8
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str.getBytes("gbk"); //采用gbk编码格式
        System.out.println(Arrays.toString(gbks));


    }
}
