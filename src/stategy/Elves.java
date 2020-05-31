package stategy;

public class Elves implements BehaviorStrategy, IWalk{
    @Override
    public void walk() {
        System.out.println("Elf are walking");
    }
    @Override
    public void execute() {
        System.out.println("You chose character Elf");
        walk();
    }
}
