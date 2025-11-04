package ObserverPattern.Subjects;

import ObserverPattern.Subcribers.Subscriber;

public interface Subject {
    void addSubscriber(Subscriber subcriber);
    void removeSubscriber(Subscriber subcriber);
    void notifySubscribers();
}
