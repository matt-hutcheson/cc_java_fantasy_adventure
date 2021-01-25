package character;

import equipment.Armour;
import equipment.Weapon;
import equipment.accessory.Accessory;
import equipment.accessory.Creature;
import equipment.accessory.Shield;

import java.util.ArrayList;

public class Knight extends Player{

    private Shield shield;

    public Knight(String name, double hitPoints, Weapon weaponSlot, Armour armourSlot, Accessory accessorySlot, ArcheType archetype, Shield shield) {
        super(name, hitPoints, weaponSlot, armourSlot, accessorySlot, archetype);
        this.shield=shield;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void shieldBlock(Player player) {

    }

}
