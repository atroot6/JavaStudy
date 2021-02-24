package Demo01;

/**
 * 自定义异常
 * 1.必须继承于现有异常  RuntimeException（不用显式的处理异常）、Exception（需要处理）
 * 2.提供一个全局变量用于标识该异常serialVersionUID
 * 3.提供重载的构造器
 */
public class demo02Exception extends Exception {
    static final long serialVersionUID = -3387517893124229948L;

    public demo02Exception() {
    }
    public demo02Exception(String msg){
        super(msg);
    }
}
