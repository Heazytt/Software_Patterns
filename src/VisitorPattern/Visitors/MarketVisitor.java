package VisitorPattern.Visitors;

import VisitorPattern.Items.Knife;
import VisitorPattern.Items.Pistol;
import VisitorPattern.Items.Rifle;

public interface MarketVisitor {
    void visit(Knife knife);
    void visit(Pistol pistol);
    void visit(Rifle rifle);
}
