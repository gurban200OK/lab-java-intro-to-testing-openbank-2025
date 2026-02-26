package com.ironhack;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
public class WizardTest{
    @Test
    public void testCastRandomSpellWithMockito(){
        SpellLibrary mockLib=mock(SpellLibrary.class);
        Wizard wizard=new Wizard(80,15,3,80,"Freeze");
        wizard.setSpellLibrary(mockLib);
        when(mockLib.getRandomSpell()).thenReturn("Fireball");
        String result=wizard.castRandomSpell();
        verify(mockLib,times(1)).getRandomSpell();
        assertEquals("Casting Fireball",result);
    }
    @Test
    public void testWizardConvertToElf(){
        Wizard wizard=new Wizard(70,10,2,80,"Spark");
        Elf elf=wizard.convertToElf();
        assertEquals(70,elf.getHealth());
        assertEquals(2,elf.getLives());
        assertEquals(30,elf.getSpeed());
    }
}
