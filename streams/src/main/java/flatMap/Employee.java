package flatMap;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Employee {
    private Integer empId;
    private String empName;
    private String empEmail;
    private List<String> empPhonesNumbers;

}
