package src.character.player;

import src.character.Character;
import src.character.Ability;
import src.item.Inventory;

public class Player extends Character {
    private Ability[] abilities = new Ability[3];
    private Inventory inventory;
    private int experience;

    public Player(String nombre, int healthPoints, int experience, Inventory inventory) {
        super(nombre, healthPoints);
        this.inventory = inventory;
        this.experience = experience;
    }
}