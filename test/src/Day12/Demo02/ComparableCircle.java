package Day12.Demo02;

/**
 * 比较圆的半径的大小
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareObject) {
            ComparableCircle c = (ComparableCircle) o;  //进行强转
            if (this.getRadius() < c.getRadius()) {
                return -1;
            } else if (this.getRadius() > c.getRadius()) {
                return 1;
            } else {
                return 0;
            }
        }
        throw new RuntimeException("00");
    }
}