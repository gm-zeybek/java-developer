package homeWork2;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class State {
    //Suppose we have a State class that contains list of cities. Create a list of States and print all the cities.

    private String stateName;

    private List<String> cities = new ArrayList<>();

    public State(String stateName) {
        this.stateName = stateName;
    }

    public void addCity(String city) {
        cities.add (city);
    }
    public List<String> getCities () {
            return this.cities;
    }
}
