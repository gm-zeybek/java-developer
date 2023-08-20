package matchingAndFinding;

import task1.Dish;
import task1.DishData;

import java.util.Optional;

public class matchingAndFinding {
    public static void main(String[] args) {

        boolean isHealty = DishData.getAll().stream().allMatch(a -> a.getCalori() < 1000);
        System.out.println("dish is isHealthy "+ isHealty);
        if (DishData.getAll().stream().anyMatch(Dish::getIsVegaterian)) {
            System.out.println("Dish is vegetarian friendly");
        }
        boolean isHealty2 = DishData.getAll().stream().noneMatch(a -> a.getCalori() > 1000);
        System.out.println("dish is healthy ishealthy -"+isHealty2);
        Optional<Dish> anyDish = DishData.getAll().stream()
                .filter(Dish::getIsVegaterian)
                .findAny();
        System.out.println("anydish is "+anyDish.get());
        Optional<Dish> firstDish = DishData.getAll().stream()
                .filter(Dish::getIsVegaterian)
                .findFirst();
        System.out.println("first dish is "+firstDish.get());
    }
}
