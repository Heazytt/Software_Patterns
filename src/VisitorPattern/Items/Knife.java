package VisitorPattern.Items;

import VisitorPattern.Visitors.MarketVisitor;

public class Knife implements MarketItem {
    @Override
    public void accept(MarketVisitor visitor) {
        visitor.visit(this);
    }
}
