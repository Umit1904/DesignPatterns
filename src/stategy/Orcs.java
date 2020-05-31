package stategy;

public class Orcs implements BehaviorStrategy, IWalk {
    @Override
    public void walk() {
        System.out.println("Orc are walking");
    }

    @Override
    public void execute() {
        System.out.println("You chose character Orc");
        walk();
    }
}
