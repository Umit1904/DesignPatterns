package stategy;

public class Vampires implements BehaviorStrategy, IWalk, IFly {
    @Override
    public void fly() {
        System.out.println("Vampire are flying");
    }

    @Override
    public void walk() {
        System.out.println("Vampire are walking");
    }

    @Override
    public void execute() {
        System.out.println("You chose character Vampires");
        walk();
        fly();
    }
}
