import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 6, 7, 8, 8,9);
        myList.forEach(System.out::println);

        System.out.println("myList Stream and applied divideble into 3");
        myList.stream()
                .filter(a->a%3==0)
                .forEach(System.out::println);

        System.out.println("myList Stream and applied divideble into 3 distinct");
        myList.stream()
                .filter(a->a%3==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("myList stream will apply divided into 3 and limit 1");
        myList.stream()
                .filter(a -> a % 3 == 0)
                .limit(1)
                .forEach(System.out::println);
        System.out.println("myList stream will apply divided into 3 and skip 1");
        myList.stream()
                .filter(a -> a % 3 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("myList stream will apply multiply by 3 and filter dividable into 2 and limit 1");
        myList.stream()
                .map(a->a*3)
                .filter(a->a%2==0)
                .limit(1)
                .forEach(System.out::println);
        System.out.println("print the lenght of the each words");
        /*
        * Given a list of words, print the number of characters for each word.
            List<String> words = Arrays.asList( "JAVA", "APPLE", "HONDA", "DEVELOPER")

        * */
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream()
                .map(a->a.length())
                .forEach(System.out::println);

    }
}
