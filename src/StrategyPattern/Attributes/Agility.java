package StrategyPattern.Attributes;

import StrategyPattern.Interfaces.AttributeStrategy;

public class Agility implements AttributeStrategy {
    private final String name = "Agility";
    private final int hpBonus = 0;
    private final int manaBonus = 0;
    private final int agilityBonus = 15;

    public String getName() {
        return name;
    }

    public int getHpBonus() {
        return hpBonus;
    }

    public int getManaBonus() {
        return manaBonus;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }
}