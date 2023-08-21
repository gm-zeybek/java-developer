package task4;

import task1.DishData;

import java.util.Optional;

public class mapAndReduce {
    public static void main(String[] args) {
        Integer totalDish = DishData.getAll().stream()
                .map(d -> 1)
                .reduce(0, ((dish, dish2) -> dish + dish2));
        System.out.println(totalDish);
        long totalDishWithCount = DishData.getAll().stream()
                .count();
        System.out.println(totalDishWithCount);

    }
}
