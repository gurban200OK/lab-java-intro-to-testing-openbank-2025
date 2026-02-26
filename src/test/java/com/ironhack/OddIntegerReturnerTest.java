package com.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddIntegerReturnerTest {
    @BeforeEach
    @Test
    public void oddIntegerReturner_returnOddNumbers(){
        int[] expected={1,3,5};
        assertArrayEquals(expected, OddIntegerReturner.getOddElements(5));
        int[] expected2={1,3,5,7,9,11,13,15,17,19};
        assertArrayEquals(expected2,OddIntegerReturner.getOddElements(19));
    }
}
