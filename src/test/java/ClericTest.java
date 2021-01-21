import character.ArcheType;
import character.Cleric;
import equipment.*;
import equipment.accessory.Potion;
import equipment.accessory.PotionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClericTest {

    Cleric cleric;
    Weapon weapon;
    Potion potion;
    Armour armour;

    @Before
    public void setUp(){
        weapon = new Weapon(EquipmentSlots.WEAPONSLOT, EquipmentType.MELEEWEAPON, WeaponType.CLUB);
        armour = new Armour(EquipmentSlots.ARMOURSLOT, EquipmentType.CLERICARMOUR, ArmourType.JERKIN);
        potion = new Potion(EquipmentSlots.ACCESSORYSLOT, EquipmentType.POTION, PotionType.GERMALINE);
        cleric = new Cleric("Eric", 100, weapon, armour, ArcheType.CLERIC, potion);
    }

    @Test
    public void clericCanHeal(){
        cleric.damage(25);
        cleric.throwPotion(cleric);
        assertEquals(100, cleric.getCurrentHitPoints(), 0.01);
    }

    @Test
    public void canAddPotionToTrousers(){
        Potion newPotion = new Potion(EquipmentSlots.ACCESSORYSLOT, EquipmentType.POTION, PotionType.MORPHINE);
        cleric.addPotionToCollection(newPotion);
        assertEquals(1, cleric.getPotions().size());
    }

    @Test
    public void canTakePotionFromTrousersANdPutTheOtherOneAway(){
        Potion newPotion = new Potion(EquipmentSlots.ACCESSORYSLOT, EquipmentType.POTION, PotionType.MORPHINE);
        cleric.equipToPotionSlot(newPotion);
        assertEquals(newPotion, cleric.getCurrentPotion());
        assertTrue (cleric.getPotions().contains(potion));
    }
}
