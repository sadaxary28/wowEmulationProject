package wowEmulation.eat.impl;

import wowEmulation.eat.Eat;

public class Heal extends Eat {

    public Heal(double mana, double health, String name){
        super(mana, health, name);
    }

    @Override
    public void useEat(){
        System.out.println("Поел");
    }
}
