package sortTest;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        //冒泡排序

        int[] a = new int[]{1, 5, 3, 6, 55, 48, 51, 0, 2, 4};
        System.out.println(Arrays.toString(a));
        //开始冒泡
        for (int i = 0; i < a.length - 1; i++) { //控制比较轮次
            for (int j = 0; j < a.length - 1 - i; j++) { //控制每轮里的比较次数
                //后面的都是排好了的 无需再排 所以 这里的比较次数要减去前面拍好的i i是每轮产生的一个最大值
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
