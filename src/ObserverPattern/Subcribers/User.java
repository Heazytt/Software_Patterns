package ObserverPattern.Subcribers;

public class User implements Subscriber {
    private String name;
    private float alertPrice;

    private String helloMessage = "Hello ";
    private String alertMessage = ", the price of ";
    private String droppedMessage = " has dropped to ";

    public User(String name, float alertPrice) {
        this.name = name;
        this.alertPrice = alertPrice;
    }

    @Override
    public void update(String itemName, float price) {
        if (price <= alertPrice) {
            System.out.println(helloMessage + name + alertMessage + itemName + droppedMessage + price + "\n");
        }
    }
}
