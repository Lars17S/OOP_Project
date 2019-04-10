package src.item.weapon;

import src.item.Weapon;
import src.item.weapon.Ability;

public class EnchantedBook extends Weapon {
    private final String[] names = { "Lycka Himlen", "Order of Bloodshed", "Oath of Harm",
            "Enhanced Secrets of the Moon", "Mythic Curse of Doom", "Breath of Torment", "Infusion of Spirits" };

    public EnchantedBook(int baseAttack, int baseStamina) {
        super("",
                new Ability[] { new Ability("Thunder", baseAttack, baseStamina),
                        new Ability("Dark Bane", 2 * baseAttack, 2 * baseStamina),
                        new Ability("Life Drain", (int) (3.5 * baseAttack), (int) (3.5 * baseStamina)) });
        setName(names[(int) (Math.random() * names.length)]);
    }

    public String getType() {
        return "EnchantedBook";
    }
}