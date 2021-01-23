package Day12.Demo02;

public class test {
    public static void main(String[] args) {
        ComparableCircle comparableCircle = new ComparableCircle(5.0);
        ComparableCircle comparableCircle1 = new ComparableCircle(5.54);
        int i = comparableCircle.compareTo(comparableCircle1);
        if (i == 0) {
            System.out.println("相等");
        } else if (i == 1) {
            System.out.println("前者大");
        } else if (i == -1) {
            System.out.println("后者大");
        }

    }
}
