package com.wordpress.programujeodzera;

public class TypyDanych {
    public static void main (String[]args){
    int minValue = - 2_147_483_648;
    int maxValue = 2_147_483_647;
    int myTotal = (minValue/2);
    System.out.println("myTotal = " + myTotal);

    byte minByteValue = -128;
    byte maxByteValue = 127;

    byte myNewByteValue = (byte) (minByteValue/2);
    System.out.println("myNewByteValue =" + myNewByteValue);

}
    }
