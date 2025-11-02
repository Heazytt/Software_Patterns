package StrategyPattern.Attributes;

import StrategyPattern.Interfaces.AttributeStrategy;

public class Strength implements AttributeStrategy {
    private final String name = "Strength";
    private final int hpBonus = 200;
    private final int manaBonus = 0;
    private final int agilityBonus = 0;

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
