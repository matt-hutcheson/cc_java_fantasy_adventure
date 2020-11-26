package equipment;

public class Armour extends Equipment{

    private ArmourType armourType;

    public Armour(String equipmentSlot, String equipmentType, ArmourType armourType){
        super(equipmentSlot, equipmentType);
        this.armourType = armourType;
    }

    public ArmourType getArmour(){
        return this.armourType;
    }
}
