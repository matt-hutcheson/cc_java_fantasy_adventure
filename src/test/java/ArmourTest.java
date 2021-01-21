import equipment.Armour;
import equipment.ArmourType;
import equipment.EquipmentSlots;
import equipment.EquipmentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {
    Armour armour;
    @Before
    public void setUp(){
        armour = new Armour(EquipmentSlots.ARMOURSLOT, EquipmentType.KNIGHTARMOUR, ArmourType.CHAIN_MAIL);
    }
    @Test
    public void hasDamageReduction(){
        assertEquals(0.4, armour.getArmour().getDamageReduction(), 0.1);
    }
}
