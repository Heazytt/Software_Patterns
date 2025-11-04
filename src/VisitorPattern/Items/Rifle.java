package VisitorPattern.Items;

import VisitorPattern.Visitors.MarketVisitor;

public class Rifle implements MarketItem {
    @Override
    public void accept(MarketVisitor visitor) {
        visitor.visit(this);
    }
}
