package com.ironhack;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;
    private int maxHealth;

    public Player(int health, int strength, int lives,int maxHealth) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
        this.maxHealth=maxHealth;
    }

    public void decrementLive(){
        this.lives--;
        if(this.lives>0){
            this.health=maxHealth;
        } else{
            System.out.println("This character is dead.");
            this.health=0;
        }
    }
    public void attack(Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth()-this.strength);
        playerToAttack.checkHealth();
    }
    public void checkHealth() {
        if(this.health<=0){
            decrementLive();
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
