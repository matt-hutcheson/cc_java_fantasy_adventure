package character;

import equipment.Armour;
import equipment.Equipment;
import equipment.EquipmentType;
import equipment.Weapon;

public abstract class Character {
    private String name;
    private double maxHitPoints;
    private Weapon weaponSlot;
    private Armour armourSlot;
    private Equipment equipmentSlot;
    private double currentHitPoints;

    public Character(String name, double maxHitPoints, Weapon weaponSlot, Armour armourSlot, Equipment equipmentSlot){
        this.name = name;
        this.maxHitPoints = maxHitPoints;
        this.weaponSlot =  weaponSlot;
        this.armourSlot = armourSlot;
        this.equipmentSlot = equipmentSlot;
        this.currentHitPoints = maxHitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(double hitPoints) {
        this.currentHitPoints = hitPoints;
    }

    public double getMaxHitPoints(){
        return this.maxHitPoints;
    }

    public void setMaxHitPoints(double hitPoints){
        this.maxHitPoints = hitPoints;
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

    public Equipment getEquipmentSlot() {
        return equipmentSlot;
    }

    public void setEquipmentSlot(Equipment equipmentSlot) {
        this.equipmentSlot = equipmentSlot;
    }

    public void damage(double damageBy){
        this.currentHitPoints -= damageBy;
    }

    public void heal(double healBy){
        if (this.currentHitPoints + healBy < this.maxHitPoints) {
            this.currentHitPoints += healBy;
        } else {
            this.currentHitPoints = this.maxHitPoints;
        }
    }

    public void attack(Character attacker, Character defender){
        defender.damage(attacker.weaponSlot.getWeapon().getDamage() * defender.armourSlot.getArmour().getDamageReduction());
    }

}
