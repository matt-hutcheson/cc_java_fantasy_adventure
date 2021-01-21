package character.enemies;

import character.Character;
import equipment.Armour;
import equipment.Equipment;
import equipment.Weapon;

import java.util.ArrayList;

public class Orc extends Character{
    private ArrayList<Equipment> loot;

    public Orc(String name, double hitPoints, Weapon weaponSlot, Armour armourSlot, String archetype) {
        super(name, hitPoints, weaponSlot, armourSlot);
        this.loot = new ArrayList<Equipment>();
    }

}
