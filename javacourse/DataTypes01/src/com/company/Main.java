package com.company;

public class Main {

    public static void main(String[] args) {
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int
        byte yourFirstByteValue = 34;
        short hisFavouriteShortValue = 2300;
        int joannaIntValue = 1_000_000;
        long intelligentValue = 50000 + (yourFirstByteValue + hisFavouriteShortValue + joannaIntValue)*10;
        System.out.println("intelligentValue = " + intelligentValue);
    }
}
