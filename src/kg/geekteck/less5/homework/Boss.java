package kg.geekteck.less5.homework;

public class Boss {

    private int health;
    private int damage;
    private String typeOfDefence;

    public Boss(int health, int damage, String typeOfDefence) {
        this.health = health;
        this.damage = damage;
        this.typeOfDefence = typeOfDefence;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfDefence() {
        return typeOfDefence;
    }

    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }
}
