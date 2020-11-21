package com.company;

import java.sql.SQLOutput;

public class newphone  extends phone  {
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
