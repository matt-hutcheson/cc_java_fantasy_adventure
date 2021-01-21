import character.Knight;
import equipment.*;
import equipment.accessory.Shield;
import equipment.accessory.ShieldType;
import org.junit.Before;

public class KnightTest {

    Knight knight;
    Weapon weapon;
    Armour armour;
    Shield shield;

    @Before
    public void setUp() {
        shield = new Shield(EquipmentSlots.ACCESSORYSLOT, EquipmentType.SHIELD, ShieldType.KITE);
        weapon = new Weapon(EquipmentSlots.WEAPONSLOT, EquipmentType.MELEEWEAPON, WeaponType.SWORD);
        armour = new Armour(EquipmentSlots.ARMOURSLOT, EquipmentType.KNIGHTARMOUR, ArmourType.CHAIN_MAIL);
//        knight = new Knight()
    }
}
