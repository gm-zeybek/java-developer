import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {
        //creating stream

        String[] courses = {"java", "js", "Ts"};
        Stream<String> coursesStream =  Arrays.stream(courses);

        // Creating from List
        List<String> coursesList = Arrays.asList("java", "js", "ts");
        Stream<String> coursesListStream = coursesList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("java", 100),
                new Course("spring", 101),
                new Course("microservise", 102),
                new Course("databases", 103)
        );
        Stream<Course> myCourseStream = myCourses.stream();


        // creating stream from data
        Stream<Integer> StreamOfData = Stream.of(1, 2, 4, 5);


    }
}
