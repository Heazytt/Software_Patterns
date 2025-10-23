package DecoratorPattern.Decorators;

import DecoratorPattern.IBurger;

public class TomatoDecorator extends BurgerDecorator{
    private String tomatoAdd = ", with tomato";
    private float addingPrice = 0.2f;


    public TomatoDecorator(IBurger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + tomatoAdd;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + addingPrice;
    }


}
