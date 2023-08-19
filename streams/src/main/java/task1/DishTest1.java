package task1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Print the length of the name of each dish
 */
public class DishTest1 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH));
        System.out.println("Print length of dish names");
//        menu.stream()
//                .map(d->d.getName().length())
//                .forEach(System.out::println);

        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
        System.out.println("Print dish names of dishes which have less than 400 calories");
        menu.stream()
                .filter(d -> d.getCalori() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("Print three highest calori >300 of Dishes name");
        menu.stream()
                .filter(d->d.getCalori()>300)
//                .sorted(Comparator.comparing(Dish::getCalori).reversed())
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("print all dishes names that have less than 400 calories in sorted");

        menu.stream()
                .filter(d -> d.getCalori() < 400)
                .sorted(comparing(Dish::getCalori).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);


    }
}
