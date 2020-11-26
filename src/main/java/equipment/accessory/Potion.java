package equipment.accessory;

public class Potion {
    private PotionType type;

    public Potion(PotionType potionType){
        this.type = potionType;
    }

    public PotionType getType() {
        return type;
    }
}
