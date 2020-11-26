package equipment.accessory;

public class Creature {
    private double damageShield;

    public Creature(double damageShield){
        this.damageShield = damageShield;
    }

    public double getDamageShield() {
        return damageShield;
    }

    public void setDamageShield(double damageShield) {
        this.damageShield = damageShield;
    }
}
