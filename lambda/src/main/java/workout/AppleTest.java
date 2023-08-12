package workout;

import task.taskEg.AppleHeavyPredicate;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {
    List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(30, Color.RED));
        inventory.add(Apple.builder().color(Color.RED).weight(40).build());

        PrintFormatter simpleFormatter = (apple -> "An apple of " + apple.getWeight() + "g.");
        PrintFormatter fancyFormatter = apple -> {
            String charecteristics = apple.getWeight()>150? "HEAVY":"LIGHT";
            return "An " + charecteristics +" "+ apple.getColor()+ " apple";
        };


        printFormatter(inventory,simpleFormatter);
        printFormatter(inventory,fancyFormatter);

    }


    public static void printFormatter(List<Apple> appleInventory, PrintFormatter printFormatter){
        for (Apple apple:appleInventory) {
            String output = printFormatter.accept(apple);
            System.out.println(output);
        }
    }


}
