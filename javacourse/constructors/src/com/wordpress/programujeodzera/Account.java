package com.wordpress.programujeodzera;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if (this.balance - withdrawalAmount <=0 ){
            System.out.println("Only " + this.balance + "available. Withdrawal not processed");
        } else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "processed. Remaining balance = " + this.balance);

        }


}}
