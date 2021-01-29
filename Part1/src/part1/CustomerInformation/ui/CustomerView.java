package part1.CustomerInformation.ui;

import part1.CustomerInformation.CMUtility.readKeyboard;
import part1.CustomerInformation.bean.Customer;
import part1.CustomerInformation.service.CustomerList;


/**
 * 用于用户交互以及 菜单显示
 */
public class CustomerView {

    static CustomerList customerList = new CustomerList(20); //初始化数组库

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        boolean flag = true;
        customerList.addCustomer(new Customer("张三", '男', 21, "123", "465"));
        while (flag) {
            customerView.enterMainmenu();
            int select = new readKeyboard().readInt();
            switch (select) {
                case 1:
                    customerView.addNewCustomer();
                    break;
                case 2:
                    System.out.println("请输入你想改动的客户号：");
                    int x = new readKeyboard().readInt();
                    customerView.replaceCustomer(x);
                    break;
                case 3:
                    System.out.println("请输入你想要删除的客户号：");
                    int y = new readKeyboard().readInt();
                    customerView.deleteCustomer(y);
                    break;
                case 4:
                    System.out.println("你想查看单个还是全部？ 1.全部 2.单个");
                    int e = new readKeyboard().readInt();
                    if (e == 1) {
                        customerList.findAll();
                    } else if (e == 2) {
                        System.out.println("请输入你想看到的客户信息的客户号：");
                        int index = new readKeyboard().readInt();
                        customerList.findForIndex(index);
                    }

                    break;
                case 5:

                    System.out.println("你确定退出吗？输入Y/N");
                    char a = new readKeyboard().readChar();
                    if (a == 'y' || a == 'Y') {
                        return;
                    } else if (a == 'n' || a == 'N') {
                        continue;
                    }
                    break;
                default:
                    System.out.println("无效指令！");
                    continue;
            }
        }


        /**/


    }


    public void enterMainmenu() {
        System.out.println("===客户信息管理系统===");
        System.out.println("=====1.增加客户====");
        System.out.println("=====2.修改客户====");
        System.out.println("=====3.删除信息====");
        System.out.println("=====4.查找客户====");
        System.out.println("=====5.  退出 ====");
        System.out.println("请选择：");
    }

    public void addNewCustomer() {
        Customer customer = new Customer();
        System.out.println("请输入姓名：");
        customer.setName(new readKeyboard().readString());
        System.out.println("请输入性别：");
        customer.setGender(new readKeyboard().readChar());
        System.out.println("请输入年龄：");
        customer.setAge(new readKeyboard().readInt());
        System.out.println("请输入电话号码：");
        customer.setPhone(new readKeyboard().readString());
        System.out.println("请输入电子邮箱：");
        customer.setEmail(new readKeyboard().readString());
        customerList.addCustomer(customer);
    }

    public void replaceCustomer(int index) {
        Customer customer = new Customer();
        System.out.println("请输入姓名：");
        String name = new readKeyboard().readString();
        if (name == null) {
            customer.setName(customerList.getCustomers()[index].getName());
        } else {
            customer.setName(name);
        }
        System.out.println("请输入性别：");
        char sex = new readKeyboard().readChar();
        if (sex == 13) {
            customer.setGender(customerList.getCustomers()[index].getGender());
        } else {
            customer.setGender(sex);
        }
        System.out.println("请输入年龄：");
        int age = new readKeyboard().readInt();
        if (age == 13) {
            customer.setAge(customerList.getCustomers()[index].getAge());
        } else {
            customer.setAge(age);
        }
        System.out.println("请输入电话号码：");
        String phone = new readKeyboard().readString();
        if (phone == null) {
            customer.setPhone(customerList.getCustomers()[index].getPhone());
        } else {
            customer.setPhone(phone);
        }

        System.out.println("请输入电子邮箱：");
        String email = new readKeyboard().readString();
        if (email == null) {
            customer.setEmail(customerList.getCustomers()[index].getEmail());
        } else {
            customer.setEmail(email);
        }

        customerList.replaceCustomer(index, customer);
    }

    public void deleteCustomer(int index) {
        customerList.deleteCustomer(index);
    }

    public void showAllCustomer(int index) {
        System.out.println(customerList.getCustomers()[index]);
    }
}
