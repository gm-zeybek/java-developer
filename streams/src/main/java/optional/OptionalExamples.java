package optional;

import java.util.List;
import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 44, 7);
        System.out.println("is Empty");
        System.out.println(numbers.isEmpty());
        System.out.println("is Present");
        boolean isPresentEG = Optional.of(numbers).isPresent();
        System.out.println(isPresentEG);
        System.out.println("if present");
        Optional<Integer> bigNumber = numbers.stream()
                .filter(number -> number > 50)
                .findAny();
//        System.out.println(bigNumber);
        System.out.println("prints if there is a number");
        bigNumber.ifPresent(System.out::println);
        System.out.println("get");
//        Integer ifNumberExsist = bigNumber.get();
//        System.out.println(ifNumberExsist);
        System.out.println("orElse for default");
        System.out.println(bigNumber.orElse(0));

    }
}
