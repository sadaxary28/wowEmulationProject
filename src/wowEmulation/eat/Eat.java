package wowEmulation.eat;

public abstract class Eat {

    public double getMana() {
        return mana;
    }

    public double getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    double mana;
    double health;
    String name;

    public Eat(double mana, double health, String name) {
        this.mana = mana;
        this.health = health;
        this.name = name;
    }

    public abstract void useEat();


    public String eatInfo() {
        String wit = "";

        if (name != null) {
            wit += name;
        }

        if (health != 0) {
            wit += "I've been got HP: " + health;
        }

        if (mana != 0) {
            wit += "I've been got MP: " + mana;
        }
        return wit;
    }
}
