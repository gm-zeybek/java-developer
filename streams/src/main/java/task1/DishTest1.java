package task1;


import java.util.Arrays;
import java.util.List;

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
        menu.stream()
                .map(d->d.getName().length())
                .forEach(System.out::println);
        System.out.println("Print dish names of dishes which have less than 400 calories");
        menu.stream()
                .filter(d->d.getCalori()<400)
                .map(d->d.getName())
                .forEach(System.out::println);

    }
}
