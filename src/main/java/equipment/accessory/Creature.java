package equipment.accessory;

import equipment.EquipmentSlots;
import equipment.EquipmentType;

public class Creature extends Accessory {

    private CreatureType type;

    public Creature(EquipmentSlots equipmentSlots, EquipmentType equipmentType, AccessoryType accessoryType, CreatureType creatureType){
        super(equipmentSlots, equipmentType, accessoryType);
        this.type = creatureType;
    }

    public CreatureType getType() {
        return type;
    }

}