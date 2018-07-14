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
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");
        if ((topScore>90) || (secondTopScore<=90))
            System.out.println("One of these tests is true");
        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
                if(isCar == true)
                    System.out.println("This is not supposed to happen");
                isCar = true;
                boolean wasCar = isCar ? true : false;

        double doubleValue = 20;
        double secondDoubleValue = 80;


        System.out.println((doubleValue + secondDoubleValue)*25);

        System.out.println(((doubleValue+secondDoubleValue)*25)%40);


        PreviousResult = result;
                if (result <=20)
                    System.out.println("Total was over the limit");
    }}


