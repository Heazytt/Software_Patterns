package ObserverPattern;

import ObserverPattern.Subcribers.User;
import ObserverPattern.Subjects.ItemPriceTraker;

public class Main {
    static void main() {
        ItemPriceTraker awpNeoNoir = new ItemPriceTraker(150.0f, "AWP | Neo-Noir(FT)");

        awpNeoNoir.addSubscriber(new User("Marlen",50.0f));
        awpNeoNoir.addSubscriber(new User("Slava",60.0f));

        awpNeoNoir.setPrice(55.0f);
        awpNeoNoir.setPrice(45.0f);
    }
}
