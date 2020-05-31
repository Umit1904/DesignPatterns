package stategy;

public class Trolls implements BehaviorStrategy, IWalk, Magic {
    @Override
    public void walk() {
        System.out.println("Troll are walking");
    }

    @Override
    public void magic() {
        System.out.println("Troll are doing magic");
    }
    @Override
    public void execute() {
        System.out.println("You chose character Troll");
        walk();
        magic();
    }
}
