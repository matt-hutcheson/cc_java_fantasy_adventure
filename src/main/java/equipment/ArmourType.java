package equipment;

public enum ArmourType {

    CHAIN_MAIL(0.4),
    PLATE(0.2),
    ROBES(0.8),
    BATTLE_ROBES(0.6),
    JERKIN(0.6),
    LEATHER_ARMOUR(0.4);

    private final double damageReduction;

    ArmourType(double damageReduction){
        this.damageReduction = damageReduction;
    }

    public double getDamageReduction(){
        return this.damageReduction;
    }

}
