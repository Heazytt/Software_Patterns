package DecoratorPattern;

public class Burger implements IBurger {
    private String basicBurgerName = "Regular burger with buns" ;

    @Override
    public String getDescription() {
        return basicBurgerName;
    }

    @Override
    public float getPrice() {
        return 2;
    }

    public String getBasicBurgerName() {
        return basicBurgerName;
    }

    public void setBasicBurgerName(String basicBurgerName) {
        this.basicBurgerName = basicBurgerName;
    }
}
