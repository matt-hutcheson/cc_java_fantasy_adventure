package equipment.accessory;

import equipment.Equipment;
import equipment.EquipmentSlots;
import equipment.EquipmentType;

public class Potion extends Accessory {
    private PotionType potionType;

    public Potion(EquipmentSlots equipmentSlot, EquipmentType equipmentType, AccessoryType accessoryType, PotionType potionType){
        super(equipmentSlot, equipmentType, accessoryType);
        this.potionType = potionType;
    }

    public PotionType getType() {
        return potionType;
    }
}
