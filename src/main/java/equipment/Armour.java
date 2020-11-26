package equipment;

public class Armour {

    private ArmourType type;
    private double damageReduction;

    public Armour(ArmourType armourType){
        this.type = armourType;
    }

    public ArmourType getArmour(){
        return this.type;
    }

    private void setDamageReduction(){
        this.damageReduction = type.getDamageReduction();
    }
}
