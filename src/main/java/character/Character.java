package character;

import equipment.Armour;
import equipment.Weapon;

public abstract class Character {
    private String name;
    private double hitpoints;
    private Weapon weaponSlot;
    private Armour armourSlot;

    public Character(String name, double hitpoints, Weapon weaponSlot, Armour armourSlot){
        this.name = name;
        this.hitpoints = hitpoints;
        this.weaponSlot =  weaponSlot;
        this.armourSlot = armourSlot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    public Weapon getWeaponSlot() {
        return weaponSlot;
    }

    public void setWeaponSlot(Weapon weaponSlot) {
        this.weaponSlot = weaponSlot;
    }

    public Armour getArmourSlot() {
        return armourSlot;
    }

    public void setArmourSlot(Armour armourSlot) {
        this.armourSlot = armourSlot;
    }

}
