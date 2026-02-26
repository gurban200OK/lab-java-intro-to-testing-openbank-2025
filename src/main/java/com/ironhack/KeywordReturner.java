package com.ironhack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeywordReturner {
    private static final List<String> WORDS=new ArrayList<>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
            "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
            "finally", "float", "for", "goto", "if", "implements", "import", "instanceof",
            "int", "interface", "long", "native", "new", "package", "private", "protected",
            "public", "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"));
    public static boolean isJavaKeyword(String input){
        if(input==null || input.isEmpty()){
            return false;
        }
        String[] words=input.split("\\W+");
        for(String word : words){
            if(WORDS.contains(word)){
                return true;
            }
        }
        return false;
    }
}
