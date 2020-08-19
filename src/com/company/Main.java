package com.company;

import kg.geekteck.less5.homework.Boss;
import kg.geekteck.less5.homework.Hero;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(700, 50, "Kinetic");
        System.out.println("Boss health: " + boss.getHealth() + " type of defense " + boss.getTypeOfDefence() + " damage " + boss.getDamage());

        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Heroes: " + " health " + heroes[i].getHealth() + " damage " + heroes[i].getDamage() + " super power " + heroes[i].getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero magic = new Hero(260, 15, "Magical");
        Hero physic = new Hero(250, 20, "Physical");
        Hero medic = new Hero(200, 0, "Medical");
        Hero[] heroes = {magic, physic, medic};
        return heroes;
    }
}
