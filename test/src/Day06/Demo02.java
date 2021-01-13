package Day06;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.first();
    }
    public void first(){
        int i = 5;
        Value value = new Value();
        value.i = 25;
        second(value,i);        // 0 0   执行后 弹栈 弹栈之后 value 指向原来的东西 但是被修改为20
        System.out.println(value.i); //0   //打印
    }
    public void second(Value value, int i ){
        i = 0;
        value.i = 20;
        Value value1 = new Value();
        System.out.println("哈哈"+value1.i);
        value = value1;
        System.out.println(value.i+"  "+i);
    }
    class Value {
        int i = 15;
    }
}
