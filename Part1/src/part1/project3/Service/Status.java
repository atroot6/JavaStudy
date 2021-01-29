package part1.project3.Service;

public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    public static final  Status FREE = new Status("空闲");
    public static final  Status BUSY = new Status("忙碌");
    public static final  Status VOCATION = new Status("VOCATION");

    @Override
    public String toString(){
        return getNAME() + "\t";
    }
}
