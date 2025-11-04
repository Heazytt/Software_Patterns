package VisitorPattern.Visitors;

import VisitorPattern.Items.Knife;
import VisitorPattern.Items.Pistol;
import VisitorPattern.Items.Rifle;

public class SkinType implements MarketVisitor {
    private String knifeSkin = " — M9 Bayonet | Doppler";
    private String pistolSkin = " — Desert Eagle | Blaze";
    private String rifleSkin = " — AK-47 | Redline";


    @Override
    public void visit(Knife knife) {
        System.out.println(knifeSkin);
    }

    @Override
    public void visit(Pistol pistol) {
        System.out.println(pistolSkin);
    }

    @Override
    public void visit(Rifle rifle) {
        System.out.println(rifleSkin);
    }
}
