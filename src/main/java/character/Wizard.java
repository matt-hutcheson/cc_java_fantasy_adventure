package character;

import equipment.Armour;
import equipment.Weapon;
import equipment.accessory.Creature;

import java.util.ArrayList;

public class Wizard extends Player {

    private ArrayList<Weapon> spells;
    private Creature creature;


    public Wizard(String name, double hitPoints, Weapon weaponSlot, Armour armourSlot, String archetype, Creature creature) {
        super(name, hitPoints, weaponSlot, armourSlot, archetype);
        this.creature = creature;
        this.spells = new ArrayList<Weapon>();
    }

    public Creature getCreature() {
        return creature;
    }

    public ArrayList<Weapon> getSpells() {
        return this.spells;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public void addSpell(Weapon spell){
        this.spells.add(spell);
    }
}
