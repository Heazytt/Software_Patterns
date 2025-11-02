package StrategyPattern;

import StrategyPattern.Interfaces.AttackStrategy;
import StrategyPattern.Interfaces.AttributeStrategy;

public class Hero {
    private String name;
    private AttributeStrategy attribute;
    private AttackStrategy attackType;

    private final int baseHp = 400;
    private final int baseMana = 120;
    private final int baseAgility = 10;

    private int totalHp;
    private int totalMana;
    private int totalAgility;

    private final String heroInfoHeader = "\n=== Hero Info ===";
    private final String nameLabel = "Name: ";
    private final String attributeLabel = "Attribute: ";
    private final String attackTypeLabel = "Attack Type: ";
    private final String hpLabel = "HP: ";
    private final String manaLabel = "  Mana: ";
    private final String agilityLabel = "  Agility: ";

    public Hero(String name, AttributeStrategy attribute, AttackStrategy attackType) {
        this.name = name;
        this.attribute = attribute;
        this.attackType = attackType;
        recalcStats();
    }

    private void recalcStats() {
        this.totalHp = baseHp + attribute.getHpBonus();
        this.totalMana = baseMana + attribute.getManaBonus();
        this.totalAgility = baseAgility + attribute.getAgilityBonus();
    }

    public void setAttribute(AttributeStrategy newAttribute) {
        this.attribute = newAttribute;
        recalcStats();
    }

    public void showInfo() {
        System.out.println(heroInfoHeader);
        System.out.println(nameLabel + name);
        System.out.println(attributeLabel + attribute.getName());
        System.out.println(attackTypeLabel + attackType.getName() );
        System.out.println(hpLabel + totalHp + manaLabel + totalMana + agilityLabel + totalAgility);
    }

    public void attack() {
        attackType.attack(name);
    }

    public void setAttackType(AttackStrategy attackType) {
        this.attackType = attackType;
    }
}
