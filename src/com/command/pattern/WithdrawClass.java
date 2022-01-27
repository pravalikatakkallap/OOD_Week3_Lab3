package com.command.pattern;

public class WithdrawClass implements Command {
    private BankAccount account;

    public WithdrawClass(BankAccount account) {
        this.account = account;
    }

    @Override
    public void execute() {
        this.account.withdraw();
    }
}
