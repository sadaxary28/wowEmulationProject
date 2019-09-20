package wowEmulation.eat.impl;

import wowEmulation.eat.Eat;

public class Mana extends Eat {
    public Mana(double mana, double health, String name){
        super(mana, health, name);
    }

    @Override
    public void useEat(){
        System.out.println("Попил");
    }


}
