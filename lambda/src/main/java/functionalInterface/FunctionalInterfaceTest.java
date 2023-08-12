package functionalInterface;

import java.util.function.*;


public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        System.out.println("******PREDICATE***********");
        Predicate<Integer> lesserFunction = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 18;
            }
        };
        Predicate<Integer> bigger = apple -> apple>50;
        Boolean lesser = bigger.test(25);
        System.out.println(lesser);
        System.out.println(bigger.test(51));

        System.out.println("*************CONSUMER************");
        Consumer printout = t -> System.out.println(t);
        printout.accept("apple");

        System.out.println("************BICONSUMER**************");

        BiConsumer<Integer, Integer> addTwo = (t, u) -> System.out.println(t + u);
        addTwo.accept(3, 4);

        System.out.println("********FUNCTION****************");
        Function<String,String> function = a -> "this is a " + a;
        System.out.println(function.apply("functional Interface"));

        System.out.println("**********SUPPLIER*************");
        Supplier<Double> randomValue = ()-> Math.random();
        System.out.println(randomValue.get());


    }
}
