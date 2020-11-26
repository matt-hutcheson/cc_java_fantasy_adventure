import character.Player;
import character.Wizard;
import equipment.Armour;
import equipment.ArmourType;
import equipment.Weapon;
import equipment.WeaponType;
import equipment.accessory.Creature;
import equipment.accessory.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WizardTest {

    Wizard wizard;
    Weapon weapon;
    Creature creature;
    Armour armour;

    @Before
    public void setUp(){
        creature = new Creature(CreatureType.RABID_TORTOISE);
        weapon = new Weapon("weaponSlot", "Spell", WeaponType.FREEZY_BEAM);
        armour = new Armour("armourSlot", "Armour", ArmourType.ROBES);
        wizard = new Wizard("The Great Stupendo", 100, weapon, armour, "Wizard", creature);
    }

    @Test
    public void wizardHasName(){
        assertEquals("The Great Stupendo", wizard.getName());
    }

    @Test
    public void wizardHasArchetype(){
        assertEquals("Wizard", wizard.getArchetype());
    }

    @Test
    public void wizardHasHitpoints(){
        assertEquals(100, wizard.getHitpoints(), 0.01);
    }

    @Test
    public void wizardHasWeapon(){
        assertEquals(weapon, wizard.getWeaponSlot());
    }

    @Test
    public void wizardHasSomeArmourOn(){
        assertEquals(armour, wizard.getArmourSlot());
    }

    @Test
    public void wizardBackPackStartsEmpty(){
        assertEquals(0, wizard.getBackpack().size());
    }
    @Test
    public void wizardCanAddItemsToBackPack(){
        Armour armour = new Armour("armourslot", "armour", ArmourType.BATTLE_ROBES);
        wizard.addToBackpack(armour);
        assertEquals(1, wizard.getBackpack().size());
    }
    @Test
    public void canRemoveItemFromBackpack(){
        Armour armour = new Armour("armourslot", "armour", ArmourType.BATTLE_ROBES);
        wizard.addToBackpack(armour);
        assertEquals(armour, wizard.removeFromBackpack(armour));
    }
    @Test
    public void canEquipArmour(){
        Armour testArmour = new Armour("armourSlot", "armour", ArmourType.BATTLE_ROBES);
        wizard.equipToArmourSlot(testArmour);
        assertEquals(testArmour, wizard.getArmourSlot());
        assertTrue(wizard.getBackpack().contains(armour));
    }

    @Test
    public void canEquipWeapons(){
        Weapon testWeapon = new Weapon("weaponSlot", "Spell", WeaponType.FIREBALL);
        wizard.equipToWeaponSlot(testWeapon);
        assertEquals(testWeapon, wizard.getWeaponSlot());
        assertTrue(wizard.getBackpack().contains(weapon));
    }

}
