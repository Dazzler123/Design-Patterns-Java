package Observer_Pattern.service.impl;

import Observer_Pattern.service.Observer;
import Observer_Pattern.service.Subject;

import java.util.ArrayList;

public class Tom implements Subject {
    ArrayList<Observer> allObservers = new ArrayList<>();

    @Override
    public void register(Observer ob) {
        allObservers.add(ob);
    }

    @Override
    public void unregister(Observer ob) {
        allObservers.remove(ob);
    }

    @Override
    public void notifyAllObservers(String message) {
        for (Observer allObserver : allObservers) {
            //calls the update method in all observers
            allObserver.update(message);
        }
    }
}
