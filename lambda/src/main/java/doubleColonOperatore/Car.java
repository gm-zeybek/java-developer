package doubleColonOperatore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Car {
    private Integer make;
    private String model;

    public Car(Integer make) {
        this.make = make;
    }

    public Car() {
    }

    public Car(Integer make, String model) {
        this.make = make;
        this.model = model;
    }
}



