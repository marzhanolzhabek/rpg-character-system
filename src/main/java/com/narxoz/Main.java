package com.narxoz.rpg;

import com.narxoz.rpg.factory.CharacterFactory;
import com.narxoz.rpg.factory.EquipmentFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("RPG Character & Equipment System \n");

        CharacterFactory charFactory = new CharacterFactory();
        EquipmentFactory equipFactory = new EquipmentFactory();

        List<com.narxoz.rpg.character.Character> characters = new ArrayList<>();

        characters.add(charFactory.createCharacter("warrior", "Aragorn"));
        characters.add(charFactory.createCharacter("mage", "Gandalf"));
        characters.add(charFactory.createCharacter("archer", "Legolas"));

        for (com.narxoz.rpg.character.Character c : characters) {
            c.equipWeapon(equipFactory.createWeapon());
            c.equipArmor(equipFactory.createArmor());
        }

        for (com.narxoz.rpg.character.Character c : characters) {
            c.displayStats();
            c.displayEquipment();
            c.useSpecialAbility();
            System.out.println();
        }

        System.out.println(" Demo Complete ");
    }
}
