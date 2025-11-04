package VisitorPattern.Items;

import VisitorPattern.Visitors.MarketVisitor;

public class Pistol implements MarketItem {
    @Override
    public void accept(MarketVisitor visitor) {
        visitor.visit(this);
    }
}
