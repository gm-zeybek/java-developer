package flatMap;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        // print emails
        EmployeeData.readAllEmp()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        // print phone numbers
        System.out.println("phone numbers using map");
        EmployeeData.readAllEmp()
                .map(Employee::getEmpPhonesNumbers)
                .forEach(System.out::println);

        System.out.println("phone number using flatmap");
        EmployeeData.readAllEmp()
                .flatMap(employee -> employee.getEmpPhonesNumbers().stream())
                .forEach(System.out::println);

        System.out.println("alternative method with flatmap");
        EmployeeData.readAllEmp()
                .map(Employee::getEmpPhonesNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
