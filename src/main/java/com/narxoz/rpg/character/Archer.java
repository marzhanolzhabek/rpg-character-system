package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Archer implements Character {

    private String name;
    private int health = 100;
    private int mana = 50;
    private int strength = 50;
    private int intelligence = 50;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name) { this.name = name; }

    @Override public String getName() { return name; }
    @Override public int getHealth() { return health; }
    @Override public int getMana() { return mana; }
    @Override public int getStrength() { return strength; }
    @Override public int getIntelligence() { return intelligence; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health + " | Mana: " + mana + " | Strength: " + strength + " | Intelligence: " + intelligence);
    }

    @Override public void useSpecialAbility() { System.out.println(name + " uses RAIN OF ARROWS!"); }
    @Override public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    @Override public void equipArmor(Armor armor) { this.armor = armor; }

    @Override
    public void displayEquipment() {
        if (weapon != null) weapon.displayInfo();
        if (armor != null) System.out.println("Armor: " + armor.getArmorInfo());
    }
}
