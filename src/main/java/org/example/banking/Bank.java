package org.example.banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> list;

    public Bank() {
        list = new ArrayList<>();
    }

    public void addAccount(BankAccount bankAccount) {
        list.add(bankAccount);
    }

    public void transferAmount(BankAccount source, BankAccount target, long amount) {
        if (source.getBalance() >= amount) {
            target.deposit(source.withdraw(amount));
        } else {
            throw new InsufficientFundsException("You don't have valid funds to initiate transaction");
        }
    }

    public void checkData() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("naveen", 100001, 0);
        BankAccount bankAccount2 = new BankAccount("shiva", 100002, 1);

        Bank bank = new Bank();
        bank.addAccount(bankAccount1);
        bank.addAccount(bankAccount2);

        bank.checkData();
        ;
        bank.transferAmount(bankAccount1, bankAccount2, 1);
        bank.checkData();
    }
}
