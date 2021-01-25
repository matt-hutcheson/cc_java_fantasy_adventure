import character.ArcheType;
import character.Wizard;
import equipment.*;
import equipment.accessory.AccessoryType;
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
        creature = new Creature(EquipmentSlots.ACCESSORYSLOT, EquipmentType.ACCESSORY, AccessoryType.CREATURE, CreatureType.RABID_TORTOISE);
        weapon = new Weapon(EquipmentSlots.WEAPONSLOT, EquipmentType.SPELLWEAPON, WeaponType.FREEZY_BEAM);
        armour = new Armour(EquipmentSlots.ARMOURSLOT, EquipmentType.MAGEARMOUR, ArmourType.ROBES);
        wizard = new Wizard("The Great Stupendo", 100, weapon, armour, creature, ArcheType.MAGE, creature);
    }

    @Test
    public void wizardHasName(){
        assertEquals("The Great Stupendo", wizard.getName());
    }

    @Test
    public void wizardHasArchetype(){
        assertEquals(ArcheType.MAGE, wizard.getArchetype());
    }

    @Test
    public void wizardHasHitPoints(){
        assertEquals(100, wizard.getCurrentHitPoints(), 0.01);
    }

    @Test
    public void wizardHasMaxHitPoints(){
        assertEquals(100, wizard.getMaxHitPoints(), 0.01);
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
        Armour armour = new Armour(EquipmentSlots.ARMOURSLOT, EquipmentType.MAGEARMOUR, ArmourType.BATTLE_ROBES);
        wizard.addToBackpack(armour);
        assertEquals(1, wizard.getBackpack().size());
    }
    @Test
    public void canRemoveItemFromBackpack(){
        Armour armour = new Armour(EquipmentSlots.ARMOURSLOT, EquipmentType.MAGEARMOUR, ArmourType.BATTLE_ROBES);
        wizard.addToBackpack(armour);
        assertEquals(armour, wizard.removeFromBackpack(armour));
    }
    @Test
    public void canEquipArmour(){
        Armour testArmour = new Armour(EquipmentSlots.ARMOURSLOT, EquipmentType.MAGEARMOUR, ArmourType.BATTLE_ROBES);
        wizard.equipToArmourSlot(testArmour);
        assertEquals(testArmour, wizard.getArmourSlot());
        assertTrue(wizard.getBackpack().contains(armour));
    }

    @Test
    public void canEquipWeapons(){
        Weapon testWeapon = new Weapon(EquipmentSlots.WEAPONSLOT, EquipmentType.SPELLWEAPON, WeaponType.FIREBALL);
        wizard.equipToWeaponSlot(testWeapon);
        assertEquals(testWeapon, wizard.getWeaponSlot());
        assertTrue(wizard.getBackpack().contains(weapon));
    }
    @Test
    public void canGetCreature(){
        assertEquals(creature, wizard.getCreature());
    }
    @Test
    public void canSetCreature(){
        Creature testCreature = new Creature(EquipmentSlots.ACCESSORYSLOT, EquipmentType.ACCESSORY, AccessoryType.CREATURE, CreatureType.ANGRY_SQUIRREL);
        wizard.setCreature(testCreature);
        assertEquals(testCreature, wizard.getCreature());
    }
    @Test
    public void spellsStartsEmpty(){
        assertEquals(0, wizard.getSpells().size());
    }
    @Test
    public void canAddSpellToSpells(){
        wizard.addSpell(weapon);
        assertEquals(1, wizard.getSpells().size());
    }

    @Test
    public void canTakeDamage(){
        wizard.damage(50);
        assertEquals(50, wizard.getCurrentHitPoints(), 0.1);
    }
    @Test
    public void canHeal(){
        wizard.damage(50);
        wizard.heal(20);
        assertEquals(70, wizard.getCurrentHitPoints(), 0.01);
    }
}
