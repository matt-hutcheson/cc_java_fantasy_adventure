package equipment;

public abstract class Equipment {
    private EquipmentSlots slot;
    private EquipmentType type;

    public Equipment(EquipmentSlots slot, EquipmentType type){
        this.slot = slot;
        this.type = type;
    }

    public EquipmentSlots getSlot() {
        return slot;
    }

    public void setSlot(EquipmentSlots slot) {
        this.slot = slot;
    }

    public EquipmentType getEquipmentType() {
        return type;
    }

    public void setType(EquipmentType type) {
        this.type = type;
    }
}
