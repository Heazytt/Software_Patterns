package ObserverPattern.Subjects;

import ObserverPattern.Subcribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ItemPriceTraker implements Subject {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private float price;
    private final String itemName;

    public ItemPriceTraker(float price, String itemName) {
        this.price = price;
        this.itemName = itemName;
    }

    @Override
    public void addSubscriber(Subscriber subcriber) {
        subscribers.add(subcriber);
    }

    @Override
    public void removeSubscriber(Subscriber subcriber) {
        subscribers.remove(subcriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(itemName, price);
        }
    }

    public void setPrice(float price) {
        this.price = price;
        notifySubscribers();
    }
}
