package equipment.accessory;

public class Creature {

    private CreatureType type;

    public Creature(CreatureType creatureType){
        this.type = creatureType;
    }

    public CreatureType getType() {
        return type;
    }
}