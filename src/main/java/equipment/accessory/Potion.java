package equipment.accessory;

import equipment.Equipment;
import equipment.EquipmentSlots;
import equipment.EquipmentType;

public class Potion extends Equipment {
    private PotionType potionType;

    public Potion(EquipmentSlots equipmentSlot, EquipmentType equipmentType, PotionType potionType){
        super(equipmentSlot, equipmentType);
        this.potionType = potionType;
    }

    public PotionType getType() {
        return potionType;
    }
}
