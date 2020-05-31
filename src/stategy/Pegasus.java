package stategy;

public class Pegasus implements BehaviorStrategy, IWalk, IFly{
    @Override
    public void fly() {
        System.out.println("Pegasus are flying");
    }

    @Override
    public void walk() {
        System.out.println("Pegasus are walking");
    }

    @Override
    public void execute() {
        System.out.println("You chose character Pegasus");
        walk();
        fly();
    }
}
