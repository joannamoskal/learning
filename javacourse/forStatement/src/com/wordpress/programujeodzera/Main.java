package com.wordpress.programujeodzera;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% = "+ calculateInterest(10000.0,2.0));
        System.out.println("10,000 at 3% = "+ calculateInterest(10000.0,3.0));
        System.out.println("10,000 at 4% = "+ calculateInterest(10000.0,4.0));
        System.out.println("10,000 at 5% = "+ calculateInterest(10000.0,5.0));

        for(int i=2; i<9; i++){
            System.out.println("10,000 at " + i+"%" + " = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        for(int i=8; i<=8&&i>=2; i--){
            System.out.println("10,000 at " + i+"%" + " = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        int count = 0;
        for ( int i=10, i<50, i++){

        }

    }


    public static boolean isPrime (int n){
        if (n==1){
            return false;
        }
        for (int i=2, i<= n/2; i++){
            if (n% i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
    }

