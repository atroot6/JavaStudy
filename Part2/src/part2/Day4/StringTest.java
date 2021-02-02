package part2.Day4;

/**
 * 为了便于理解String 对其的用法进行了一些测试
 * String类的测试
 * 五个习题
 * 1.模拟trim方法，去除字符串两端的空格
 * 2.将字符串进行反转，将字符串指定部分反转
 * 3.获取一个字符串在另一个字符串中出现的次数
 * 4.获取两个字符串中的最大相同子串
 * 5.将字符串中的字符进行自然顺序的排序
 */
public class StringTest {


    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");


        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false


        String a = new String("abc");
        System.out.println(a.getClass() + "@" + a.hashCode());
        a = "cde";
        String c = a;
        System.out.println(a.getClass() + "@" + a.hashCode());
        System.out.println(c.getClass() + "@" + c.hashCode());

        //习题部分
        //1.模拟trim方法，去除字符串两端的空格
//        String a1 = "abc";
//        a1.trim();

        //2.将字符串进行反转，将字符串  指定部分  反转
        StringBuilder reverse1 = new StringTest().reverse1(s1, 0, 1);
        System.out.println(reverse1);

        //3.获取一个字符串在另一个字符串中出现的次数
        //4.获取两个字符串中的最大相同子串
        System.out.println(new StringTest().getMaxString("ghaiughbiaughbiueghuia", "ghbiau"));
    }

    //2.转换为诶char类型的数组进行反转
    public String reverse(String str, int startIndex, int endIndex) {
        char[] chars;
        if (str != null && str != "") {
            chars = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;

            }
        } else {
            return null;
        }
        return new String(chars); //char转String 直接用构造器
    }

    //使用StringBuffer/StringBuilder替换String
    public StringBuilder reverse1(String str, int startIndex, int endIndex) {
        StringBuilder stringBuilder = new StringBuilder(str.length());

        //第一部分  取前边的部分  装入新建好的StringBuffer
        String substring = stringBuilder.substring(0, startIndex);
        stringBuilder.append(substring);
        //第二部分  将需要操作的部分部分取出来 倒着添加到新的StringBuffer
        for (int i = endIndex; i >= startIndex; i--) {
            stringBuilder.append(str.charAt(i));
        }
        //第三部分  将尾部链接起来
        stringBuilder.append(str.substring(endIndex + 1));
        return stringBuilder;
    }
    //3.获取一个字符串在另一个字符串中出现的次数

    /**
     * 获取subStr在mainStr中出现的次数
     */
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {
           /* index = mainStr.indexOf(subStr);
            while (index != -1){
                count++;
                mainStr = mainStr.substring(index + subLength)
            }*/
            //方法改进
            while (mainStr.indexOf(subStr, index) != -1) {
                count++;
                index += subLength;
            }
        } else {
            return 0;
        }
        return count;
    }

    //4.获取两个字符串中的最大相同子串
    public String getMaxString(String str1, String str2) {
        String maxStr = str1.length() >= str2.length() ? str1 : str2;  //获取最大的字符串
        String minStr = str1.length() < str2.length() ? str1 : str2;   //获取最小的字符串
        int length = minStr.length();   //获得最小的字符串的长度

        for (int i = 0; i < length; i++) {
            for (int x = 0, y = length - i; y <= length; x++, y++) {//一个大轮 直接比较
                String subStr = minStr.substring(x, y);
                if (maxStr.contains(subStr)) {//如果在，直接赋值返回
                    return subStr;
                }
            }
        }
        return null;
    }
}