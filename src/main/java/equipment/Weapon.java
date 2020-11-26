package equipment;

public class Weapon extends Equipment{

    private WeaponType weaponType;

    public Weapon(String equipmentSlot, String equipmentType, WeaponType weaponType){
        super(equipmentSlot, equipmentType);
        this.weaponType = weaponType;
    }

    public WeaponType getWeapon(){
        return this.weaponType;
    }
}
