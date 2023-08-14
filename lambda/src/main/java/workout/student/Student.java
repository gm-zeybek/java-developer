package workout.student;

import lombok.*;

//@Data
//@AllArgsConstructor
@Builder
//@NoArgsConstructor
//@Getter
//@RequiredArgsConstructor
public class Student {
    private  String name;
    private int marks;
    private  final String gender;



//    public String getName(){
//        System.out.println("from special getter");
//        return this.name;
//    }


    public static int compareMarks(Student s1, Student s2){
        return s1.marks-s2.marks;
    }

    public static Student compareTwoStudents(Student s1, Student s2){
        return s1.marks>s2.marks? s1:s2;
    }

}

