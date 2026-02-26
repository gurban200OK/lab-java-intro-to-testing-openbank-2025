package com.ironhack;

public class Warrior extends Player {
    private int force;

    public Warrior(int health, int strength, int lives, int maxHealth, int force) {
        super(health, strength, lives, maxHealth);
        this.force = force;
    }

    public Elf convertToElf(){
        return new Elf(getHealth(),getStrength(),getLives(),getMaxHealth(),10);
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
