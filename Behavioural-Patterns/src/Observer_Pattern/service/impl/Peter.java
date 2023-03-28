package Observer_Pattern.service.impl;

import Observer_Pattern.service.Observer;

public class Peter implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Peter's interface : " + message);
    }
}
