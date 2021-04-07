package proxy.jdk;

public class Target implements TargetInterface{
    @Override
    public void save() {
        System.out.println("save running......");
    }

    @Override
    public void print() {
        System.out.println("print running......");
    }
}
