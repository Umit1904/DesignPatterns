package observer;

public interface Subject {
    void registerObserver(Observer o, Magazine m);
    void removeObserver(Observer o);
    void notifyObservers(Magazine m);
    void getFromPublisH(Magazine m);
}