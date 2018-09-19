package com.wordpress.programujeodzera;

public class Main {

    public static void main(String[] args) {

        String firstString = "To jest piłka";
        System.out.println("First string = " + firstString);
        firstString = firstString + " a to jest samochód.";
        System.out.println("First string = " + firstString);
        firstString = firstString + " \u00A9 2018.";
        System.out.println("First string = " + firstString);
        String secondString = "123.25";
        secondString = secondString + "25.25";
        System.out.println("Second string = " + secondString);
        String thirdString = "15";
       int firstInt = 10;
       thirdString = thirdString + firstInt;
        System.out.println("Third string = " + thirdString);
        double firstDouble = 2.55;
        thirdString = thirdString + firstDouble;
        System.out.println("Third string = " + thirdString);

    }
}
