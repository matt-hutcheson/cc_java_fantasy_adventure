package character;

import equipment.Armour;
import equipment.Equipment;
import equipment.Weapon;

import java.util.ArrayList;

public class Player extends Character{
    private String archetype;
    private ArrayList<Equipment> backpack;

    public Player(String name, double hitpoints, Weapon weaponSlot, Armour armourSlot, String archetype, ArrayList<> backpack){
        super(name, hitpoints, weaponSlot, armourSlot);
        this.archetype = archetype;
        this.backpack = new ArrayList<Equipment>();
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public ArrayList<Equipment> getBackpack() {
        return backpack;
    }

    public void addToBackpack(Equipment equipment){
        this.backpack.add(equipment);
    }
}
