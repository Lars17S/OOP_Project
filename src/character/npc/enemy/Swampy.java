package src.character.npc.enemy;

import src.character.npc.Enemy;
import src.character.Player;

import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.image.Image;

public class Swampy extends Enemy {
    public Swampy() {
        super("Swampy", 50, 16, 8);
    }

    @Override
    public int getExperience() {
        return ThreadLocalRandom.current().nextInt(10, 15);
    }

    @Override
    protected int[] getArgsForWeapon(Player player) {
        int baseAttack = ThreadLocalRandom.current().nextInt(24, 30);
        int baseStamina = ThreadLocalRandom.current().nextInt(8, 12);
        int[] res = { baseAttack, baseStamina };
        return res;
    }

    @Override
    protected int getDefenseForArmor(Player player) {
        return ThreadLocalRandom.current().nextInt(8, 11);
    }

    @Override
    public String getType() {
        return "Swampy";
    }

    @Override
    public Image render() {
        String path = "./img/swampy.gif";
        return new Image(getClass().getResource(path).toString());
    }
}