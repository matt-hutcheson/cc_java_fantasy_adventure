package equipment.accessory;

import equipment.Equipment;
import equipment.EquipmentSlots;
import equipment.EquipmentType;

public class Creature extends Equipment {

    private CreatureType type;

    public Creature(EquipmentSlots equipmentSlots, EquipmentType equipmentType, CreatureType creatureType){
        super(equipmentSlots, equipmentType);
        this.type = creatureType;
    }

    public CreatureType getType() {
        return type;
    }
}