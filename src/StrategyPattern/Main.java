package StrategyPattern;

import StrategyPattern.Attributes.*;
import StrategyPattern.Attacks.*;

public class Main {
    public static void main(String[] args) {

        Hero invoker = new Hero("Invoker", new Intelligence(), new RangedAttack());
        invoker.showInfo();
        invoker.attack();

        Strength strength = new Strength();
        invoker.setAttackType(new MeleeAttack());
        invoker.showInfo();
        invoker.attack();



    }
}
