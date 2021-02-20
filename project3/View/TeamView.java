package View;


import Domain.Employee;
import Domain.Programmer;
import Service.NameListService;
import Service.TeamException;
import Service.TeamService;

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();

    }

    public void enterMainMenu() {

        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag) {

            if (menu != '1') {
                listAllEmployees();
            }
            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    TSUtility.readReturn();
                    break;
                case '2':
                    System.out.println("请输入要添加的成员的ID");
                    int a = TSUtility.readInt();
                    addMember(a);
                    TSUtility.readReturn();
                    break;
                case '3':
                    System.out.println("请输入要删除的团队ID");
                    int b = TSUtility.readInt();
                    deleteMember(b);
                    TSUtility.readReturn();
                    break;
                case '4':
                    System.out.println("是否确认退出！ Y/N");
                    char c = TSUtility.readConfirmSelection();
                    if (c == 'Y') {
                        loopFlag = false;
                    }
                    break;


            }
        }

    }

    //显示所有员工信息
    private void listAllEmployees() {
        System.out.println("-----------------------------开发团队人员调度系统---------------------------------\n");
        Employee[] allEmployees = listSvc.getAllEmployees();
        if (allEmployees == null || allEmployees.length == 0) {
            System.out.println("没有员工信息！");
        } else {
            System.out.println("ID\t姓名\t\t年龄\t工资\t\t\t职位\t\t状态\t\t奖金\t\t\t股票\t\t领用设备");
            for (int i = 0; i < allEmployees.length; i++) {
                System.out.println(allEmployees[i]);
            }
            System.out.println("------------------------------------------------------------------------------");
        }


    }


    private void getTeam() {
        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length ==0){
            System.out.println("团队还没有人");
        }else {
            System.out.println("--------------------------------团队成员--------------------------------------");
            System.out.println("TID/ID\t\t姓名\t\t年龄\t\t工资\t\t职位\t\t\t状态\t\t\t奖金\t\t\t股票\t\t\t领用设备");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getData());
            }
            System.out.println("------------------------------------------------------------------------------");
        }
    }

    private void addMember(int id)  {
        TeamView teamView = new TeamView();
        try {
            Employee employee = teamView.listSvc.getEmployee(id);
            teamSvc.addMember(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteMember(int id) {
        TeamView teamView = new TeamView();
        try {
            teamView.listSvc.getEmployee(id);
            teamSvc.removeMember(id);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }


}
