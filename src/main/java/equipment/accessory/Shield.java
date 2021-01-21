package equipment.accessory;

import equipment.Equipment;
import equipment.EquipmentSlots;
import equipment.EquipmentType;

public class Shield extends Equipment {

    private ShieldType shieldType;

    public Shield(EquipmentSlots slot, EquipmentType type, ShieldType shieldType) {
        super(slot, type);
        this.shieldType=shieldType;
    }

    public ShieldType getShieldType() {
        return shieldType;
    }

    public void setShieldType(ShieldType shieldType) {
        this.shieldType = shieldType;
    }
}
