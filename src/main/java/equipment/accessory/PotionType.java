package equipment.accessory;

public enum PotionType {
    BANDAID(25),
    GERMALINE(50),
    MORPHINE(100);

    private final double healAmount;

    PotionType(double healAmount){
        this.healAmount = healAmount;
    }

    public double getHealAmount(){
        return this.healAmount;
    }
}
