package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostOffice implements Subject {

    List<Observer> observerList = new ArrayList<>();
    List<Magazine> magazinList = new ArrayList<>();
    Map<Observer, Magazine> collect = new HashMap<>();

    @Override
    public void registerObserver(Observer o, Magazine m) {
        observerList.add(o);
        collect.put(o,m);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
        collect.remove(o);
    }

    @Override
    public void notifyObservers(Magazine magazine) {
        List<Observer> listOfKeys = new ArrayList<>();
        if(collect.containsValue(magazine)) {
            for (Map.Entry<Observer, Magazine> entry : collect.entrySet()) {
                if (entry.getValue().equals(magazine)) {
                    listOfKeys.add(entry.getKey());
                }
            }
        }
        for(Observer o : listOfKeys){
            o.update(magazine);
        }
    }

    public void getFromPublisH(Magazine magazine){
        magazinList.add(magazine);
    }
}
