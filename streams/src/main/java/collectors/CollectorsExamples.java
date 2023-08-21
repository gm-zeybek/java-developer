package collectors;

import task1.Dish;
import task1.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 5, 6, 3, 4, 6);
        System.out.println("to ArrayList method");

        List<Integer> listCollection = listOfNumbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listCollection);

        System.out.println("to Set method");

        HashSet<Integer> setCollection = listCollection.stream()
                .filter(number -> number % 3 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(setCollection);
        System.out.println("to List method");
        List<Integer> toList = listCollection.stream()
                .filter(number -> number % 4 == 0)
                .collect(Collectors.toList());
        System.out.println(toList);
        System.out.println("to Set method");
        Set<Integer> toSet = listCollection.stream()
                .filter(number -> number % 4 == 0)
                .collect(Collectors.toSet());
        System.out.println(toSet);
        System.out.println("to map method ");
        Map<String, Integer> dishCaloriMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalori));
        System.out.println(dishCaloriMap);
        System.out.println("Counting");
        Long total = listOfNumbers.stream()
                .collect(Collectors.counting());
        System.out.println(total);
        System.out.println("SumInt Example");
        Integer sumIntCalori = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalori));
        System.out.println(sumIntCalori);
        System.out.println("averaging");
        Double averageCalori = DishData.getAll().stream()
                .collect(Collectors.averagingDouble(Dish::getCalori));
        System.out.println(averageCalori);
        System.out.println("Join method");
        List<String> courses = List.of("Java", "Js", "Ts");
        String joinWithDash = courses.stream()
                .collect(Collectors.joining("-"));
        System.out.println(joinWithDash);
        System.out.println("PartitioningBy");
        Map<Boolean, List<Dish>> dishByVegetarianPartition = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::getIsVegaterian));
        System.out.println(dishByVegetarianPartition);
        System.out.println("Grouping by");
        Map<Enum, List<Dish>> typeOfDishByGrouping = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(typeOfDishByGrouping);
    }
}
