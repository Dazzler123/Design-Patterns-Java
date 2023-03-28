package Observer_Pattern.service;

public interface Subject {
    void register(Observer ob);

    void unregister(Observer ob);

    void notifyAllObservers(String message);
}
