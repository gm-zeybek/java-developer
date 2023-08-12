package doubleColonOperatore;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class CalculateTest {
    public static void main(String[] args) {
        // static method implementation
        Calculate sum = (int a, int b) -> Calculator.findSum(a, b);
        sum.calculate(10,30);
        // instant method implementation
        Calculate m1 = (int a, int b) -> new Calculator().findMultiply(a, b);
        m1.calculate(2, 3);
        System.out.println("******USING INSTANT DOUBLE COLON*******");
        Calculate m2 = new Calculator()::findMultiply;
        m2.calculate(2, 4);
        System.out.println("****USING CONSUMER*******");
        BiConsumer<Integer,Integer> m3 = new Calculator()::findMultiply;
        m3.accept(3, 4);
        System.out.println("*********Using Bifunction method**********");
        BiFunction<String, Integer, String> fn = (a, b) -> a.substring(b);
        System.out.println(fn.apply("developer", 4));
        System.out.println("******USING BIFUNCTION WITH DOUBLE COLON******");
        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("developer", 4));
        System.out.println("********USING CONSUMER*******");
        BiConsumer<String, String> bc1 = (a, b) -> System.out.println(a + b);
        bc1.accept("3", "4");
        Consumer<String> bc2 = System.out::println;
        bc2.accept("anything");

        BiFunction<MyClass, Integer, Integer> method = MyClass::method;




    }
}
