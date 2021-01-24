import equipment.EquipmentSlots;
import equipment.EquipmentType;
import equipment.accessory.AccessoryType;
import equipment.accessory.Potion;
import equipment.accessory.PotionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {
    Potion potion;
    @Before
    public void setUp(){
        potion = new Potion(EquipmentSlots.ACCESSORYSLOT, EquipmentType.ACCESSORY, AccessoryType.POTION, PotionType.GERMALINE);
    }
    @Test
    public void hasHealAmount(){
        assertEquals(50, potion.getType().getHealAmount(), 0.1);
    }
}
