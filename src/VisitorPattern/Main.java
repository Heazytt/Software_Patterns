package VisitorPattern;

import VisitorPattern.Items.Knife;
import VisitorPattern.Items.MarketItem;
import VisitorPattern.Items.Pistol;
import VisitorPattern.Items.Rifle;
import VisitorPattern.Visitors.MarketVisitor;
import VisitorPattern.Visitors.PriceChecker;
import VisitorPattern.Visitors.SkinType;

public class Main {
    static void main() {
        MarketItem[] items = {
            new Knife(),
            new Pistol(),
            new Rifle()
        };

        MarketVisitor priceChecker = new PriceChecker();
        MarketVisitor skinner = new SkinType();

        System.out.println("Devices:");
        for (MarketItem item : items) {
            item.accept(priceChecker);
            item.accept(skinner);
        }




    }
}
