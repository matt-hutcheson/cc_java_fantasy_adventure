package equipment;

public class Weapon extends Equipment{

    private WeaponType weaponType;

    public Weapon(EquipmentSlots equipmentSlot, EquipmentType equipmentType, WeaponType weaponType){
        super(equipmentSlot, equipmentType);
        this.weaponType = weaponType;
    }

    public WeaponType getWeapon(){
        return this.weaponType;
    }
}
