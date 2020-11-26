package equipment.accessory;

import equipment.Equipment;

public class Potion extends Equipment {
    private PotionType potionType;

    public Potion(String equipmentSlot, String equipmentType, PotionType potionType){
        super(equipmentSlot, equipmentType);
        this.potionType = potionType;
    }

    public PotionType getType() {
        return potionType;
    }
}
