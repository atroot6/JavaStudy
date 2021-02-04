package part2.Day7;

/**
 * 商品类
 */
public class Goods implements Comparable {
    private String name;
    private Double price;

    public Goods() {
    }

    public Goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 指明比较大小的方式
     *当前对象大于形参时，返回正整数，小于形参返回负整数、等于形参返回0
     * @return int
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods good = (Goods) o;
            if (this.price > good.price) {
                return 1;
            } else if (this.price < good.price) {
                return -1;
            } else {
//                return 0;
//                在需要 再次进行排序的时候 可以在这里写入方法
                return -this.name.compareTo(good.name);  //此处减号代表的是 从高到底
            }
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
