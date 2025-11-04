package VisitorPattern.Items;

import VisitorPattern.Visitors.MarketVisitor;

public interface MarketItem {
    void accept(MarketVisitor visitor);
}
