package VisitorPattern.Visitors;

import VisitorPattern.Items.Knife;
import VisitorPattern.Items.Pistol;
import VisitorPattern.Items.Rifle;

public class PriceChecker implements MarketVisitor {
    private float knifePrice = 50.0f;
    private float pistolPrice = 150.0f;
    private float riflePrice = 300.0f;

    @Override
    public void visit(Knife knife) {
        System.out.print(knifePrice);
    }

    @Override
    public void visit(Pistol pistol) {
        System.out.print(pistolPrice);
    }

    @Override
    public void visit(Rifle rifle) {
        System.out.print(riflePrice);
    }
}
