package Day05;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        //二分法查找
        //前提->数组有序
        int[] arr = {51, 48, 33, 64, 12, 45, 78, 995, 64, 44, 12, 55, 253, 35};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int dest = 12;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right)/2;

            if (dest == arr[mid]){
                System.out.println("恭喜你找到了,他的下标为:"+mid);
                break;
            }else if (arr[mid]>dest){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
    }
}
