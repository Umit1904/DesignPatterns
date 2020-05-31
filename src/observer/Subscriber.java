package observer;

public class Subscriber implements Observer{
    private String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update(Magazine magazine) {
        System.out.println(this.name + " got magazine " + magazine.getName());
    }
}