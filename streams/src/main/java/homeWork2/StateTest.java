package homeWork2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {


        State England = new State("England");
        England.addCity("London");
        England.addCity("Manchester");
        England.addCity("Birmingham");
        England.addCity("Liverpool");

        State Scotland = new State("Scotland");
        Scotland.addCity("Glascove");
        Scotland.addCity("Leeds");
        Scotland.addCity("NewCastle");

        State Wales = new State("Wales");
        Wales.addCity("Cardiff");


        List<State> listOfStates = Arrays.asList(Scotland,England, Wales);



        System.out.println("print all the cities");

        listOfStates.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
