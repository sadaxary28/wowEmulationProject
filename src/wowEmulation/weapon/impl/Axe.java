package wowEmulation.weapon.impl;

import wowEmulation.weapon.Weapon;

public class Axe extends Weapon {

    public Axe(int stamina, int agility, int strength, int intelect, int damage, int hitChanse, int critChanse, String name) {
        super(stamina, agility, strength, intelect, damage, hitChanse, critChanse, name);
    }

    @Override
    public void useWeapon() {
        System.out.println("Хрясь топором");

    }
}
