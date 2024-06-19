package behevioral.observer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notification(String title) {
        for(Observer o : observers){
            o.notified(title);
        }
    }
}
