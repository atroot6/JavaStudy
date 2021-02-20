package project;

public class Bank {
    private  Customer[] customers; //存放多个客户的数组
    private int numberOfCustomer;
    public  Bank(){
        //空参数构造 初始化变量 或数组 创建对象
    }
    public void addCustomer(String f,String l){

    }
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    public Customer[] getCustomers(int index) {
        return customers;
    }
}
