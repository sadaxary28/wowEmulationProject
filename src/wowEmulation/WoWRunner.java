package wowEmulation;


import wowEmulation.unit.Human;
import wowEmulation.weapon.impl.Axe;
import wowEmulation.weapon.impl.Sword;
import wowEmulation.eat.impl.Heal;
import wowEmulation.eat.impl.Mana;

public class WoWRunner {
    public static void main(String[] args) {

        Heal pumpkin = new Heal(10, 100, "It's a pumpkin motherfucker! \n");
        Heal Alterac_cheese = new Heal(0, 248, "This cheese is frozen! \n");


        Mana Water_wineskin = new Mana (-145, 200, "pissed into it! \n");
        Mana Cold_milk = new Mana(320, 0, "as cold as ur heart! \n");

        Axe axe = new Axe(10, 15, 20, 0, 100, 0, 1, "Fucking big AXE");
        Sword fucking_small_sword = new Sword(10, 15, 20, 0, 100, 0, 1, "Fucking small sword");


        Human human = new Human( axe);
        human.setHP(1);
        human.setMP(1);
        human.setEat(Water_wineskin);

        human.useEat();

        human.useEat();

        human.useEat();


        //  System.out.println(   human.getHp() + " " +  human.getMana() );
        //human.useWeapon();
       /* human.useEat();
        human.setEat(Alterac_cheese);
        human.useEat();*/

        //Human human1 = new Human( fucking_small_sword);
        //human1.setEat(Alterac_cheese);
        //human1.useWeapon();
        //human1.useEat();

    }

}
