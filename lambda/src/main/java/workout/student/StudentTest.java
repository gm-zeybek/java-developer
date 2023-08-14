package workout.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
                students.add(new Student("Ellie",90,"Female"));
                students.add(new Student("Ollie",75,"Male"));
                students.add(new Student("Eddie",60,"Male"));


        System.out.println(Student.builder().marks(130).gender("Female").build());

        // if field is instant 3 ways to initialize (directly, instant block and with constrution)
                // if field is static 2 ways to initialize (directly, and static block)
                // @Data is inclusive (getter,setter, requiered argument const, toString, hascodeAndEquals)
                // @Builder uses it's class
        // @FunctionalInterfaces is for avoid to add another abstract method inside the functional interface, but ok for non-abstract method
        // Otherwise it breaks all lambda functions
//                Collections.sort(students,(a,b)->a.getName().compareTo(b.getName()));
        Collections.sort(students,(s1,s2)-> Student.compareMarks(s1,s2));

        System.out.println(students);
        for (Student s1:students) {



        }

    }
}
