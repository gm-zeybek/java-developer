package reducing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 6, 4, 6, 6);
        Integer sumOfNumbers = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sumOfNumbers);

        Optional sumOfNumber2 = list.stream().reduce((a, b) -> a + b);
        System.out.println(sumOfNumber2);

        Optional<Integer> min = list.stream().reduce(Integer::min);
        Optional<Integer> max = list.stream().reduce(Integer::max);
        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println(min.get());
        System.out.println(max.get());
        System.out.println(sum.get());


    }
}
