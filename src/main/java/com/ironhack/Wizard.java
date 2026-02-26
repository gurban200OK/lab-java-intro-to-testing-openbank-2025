package com.ironhack;

public class Wizard extends Player{
    private String spell;
    private SpellLibrary spellLibrary;
    public Wizard(int health,int strength,int lives,int maxHealth,String spell){
        super(health,strength,lives,maxHealth);
        this.spell=spell;
    }
    public void setSpellLibrary(SpellLibrary spellLibrary){
        this.spellLibrary=spellLibrary;
    }
    public String castRandomSpell(){
        return "Casting "+spellLibrary.getRandomSpell();
    }
    public Elf convertToElf(){
        return new Elf(getHealth(),getStrength(),getLives(),getMaxHealth(),30);
    }
    public String getSpell(){return spell;}
    public void setSpell(String spell){this.spell=spell;}
}
