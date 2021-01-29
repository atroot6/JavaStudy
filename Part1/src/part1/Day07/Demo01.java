package part1.Day07;

public class Demo01 {
    public static void main(String[] args) {
        int a = 3;
         a =f(a);
        System.out.println(a);
    }
    public static int f(int n ){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {

          return  2*f(n-1) + f(n-2);
        }

    }
}
