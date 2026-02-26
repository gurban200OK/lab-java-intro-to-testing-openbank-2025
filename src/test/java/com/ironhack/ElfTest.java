package com.ironhack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElfTest {
    @Test
    public void testElfCreationAndGetters(){
        Elf elf=new Elf(100,15,3,100,50);
        assertEquals(100,elf.getHealth());
        assertEquals(15,elf.getStrength());
        assertEquals(3,elf.getLives());
        assertEquals(50,elf.getSpeed());
    }
    @Test
    public void testElfInheritedAttack(){
        Elf elf=new Elf(100,20,3,100,40);
        Warrior enemy=new Warrior(100,10,3,100,20);
        elf.attack(enemy);
        assertEquals(80,enemy.getHealth());
    }
    @Test
    public void testElfSpeedSetter(){
        Elf elf=new Elf(100,10,3,100,25);
        elf.setSpeed(45);
        assertEquals(45,elf.getSpeed());
    }
}