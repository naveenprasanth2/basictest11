package org.example.banking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class BankAccount {
    private String name;
    private Integer accountNumber;
    private long balance;

    public void deposit(long amount) {
        balance += amount;
    }

    public long withdraw(long amount) {
        if (balance > amount) {
            balance -= amount;
            return amount;
        } else {
            throw new InsufficientFundsException("You don't have valid funds to initiate transaction");
        }
    }
}
