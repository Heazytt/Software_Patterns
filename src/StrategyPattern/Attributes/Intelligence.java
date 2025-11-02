package StrategyPattern.Attributes;

import StrategyPattern.Interfaces.AttributeStrategy;

public class Intelligence implements AttributeStrategy {
    private final String name = "Intelligence";
    private final int hpBonus = 0;
    private final int manaBonus = 80;
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
