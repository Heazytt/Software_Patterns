package StrategyPattern.Attributes;

import StrategyPattern.Interfaces.AttributeStrategy;

public class Universal implements AttributeStrategy {
    private final String name = "Universal";
    private final int hpBonus = 80;
    private final int manaBonus = 80;
    private final int agilityBonus = 8;

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
