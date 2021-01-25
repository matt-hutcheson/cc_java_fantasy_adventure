package character;

public interface IPlay {
    void attack(Character attacker, Character defender);

    void heal(double healBy);

    void useAccessory(Player user, Player receiver);
}
