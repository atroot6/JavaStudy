package part1.CustomerInformation.service;

import part1.CustomerInformation.bean.Customer;

/**
 * Customer的管理模块 内部用数组管理一组Customer对象 并提供相应的增删改查 和 遍历功能  供CustomerView调用
 */


public class CustomerList {
    private Customer[] customers; //用于保存客户信息的数组
    private int total = 0;  //记录客户的个数

    public CustomerList() {
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public CustomerList(int totalCustoms) {
        this.customers = new Customer[totalCustoms];
    }

    //增加客户
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;

    }

    //修改客户
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = customer;
        return true;
    }

    //删除客户
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = null;
        total--;
        return true;
    }

    //查询指定客户
    public boolean findForIndex(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        System.out.println(customers[index].getName() + "   " + customers[index].getGender() + "   " + customers[index].getAge() + "   " + customers[index].getPhone() + "   " + customers[index].getEmail());
        return true;
    }

    //查询全部客户
    public boolean findAll() {
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].getName() + "   " + customers[i].getGender() + "   " + customers[i].getAge() + "   " + customers[i].getPhone() + "   " + customers[i].getEmail());

        }
        return true;
    }

}
