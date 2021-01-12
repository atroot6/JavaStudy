package Day04;


import java.util.Arrays;
import java.util.Random;

public class Demo02 {
    /*
    创建一个6个大小的长度的int 数组,要求元素随机生成且元素的值不能相同
     */
    public static void main(String[] args) {
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(30) + 1;
            for (int j = 0; j < i; j++) { //控制比较

                while (a[j] == a[i]) {  //比较 若相通则重新生成
                    a[i] = new Random().nextInt(30) + 1;
                    j = 0; //从头比较
                }

            }

        }
        System.out.println(Arrays.toString(a));
    }
}
/*while (i > 0 && (a[i] == a[i - 1])) {
                a[i] = new Random().nextInt(30) + 1;
            }*/