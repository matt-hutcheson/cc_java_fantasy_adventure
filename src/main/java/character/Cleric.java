package character;

import equipment.Armour;
import equipment.Weapon;
import equipment.accessory.Potion;

import java.util.ArrayList;

public class Cleric extends Player{
    private ArrayList<Potion> potions;
    private Potion currentPotion;

    public Cleric(String name, double hitPoints, Weapon weaponSlot, Armour armourSlot, String archetype, Potion currentPotion) {
        super(name, hitPoints, weaponSlot, armourSlot, archetype);
        this.currentPotion = currentPotion;
        this.potions = new ArrayList<Potion>();
    }

    public ArrayList<Potion> getPotions() {
        return potions;
    }

    public void addPotionToCollection(Potion newPotion) {
        this.potions.add(newPotion);
    }

    public Potion getCurrentPotion() {
        return currentPotion;
    }

    public void setCurrentPotion(Potion currentPotion) {
        this.currentPotion = currentPotion;
    }

    public void throwPotion(Player player){
        if (currentPotion != null) {
            player.heal(this.currentPotion.getType().getHealAmount());
            currentPotion = null;
        }
    }

    public void equipToPotionSlot(Potion potion){
        this.addPotionToCollection(this.getCurrentPotion());
        this.setCurrentPotion(potion);
    }
}
