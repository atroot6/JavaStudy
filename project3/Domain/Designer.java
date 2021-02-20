package Domain;

public class Designer extends Programmer {
    protected double bonus; //奖金



    public Designer(int id, String name, int age, double salary,  Equipment equipment, double bonus) {
        super(id, name, age,salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString(){
        return getDetails() + "\t" + "\t设计师\t" + getStatus() + "\t" +bonus + "\t" + "\t\t\t" + getEquipment().getDescription();
    }
    public String getData(){
        return getMemberId() + "/" + getId() + "\t\t" +getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "设计师\t\t" + getStatus() + "\t" + getBonus() ;
    }
}
