package task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {

    private String name;
    private Boolean isVegaterian;
    private Integer calori;
    private Enum Type;
}
