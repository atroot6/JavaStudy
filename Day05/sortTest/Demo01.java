package sortTest;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 4, 2, 3, 6};
//        int [] b =a;
        int x = 0;
        int y = a.length - 1;
        for (int i = 0; x <= y; i++) {


            if (x < y) {
                int temp = a[x];
                a[x] = a[y];
                a[y] = temp;
                x++;
                y--;
            } else if (x == y) {
                int temp;
                temp = a[x];
                a[x] = a[y];
                a[y] = temp;
            }

        }
        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
    }


}
