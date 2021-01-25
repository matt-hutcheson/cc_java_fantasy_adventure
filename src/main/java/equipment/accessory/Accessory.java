package equipment.accessory;

import character.Player;
import equipment.Equipment;
import equipment.EquipmentSlots;
import equipment.EquipmentType;

public abstract class Accessory extends Equipment{
    private AccessoryType accessoryType;

    public Accessory(EquipmentSlots equipmentSlot, EquipmentType equipmentType, AccessoryType accessoryType) {
        super(equipmentSlot, equipmentType);
        this.accessoryType = accessoryType;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public void setType(AccessoryType accessoryType) {
        this.accessoryType = accessoryType;
    }
}
