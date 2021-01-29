package part1.project3.junit;

import org.junit.Test;
import part1.project3.Domain.Employee;
import part1.project3.Service.NameListService;
import part1.project3.Service.TeamException;

public class TeamNameListServiceTest {
    @Test
    public void name() {
        NameListService nameListService = new NameListService();
        Employee[] allEmployees = nameListService.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]); //会自动调取toString方法
        }


    }

    @Test
    public void t1(){
        NameListService nameListService = new NameListService();
        try {
            Employee employee = nameListService.getEmployee(10);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }
}
