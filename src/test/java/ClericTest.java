import character.Cleric;
import equipment.Armour;
import equipment.ArmourType;
import equipment.Weapon;
import equipment.WeaponType;
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
        weapon = new Weapon("leftHand", "Weapon", WeaponType.CLUB);
        armour = new Armour("armourSlot", "Armour", ArmourType.JERKIN);
        potion = new Potion("rightHand", "Potion", PotionType.GERMALINE);
        cleric = new Cleric("Eric", 100, weapon, armour, "Cleric", potion);
    }

    @Test
    public void clericCanHeal(){
        cleric.damage(25);
        cleric.throwPotion(cleric);
        assertEquals(100, cleric.getCurrentHitpoints(), 0.01);
    }

    @Test
    public void canAddPotiontoTrousers(){
        Potion newPotion = new Potion("rightHand", "potion", PotionType.MORPHINE);
        cleric.addPotionToCollection(newPotion);
        assertEquals(1, cleric.getPotions().size());
    }

    @Test
    public void canTakePotionFromTrousersANdPutTheOtherOneAway(){
        Potion newPotion = new Potion("rightHand", "potion", PotionType.MORPHINE);
        cleric.equipToPotionSlot(newPotion);
        assertEquals(newPotion, cleric.getCurrentPotion());
        assertTrue (cleric.getPotions().contains(potion));
    }
}
