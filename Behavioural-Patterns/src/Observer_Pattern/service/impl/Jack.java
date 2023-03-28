package Observer_Pattern.service.impl;

import Observer_Pattern.service.Observer;

public class Jack implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Jack's interface : " + message);
    }
}
