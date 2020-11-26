package equipment;

public abstract class Equipment {
    private String slot;
    private String type;

    public Equipment(String slot, String type){
        this.slot = slot;
        this.type = type;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getEquipmentType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
