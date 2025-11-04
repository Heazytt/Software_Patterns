package ObserverPattern;

public interface Subject {
    void addSubscriber(Subscriber subcriber);
    void removeSubscriber(Subscriber subcriber);
    void notifySubscribers();
}
