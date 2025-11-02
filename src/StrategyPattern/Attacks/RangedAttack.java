package StrategyPattern.Attacks;

import StrategyPattern.Interfaces.AttackStrategy;

public class RangedAttack implements AttackStrategy {
    private final String name = "Ranged";
    private final String attackMessage = " attacks from distance ";

    public String getName() {
        return name;
    }

    public void attack(String heroName) {
        System.out.println(heroName + attackMessage);
    }
}
