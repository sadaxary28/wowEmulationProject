package wowEmulation.weapon;

public abstract class Weapon {

    int stamina;
    int agility;
    int strength;
    int intelect;
    int damage;
    int hitChanse;
    int critChanse;
    String name;

    public Weapon(int stamina, int agility, int strength, int intelect, int damage, int hitChanse, int critChanse, String name) {
        this.stamina = stamina;
        this.agility = agility;
        this.strength = strength;
        this.intelect = intelect;
        this.damage = damage;
        this.hitChanse = hitChanse;
        this.critChanse = critChanse;
        this.name = name;
    }


    public abstract void useWeapon();

    public String weaponInfo() {
        String result = "";

        if (name != null) {
            result += name;
        }

        if (stamina != 0) {
            result += " stamina " + stamina;
        }
        if (agility != 0) {
            result += " agility " + agility;
        }
        if (strength != 0) {
            result += " strength " + strength;
        }
        if (intelect != 0) {
            result += " intelect " + intelect;
        }
        if (damage != 0) {
            result += " damage " + damage;
        }
        if (hitChanse != 0) {
            result += " hitChanse " + hitChanse;
        }
        if (critChanse != 0) {
            result += " critChanse " + critChanse;
        }

        return result;
    }
}
