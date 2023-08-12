package workout;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Apple {
    private int weight;
    private Color color;

}
