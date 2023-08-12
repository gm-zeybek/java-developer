package functionalInterface;

import workout.Apple;
import workout.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {
    List<User> userList = new ArrayList<>();
        userList.add(User.builder().firstName("Murat").lastName("Zeybek").age(51).build());
        userList.add(User.builder().firstName("Tarik").lastName("Eke").age(51).build());

        Consumer<List<User>> printName = user -> {
            for (User users :user) {
            System.out.println(users.getFirstName());
            }
        };
        printName.accept(userList);

        Predicate<User> iLastNameStartsWithE = User -> User.getLastName().startsWith("E");
        Consumer<List<User>> ListOfEUsersPredicate= users -> {
            for (User user:users) {
                System.out.println(iLastNameStartsWithE.test(user)? user.getFirstName():"");
            }
        };
        ListOfEUsersPredicate.accept(userList);
        System.out.println("new with lambda");
        printName(userList,user -> true);
        printName(userList,user -> user.getLastName().startsWith("E"));
        List<Apple> appleList = new ArrayList<>();
        appleList.add(Apple.builder().weight(120).color(Color.RED).build());
        appleList.add(Apple.builder().weight(220).color(Color.GREEN).build());
        appleList.add(Apple.builder().weight(420).color(Color.RED).build());
        appleList.add(Apple.builder().weight(154).color(Color.GREEN).build());
        printApple(appleList,apple -> apple.getWeight()>120,apple -> apple.getColor().equals(Color.GREEN));

    }

    public static void printName(List<User> userList, Predicate<User> predicate){
        for (User user:userList) {
            if (predicate.test(user)) {
                System.out.println(user);
            }
        }
    }

    public static void printApple(List<Apple> inventory, Predicate<Apple> AppleHeavyPredicate, Predicate<Apple> colorPredicate){
        for (Apple apple:inventory) {
            if (AppleHeavyPredicate.test(apple)) {
                String color = colorPredicate.test(apple)? "HEAVY":"LIGHT";
                System.out.println("an apple of "+color+ apple.getWeight()+"g");
            }
        }
    }
}
