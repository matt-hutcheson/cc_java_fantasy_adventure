import equipment.EquipmentSlots;
import equipment.EquipmentType;
import equipment.Weapon;
import equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Weapon weapon;
    @Before
    public void setUp(){
        weapon = new Weapon(EquipmentSlots.WEAPONSLOT, EquipmentType.MELEEWEAPON, WeaponType.SWORD);
    }
    @Test
    public void hasDamage(){
        assertEquals(7 ,weapon.getWeapon().getDamage(), 0.1);
    }
    @Test
    public void hasEquipmentSlot(){
        assertEquals(EquipmentSlots.WEAPONSLOT, weapon.getSlot());
    }
    @Test
    public void hasEquipmentType(){
        assertEquals(EquipmentType.MELEEWEAPON, weapon.getEquipmentType());
    }

}
