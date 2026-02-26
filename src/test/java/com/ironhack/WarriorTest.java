package com.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {
    @BeforeEach
    @Test
    public void testWarriorCreationAndGetters(){
        Warrior warrior=new Warrior(100,20,3,100,50);
        assertEquals(100,warrior.getHealth());
        assertEquals(50,warrior.getForce());
    }
    @Test
    public void testAttackMethod(){
        Warrior warrior=new Warrior(100,20,3,100,50);
        Warrior enemy=new Warrior(100,10,3,100,30);
        warrior.attack(enemy);
        assertEquals(80,enemy.getHealth());
    }
    @Test
    public void testCheckHealthAndDecrementLive(){
        Warrior warrior=new Warrior(100,20,3,100,50);
        warrior.setHealth(0);
        warrior.checkHealth();
        assertEquals(2,warrior.getLives());
        assertEquals(100,warrior.getHealth());
    }
    @Test
    public void testConvertToElf(){
        Warrior warrior=new Warrior(90,25,2,100,60);
        Elf elf=warrior.convertToElf();
        assertEquals(90,elf.getHealth());
        assertEquals(25,elf.getStrength());
        assertEquals(2,elf.getLives());
        assertEquals(100,elf.getMaxHealth());
        assertEquals(10,elf.getSpeed());
    }
}
