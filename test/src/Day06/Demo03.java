package Day06;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        double [] a = new double []{12,3,3,34,56,77,432};
        System.out.println(Arrays.toString(a));

        for (int i = a.length-1; i >=0; i--) {

                a[i] = (a[i] / a[0]);


        }
        System.out.println(Arrays.toString(a));
    }
}
