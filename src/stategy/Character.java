package stategy;

public class Character {
    private BehaviorStrategy strategy;
    public Character(BehaviorStrategy sortingStrategy){
        this.strategy = sortingStrategy;
    }

    public BehaviorStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(BehaviorStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSmth(){
        this.strategy.execute();
    }
}