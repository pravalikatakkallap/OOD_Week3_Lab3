package com.command.pattern;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount("John", 1410.23);

        Transactions transactions = new Transactions();

        transactions.addTransaction(new DepositClass(account));
        transactions.addTransaction(new WithdrawClass(account));

        transactions.processTransactions();
    }
}
