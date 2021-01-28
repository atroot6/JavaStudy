package project.Service;

import project.Domain.Architect;
import project.Domain.Designer;
import project.Domain.Employee;
import project.Domain.Programmer;

/**
 * 开发团队成员的管理 ：添加、删除等操作
 */
public class TeamService {
    private static int counter = 1;  //自增，给memberId赋值时使用
    private final int MAX_MEMBER = 5;  //团队的最大容量
    private Programmer[] team = new Programmer[MAX_MEMBER];  //用来保存Team中的队员
    private int total = 0;  //记录团队的实际人数


    //获取当前团队里的数据
    public Programmer[] getTeam() {
        Programmer[] p = new Programmer[total];

        for (int i = 0; i < total; i++) {
            p[i] = team[i];
        }
        return p;
    }

    /**
     * 添加成员到团队内
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满,无法添加！");
        }
        //不是开发人员
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加！");
        }
        //该成员已经在团队中
        if (isExist(e)) {
            throw new TeamException("该成员已经在团队中，无法添加！");
        }
        //成员已属于某开发团队成员或者员工正在休假
        if ("忙碌".equals(((Programmer) e).getStatus().getNAME())) {  //向下强转  一定不会出现强转异常
            throw new TeamException("该员工已经是某开发团队的成员，无法添加！"); //String 里的 equals方法是经过重写的 所以比较的是内容
        } else if ("VOCATION".equals(((Programmer) e).getStatus().getNAME())) {
            throw new TeamException("该员工正在休假，无法添加！");
        }

        //团队对工种人数的最大数值的限制 架构师 1个  设计师两个 程序员三个
        //首先获取此时此刻团队中架构师、设计师、程序员的个数
        int ArcNum = 0; //架构师
        int DesNum = 0;//设计师
        int ProNum = 0;//程序员

        //统计结果
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                ArcNum++;
            } else if (team[i] instanceof Designer) {
                DesNum++;
            } else if (team[i] instanceof Programmer) {
                ProNum++;
            }
        }

        //将 传入的员工对象e 强转为 programmer类型
        Programmer programmer = (Programmer) e;
        if (programmer instanceof Architect) {
            if (ArcNum >= 1) {
                throw new TeamException("团队中的架构师数量已经达到上限，无法添加！");
            }
        } else if (programmer instanceof Designer) {
            if (DesNum >= 2) {
                throw new TeamException("团队中的设计师数量已经达到上限，无法添加！");
            }
        } else if (programmer instanceof Programmer) {
            if (ProNum >= 3) {
                throw new TeamException("团队中的程序员数量已经达到上限，无法添加！");
            }
        }

        //开始添加
        team[total++] = programmer;
        programmer.setStatus(Status.BUSY);  //将该员工状态改到BUSY
        programmer.setMemberId(counter++);  //为其设置团队内ID
        System.out.println("添加成功！");

    }

    /**
     * 通过memberId删除成员
     * @param memberId
     * @throws TeamException
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                //满足条件开始删除
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //进行整理Team
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        team[--total] = null;
        System.out.println("删除成功！");
        if (i == total){
            throw new TeamException("未找到指定员工！");
        }

    }

    /**
     * 判别该员工是否已经存在于团队
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }
}


