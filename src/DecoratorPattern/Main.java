package DecoratorPattern;

import DecoratorPattern.Decorators.*;

public class Main {
    static void main() {

        IBurger BigHit = new Burger();

        BigHit = new MeatDecorator(new CheeseDecorator(new TomatoDecorator(new CabbageDecorator(BigHit))));
        System.out.println(BigHit.getDescription() + " |Price:"+BigHit.getPrice());
    }
}
