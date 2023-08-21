package task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class TestTransaction {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));
        System.out.println(transactions);
        //TASK
        //1. Find all transactions in the year 2011 and sort them by value (small to high)
        System.out.println("1.Find all transactions in the year 2011 and sort them by value (small to high)");
        transactions.stream()
                .filter(t->t.getYear()==2011)
                .sorted(comparing(t->t.getValue()))
                .forEach(System.out::println);
        //2. What are all the unique cities where the traders work?
        System.out.println("2. What are all the unique cities where the traders work?");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getcity())
                .distinct()
                .forEach(System.out::println);

        //3. Find all traders from Cambridge and sort them by name.
        System.out.println("3. Find all traders from Cambridge and sort them by name.");
        transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getcity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(trader -> trader.getName()))
                .forEach(System.out::println);

        //4. Return a string of all traders' names sorted alphabetically.
        System.out.println("4. Return a string of all traders' names sorted alphabetically.");
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", String::concat));

        //5. Are any traders based in Milan?
        System.out.println("5. Are any traders based in Milan?");
        System.out.println(transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getcity().equals("Milan")));
        //6. Print the values of all transactions from the traders living in Cambridge.
        System.out.println("6. Print the values of all transactions from the traders living in Cambridge.");
        System.out.println(transactions.stream()
                .filter(transaction -> transaction.getTrader().getcity().equals("Cambridge"))
                .map(transaction -> transaction.getValue())
                .reduce(Integer::sum)
                .get());

        //7. What is the highest value of all the transactions?
        System.out.println("7. What is the highest value of all the transactions?");
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max)
                .get());
        //8. Find the transaction with the smallest value.
        System.out.println("8. Find the transaction with the smallest value.");
        transactions.stream()
                .sorted(comparing(transaction -> transaction.getValue()))
                .limit(1)
                .forEach(System.out::println);
    }
}
