package equipment.accessory;

public enum CreatureType {

    DRAGON(50),
    WERE_BEAR(30),
    ANGRY_SQUIRREL(15),
    RABID_TORTOISE(40);

    private final double damageShield;

    CreatureType(double damageShield) {
        this.damageShield = damageShield;
    }

    public double getDamageShield(){
        return this.damageShield;
    }
}
