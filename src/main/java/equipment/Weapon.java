package equipment;

public class Weapon {

    private WeaponType type;
    private double damage;

    public Weapon(WeaponType weaponType){
        this.type = weaponType;
    }

    public WeaponType getWeapon(){
        return this.type;
    }

    public void setDamage(){
        this.damage = this.type.getDamage();

    }
}
