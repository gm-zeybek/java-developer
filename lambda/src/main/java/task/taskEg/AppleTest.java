package task.taskEg;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(140, Color.RED));
        appleList.add(new Apple(240, Color.GREEN));
        appleList.add(new Apple(340, Color.RED));
        appleList.add(new Apple(40, Color.GREEN));

        for (Apple apple:appleList) {
            System.out.println(apple);
        }
       ApplePredicate heavyPredicate = new AppleHeavyPredicate();
        ApplePredicate redPredicate = new AppleRedColorPredicate();

        System.out.println(filter(appleList, heavyPredicate));
        System.out.println(filter(appleList, redPredicate));

        prettyPrintApple1(appleList,heavyPredicate,redPredicate);
        prettyPrintApple2(appleList);


    }

    public static List<Apple> filter(List<Apple> list, ApplePredicate filter){
        List<Apple> apples = new ArrayList<>();
        for (Apple apple:list) {
            if(filter.test(apple)){
                apples.add(apple);
            };
        }
        return apples;
    }

    public static void prettyPrintApple1(List<Apple> apples, ApplePredicate weightPredicate, ApplePredicate colorPredicate){
        for (Apple apple:apples) {
            String weight = weightPredicate.test(apple)? "HEAVY":"LIGHT";
            String color = colorPredicate.test(apple)? "RED":"GREEN";
            String output = "A " + weight + " " +color+ " apple";
            System.out.println(output);
        }
    }

    public static void prettyPrintApple2(List<Apple> apples){

        for (Apple apple:apples) {
            String output = "An apple of " + apple.getWeight() + "g";
            System.out.println(output);
        }

    }


    //deneme
}
