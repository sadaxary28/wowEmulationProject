package wowEmulation.unit;

import wowEmulation.eat.Eat;
import wowEmulation.eat.impl.Heal;
import wowEmulation.eat.impl.Mana;
import wowEmulation.weapon.Weapon;
import wowEmulation.WoWRunner;

public class Human {

    Weapon weapon;

    Eat eat;

    final double MAX_HP = 400;

    final double MAX_MP = 600;

    double hp;

    double mana;


    public Human(Weapon weapon) {
        this.weapon = weapon;
    }

    public void useWeapon() {
        String weaponInfo = weapon.weaponInfo();
        System.out.println(weaponInfo);
        weapon.useWeapon();
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public void useEat() {

        System.out.println("----------------------");
        String EatInfo = eat.eatInfo();
        System.out.println(EatInfo);
        eat.useEat();

        double manaEat = eat.getMana();
        double healthEat = eat.getHealth();


        if (healthEat > 0) {
            if (hp + healthEat <= MAX_HP) {
                this.hp += healthEat;
            } else {
                System.out.println("over heal " + (hp + healthEat - MAX_HP)  + " единиц здоровья.");
                this.hp = MAX_HP;
            }
        }


        System.out.println("У меня стало " + hp + " единиц здоровья.");

        if (manaEat > 0) {
            if (mana + manaEat <= MAX_MP) {
                this.mana += manaEat;
            } else {
                this.mana = MAX_MP;
            }
        }
        System.out.println("У меня стало " + mana + " единиц маны.");
    }

    public double getHp() {
        return hp;
    }


    public void setHP(double hp) {
        if (hp < MAX_HP) {
            this.hp = hp;
        } else
            hp = MAX_HP;
        System.out.println("У меня осталось " + hp + " единиц здоровья!");
    }

    public double getMana() {
        return mana;
    }

    public void setMP(double mana) {
        if (mana < MAX_MP) {
            this.mana = mana;
        } else
            mana = MAX_MP;
        System.out.println("У меня осталось " + mana + " единиц маны!");

    }


}
