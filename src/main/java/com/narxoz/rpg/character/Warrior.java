package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Warrior implements Character {

    private String name;
    private int health = 150;
    private int mana = 30;
    private int strength = 80;
    private int intelligence = 20;

    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) { this.name = name; }

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getMana() { return mana; }
    @Override public int getStrength() { return strength; }
    @Override public int getIntelligence() { return intelligence; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health + " | Mana: " + mana + " | Strength: " + strength + " | Intelligence: " + intelligence);
    }

    @Override public void useSpecialAbility() { System.out.println(name + " uses BERSERKER RAGE!"); }
    @Override public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    @Override public void equipArmor(Armor armor) { this.armor = armor; }

    @Override
    public void displayEquipment() {
        if (weapon != null) weapon.displayInfo();
        if (armor != null) System.out.println("Armor: " + armor.getArmorInfo());
    }
}
