package com.ironhack;

public class OddIntegerReturner {
    public static int[] getOddElements(int n){
        int count=(n+1)/2;
        int[] oddElements=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                oddElements[index++]=i;
            }
        }
        return oddElements;
    }
}
