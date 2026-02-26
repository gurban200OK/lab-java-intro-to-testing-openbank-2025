package com.ironhack;

public class Main {
    public static void main(String[] args){
        Elf elf1=new Elf(34,56,3,100,50);
        elf1.decrementLive();
        System.out.println("Elf's health: "+elf1.getLives());


        Warrior guts=new Warrior(98,150,3,100,200);
        System.out.println("Guts's force: "+guts.getForce());
        guts.convertToElf();
    }

}
