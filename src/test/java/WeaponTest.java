import equipment.Weapon;
import equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Weapon weapon;
    @Before
    public void setUp(){
        weapon = new Weapon("rightHand","Weapon", WeaponType.SWORD);
    }
    @Test
    public void hasDamage(){
        assertEquals(7 ,weapon.getWeapon().getDamage(), 0.1);
    }

}
