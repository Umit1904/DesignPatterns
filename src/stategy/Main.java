package stategy;

public class Main {

    public static void main(String [] args){
        Character ch1 = new Character(new Orcs());
        ch1.doSmth();
        ch1.setStrategy(new Pegasus());
        ch1.doSmth();
        Character ch2 = new Character(new Elves());
        ch2.doSmth();
        ch2.setStrategy(new Trolls());
        ch2.doSmth();
    }

}
