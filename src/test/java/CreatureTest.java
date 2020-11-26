import equipment.accessory.Creature;
import equipment.accessory.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature creature;

    @Before
    public void setUp(){
        creature = new Creature(CreatureType.WERE_BEAR);
    }

    @Test
    public void creatureEatsDamage(){
        assertEquals(30, creature.getType().getDamageShield(), 0.01);
    }
}
