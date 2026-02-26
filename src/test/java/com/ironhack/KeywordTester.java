package com.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeywordTester {
    @BeforeEach
    @Test
    public void ifTheStringContainsJavaKeywords(){
        assertTrue(KeywordReturner.isJavaKeyword("Don't break your bones"));
        assertFalse(KeywordReturner.isJavaKeyword("I need to learn breakdance"));
    }
}
