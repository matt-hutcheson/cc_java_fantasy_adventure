import character.Player;
import equipment.Armour;
import equipment.ArmourType;
import equipment.Weapon;
import equipment.WeaponType;
import equipment.accessory.Creature;
import equipment.accessory.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Weapon weapon;
    Armour armour;


    @Before
    public void setUp(){
        weapon = new Weapon("weaponSlot", "Weapon", WeaponType.SWORD);
        armour = new Armour("armourSlot", "Armour", ArmourType.CHAIN_MAIL);
        player = new Player("Killer Badman", 150, weapon, armour, "Barbarian");
    }

    @Test
    public void playerHasName(){
        assertEquals("Killer Badman", player.getName());
    }

    @Test
    public void playerHasArchetype(){
        assertEquals("Barbarian", player.getArchetype());
    }

    @Test
    public void playerHasHitpoints(){
        assertEquals(150, player.getHitpoints(), 0.01);
    }

    @Test
    public void playerHasWeapon(){
        assertEquals(weapon, player.getWeaponSlot());
    }

    @Test
    public void playerHasSomeArmourOn(){
        assertEquals(armour, player.getArmourSlot());
    }

    @Test
    public void playerBackPackStartsEmpty(){
        assertEquals(0, player.getBackpack().size());
    }
    @Test
    public void playerCanAddItemsToBackPack(){
        Armour armour = new Armour("armourslot", "armour", ArmourType.LEATHER_ARMOUR);
        player.addToBackpack(armour);
        assertEquals(1, player.getBackpack().size());
    }
}
