package org.example.javaPractise;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransactionEval {
    public static void main(String[] args) {
        Transaction t1 = Transaction.builder()
                .value(5000).city("chennai").year(2000).build();
        Transaction t2 = Transaction.builder()
                .value(6000).city("bangalore").year(2001).build();
        Transaction t3 = Transaction.builder()
                .value(7000).city("cochi").year(2001).build();
        Transaction t4 = Transaction.builder()
                .value(4000).city("hyderabad").year(2003).build();
        Transaction t5 = Transaction.builder()
                .value(3000).city("delhi").year(2005).build();
        Transaction t6 = Transaction.builder()
                .value(7000).city("delhi").year(2007).build();
        Transaction t7 = Transaction.builder()
                .value(10000).city("delhi").year(2003).build();


        List<Transaction> test = List.of(t1, t2, t3, t4, t5, t6, t7);

        int highValueTransaction = test.stream().mapToInt(Transaction::getValue).max().orElseThrow(RuntimeException::new);
        List<Transaction> sortedList = test.stream().sorted(Comparator.comparingInt(Transaction::getValue).reversed()).toList();
        Map<Integer, Long> countedPerYear = test.stream().map(Transaction::getYear).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> uniqueCities = test.stream().map(Transaction::getCity).distinct().toList();

    }
}
