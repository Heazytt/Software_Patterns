package StrategyPattern.Attacks;

import StrategyPattern.Interfaces.AttackStrategy;

public class MeleeAttack implements AttackStrategy {
    private final String name = "Melee";
    private final String attackMessage = " attacks in melee ";

    public String getName() {
        return name;
    }

    public void attack(String heroName) {
        System.out.println(heroName + attackMessage);
    }
}
