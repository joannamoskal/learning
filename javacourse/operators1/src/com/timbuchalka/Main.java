package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2=" + result);

        int PreviousResult = result;
        result = result - 1;
        System.out.println(PreviousResult + " -1 = " + result);
        PreviousResult = result;
        result = result * 10;
        System.out.println(PreviousResult + " *10 =" + result);
        PreviousResult = result;
        result = result / 5;
        System.out.println(PreviousResult + " /5 =" + result);

        PreviousResult = result;
        result = result % 3;
        System.out.println(PreviousResult + " %3 = " + result);

        PreviousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");



    }}


