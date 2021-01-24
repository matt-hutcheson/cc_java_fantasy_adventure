package equipment.accessory;

import equipment.EquipmentSlots;
import equipment.EquipmentType;

public class Shield extends Accessory {

    private ShieldType shieldType;

    public Shield(EquipmentSlots equipmentSlots, EquipmentType equipmentType, AccessoryType accessoryType, ShieldType shieldType) {
        super(equipmentSlots, equipmentType, accessoryType);
        this.shieldType=shieldType;
    }

    public ShieldType getShieldType() {
        return shieldType;
    }

    public void setShieldType(ShieldType shieldType) {
        this.shieldType = shieldType;
    }
}
