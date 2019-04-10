package src.character.npc.enemy;

import src.character.npc.Enemy;
import src.character.Player;
import src.item.Weapon;
import src.item.weapon.*;

import java.util.concurrent.ThreadLocalRandom;

public class Necromancer extends Enemy {
    public Necromancer() {
        super("Necromancer", 200, 55);
    }

    @Override
    public int getExperience() {
        return ThreadLocalRandom.current().nextInt(15, 20 + 1);
    }

    @Override
    public Weapon dropWeapon(Player player) {
        switch (ThreadLocalRandom.current().nextInt(1, 2)) {
        case 1:
            return (player.getType() == 'e') ? new Sword(39, 10) : new EnchantedBook(39, 10);
        case 2:
            return (player.getType() == 'e') ? new Bow(39, 10) : new Wand(39, 10);
        default:
            return null;
        }
    }
}