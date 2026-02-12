package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {

    private int damage = 25;
    private String weaponType = "Sword";

    @Override public int getDamage() { return damage; }
    @Override public String getWeaponType() { return weaponType; }
    @Override public String getWeaponInfo() { return "Iron Sword (Medieval)"; }
    @Override public void displayInfo() { System.out.println(getWeaponInfo() + " | Damage: " + damage); }
}
