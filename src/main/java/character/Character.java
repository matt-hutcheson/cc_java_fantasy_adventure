package character;

import equipment.Armour;
import equipment.Weapon;

public abstract class Character {
    private String name;
    private double maxHitpoints;
    private Weapon weaponSlot;
    private Armour armourSlot;
    private double currentHitpoints;

    public Character(String name, double maxHitpoints, Weapon weaponSlot, Armour armourSlot){
        this.name = name;
        this.maxHitpoints = maxHitpoints;
        this.weaponSlot =  weaponSlot;
        this.armourSlot = armourSlot;
        this.currentHitpoints = maxHitpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentHitpoints() {
        return currentHitpoints;
    }

    public void setCurrentHitpoints(double hitpoints) {
        this.currentHitpoints = hitpoints;
    }

    public double getMaxHitpoints(){
        return this.maxHitpoints;
    }

    public void setMaxHitpoints(double hitpoints){
        this.maxHitpoints = hitpoints;
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

    public void damage(double damageBy){
        this.currentHitpoints -= damageBy;
    }

    public void heal(double healBy){
        if (this.currentHitpoints + healBy < this.maxHitpoints) {
            this.currentHitpoints += healBy;
        } else {
            this.currentHitpoints = this.maxHitpoints;
        }
    }

    public void attack(Character attacker, Character hurter){
        hurter.damage(attacker.weaponSlot.getWeapon().getDamage()* hurter.armourSlot.getArmour().getDamageReduction());
    }

}
