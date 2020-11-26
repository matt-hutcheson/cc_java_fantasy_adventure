import equipment.Armour;
import equipment.ArmourType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {
    Armour armour;
    @Before
    public void setUp(){
        armour = new Armour(ArmourType.CHAIN_MAIL);
    }
    @Test
    public void hasDamageReduction(){
        assertEquals(0.4, armour.getArmour().getDamageReduction(), 0.1);
    }
}
