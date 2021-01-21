package character;

import equipment.Armour;
import equipment.Equipment;
import equipment.Weapon;

import java.util.ArrayList;

public abstract class Player extends Character{
    private ArcheType archetype;
    private ArrayList<Equipment> backpack;

    public Player(String name, double hitPoints, Weapon weaponSlot, Armour armourSlot, ArcheType archetype){
        super(name, hitPoints, weaponSlot, armourSlot);
        this.archetype = archetype;
        this.backpack = new ArrayList<Equipment>();
    }

    public ArcheType getArchetype() {
        return archetype;
    }

    public void setArchetype(ArcheType archetype) {
        this.archetype = archetype;
    }

    public ArrayList<Equipment> getBackpack() {
        return backpack;
    }

    public void addToBackpack(Equipment equipment){
        this.backpack.add(equipment);
    }

    public Equipment removeFromBackpack(Equipment equipment){
        int index = this.backpack.indexOf(equipment);
        return this.backpack.remove(index);
    }

    public void equipToArmourSlot(Armour armour){
        this.addToBackpack(this.getArmourSlot());
        this.setArmourSlot(armour);
    }

    public void equipToWeaponSlot(Weapon weapon){
        this.addToBackpack(this.getWeaponSlot());
        this.setWeaponSlot(weapon);
    }
}
