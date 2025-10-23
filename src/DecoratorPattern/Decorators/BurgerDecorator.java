package DecoratorPattern.Decorators;

import DecoratorPattern.IBurger;

public abstract class BurgerDecorator implements IBurger {
    protected IBurger burger;

    public BurgerDecorator(IBurger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription();
    }

    @Override
    public float getPrice() {
        return burger.getPrice();
    }
}
