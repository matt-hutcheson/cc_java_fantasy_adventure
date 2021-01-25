package character.enemies;

import character.ArcheType;
import character.Character;
import equipment.Armour;
import equipment.Equipment;
import equipment.Weapon;
import equipment.accessory.Accessory;

import java.util.ArrayList;

public class Orc extends Character{
    private ArrayList<Equipment> loot;

    public Orc(String name, double hitPoints, Weapon weaponSlot, Armour armourSlot, Accessory accessorySlot, ArcheType archetype) {
        super(name, hitPoints, weaponSlot, armourSlot, accessorySlot);
        this.loot = new ArrayList<Equipment>();
    }

}
