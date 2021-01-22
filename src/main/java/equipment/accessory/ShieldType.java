package equipment.accessory;

public enum ShieldType {
    ROUND(60),
    KITE(80),
    SQUARE(100);

    private final int damageBlock;

    ShieldType(int damageBlock) {
        this.damageBlock = damageBlock;
    }

    public int getDamageBlock() {
        return damageBlock;
    }

}
