package Day12.Demo02;

public interface CompareObject {
    /** 定义一个接口来实现两个对象的比较
     * 若返回值为0，则代表相等；若为整数，代表当前对象大，负数代表当前对象小
     */
    public abstract int compareTo(Object o);
}
