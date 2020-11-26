import equipment.accessory.Potion;
import equipment.accessory.PotionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {
    Potion potion;
    @Before
    public void setUp(){
        potion = new Potion("leftHand", "Potion", PotionType.GERMALINE);
    }
    @Test
    public void hasHealAmount(){
        assertEquals(50, potion.getType().getHealAmount(), 0.1);
    }
}