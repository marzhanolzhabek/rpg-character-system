package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Warrior;

public class CharacterFactory {

    public com.narxoz.rpg.character.Character createCharacter(String type, String name) {
        switch (type.toLowerCase()) {
            case "warrior": return new Warrior(name);
            case "mage": return new Mage(name);
            case "archer": return new Archer(name);
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
