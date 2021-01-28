package project.Service;

public class TeamException extends Exception{
    static final long serialVersionUID = -3387516335424229948L; //标识唯一类

    public TeamException(){
        super();
    }

    public TeamException(String message) {
        super(message);
    }
}
