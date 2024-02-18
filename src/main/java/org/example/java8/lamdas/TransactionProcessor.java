package org.example.java8.lamdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TransactionProcessor {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 2021, 300),
                new Transaction(2, 2021, 1000),
                new Transaction(3, 2020, 400),
                new Transaction(4, 2021, 700)
        );

        List<Transaction> transactionsInYear = transactions.stream().filter(x -> x.year() == 2021)
                .sorted(Comparator.comparingInt(Transaction::value)).toList();

        System.out.println(transactionsInYear);

        List<Integer> transactionIdList = transactions.stream().map(Transaction::year).toList();

        System.out.println(transactionIdList);

        long value = transactions.stream().filter(x -> x.year() == 2021).mapToLong(Transaction::value).sum();

        System.out.println(value);
    }
}
