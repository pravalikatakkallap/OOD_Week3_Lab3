package com.command.pattern;

public class BankAccount {
    private String holderName;
    private double amount;

    public BankAccount(String holderName, double amount) {
        this.holderName = holderName;
        this.amount = amount;
    }

    public void deposit() {
        System.out.println("Amount " + this.amount + " has been deposited to " + this.holderName + " account");
    }

    public void withdraw() {
        System.out.println("Amount " + this.amount + " has been withdrawn from " + this.holderName + " account");
    }
}
