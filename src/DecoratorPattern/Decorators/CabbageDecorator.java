package DecoratorPattern.Decorators;

import DecoratorPattern.IBurger;

public class CabbageDecorator extends BurgerDecorator {
    private String cabbageAdd = ", with cabbage";
    private float addingPrice = 0.2f;

    public CabbageDecorator(IBurger IBurger) {
        super(IBurger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + cabbageAdd;
    }

    @Override
    public float getPrice() {
        return super.getPrice() + addingPrice;
    }

}
