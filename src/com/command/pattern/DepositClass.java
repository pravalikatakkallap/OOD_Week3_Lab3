package com.command.pattern;

public class DepositClass implements Command {
    private BankAccount account;

    public DepositClass(BankAccount account) {
        this.account = account;
    }

    @Override
    public void execute() {
        this.account.deposit();
    }
}
