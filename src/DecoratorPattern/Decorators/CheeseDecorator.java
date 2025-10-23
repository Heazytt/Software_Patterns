package DecoratorPattern.Decorators;

import DecoratorPattern.IBurger;

public class CheeseDecorator extends BurgerDecorator{
    private String cheeseAdd = ", with cheese";
    private float addingPrice = 0.2f;

    public CheeseDecorator(IBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + cheeseAdd;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + addingPrice;
    }


}
