package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAllEmp(){
        return Stream.of(
                new Employee(101,"Mike", "mike@cydeo.com", Arrays.asList("421415415","246262676")),
                new Employee(102,"Ozzy", "ozzy@cydeo.com", Arrays.asList("4214525415","247473676")),
                new Employee(103,"Murat", "murat@cydeo.com", Arrays.asList("421636415","2466346676"))
        );
    };
}
