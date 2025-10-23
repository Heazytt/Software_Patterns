package DecoratorPattern.Decorators;

import DecoratorPattern.IBurger;

public class MeatDecorator extends BurgerDecorator{
    private String meatAdd = ", with meat";
    private float addingPrice = 0.5f;

    public MeatDecorator(IBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + meatAdd;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + addingPrice;
    }


}
