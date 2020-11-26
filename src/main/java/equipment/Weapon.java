package equipment;

public class Weapon {

    private WeaponType type;

    public Weapon(WeaponType weaponType){
        this.type = weaponType;
    }

    public WeaponType getWeapon(){
        return this.type;
    }
}
