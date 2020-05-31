package observer;

public class MainPostOffice {
    public static void main(String [] args){
        Subject postOffice = new PostOffice();
        Magazine magazine1 = new Magazine("Health");
        Magazine magazine2 = new Magazine("Kitchen");
        postOffice.getFromPublisH(magazine1);
        postOffice.getFromPublisH(magazine2);

        Observer observer1 = new Subscriber("John");
        Observer observer2 = new Subscriber("Matt");
        Observer observer3 = new Subscriber("Jackie");
        Observer observer4 = new Subscriber("Tim");

        postOffice.registerObserver(observer1, magazine1);
        postOffice.registerObserver(observer2, magazine1);
        postOffice.registerObserver(observer3, magazine2);
        postOffice.registerObserver(observer4, magazine2);
        postOffice.registerObserver(observer4, magazine1);

        postOffice.notifyObservers(magazine1);
        postOffice.notifyObservers(magazine2);
        System.out.println();

        postOffice.removeObserver(observer1);
        postOffice.removeObserver(observer4);
        postOffice.notifyObservers(magazine1);
        postOffice.notifyObservers(magazine2);
    }
}