package equipment;

public enum WeaponType {

    SWORD(7),
    SPEAR(5),
    AXE(9),
    CLUB(4),
    FIREBALL(12),
    LIGHTNING_STRIKE(15),
    FREEZY_BEAM(10);

    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
