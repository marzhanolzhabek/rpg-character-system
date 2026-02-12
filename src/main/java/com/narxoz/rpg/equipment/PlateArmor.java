package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense = 40;
    private String armorType = "Plate";

    @Override public int getDefense() { return defense; }
    @Override public String getArmorType() { return armorType; }
    @Override public String getArmorInfo() { return "Plate Armor (Medieval)"; }
}
