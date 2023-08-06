import java.util.*;

public class Collectionreview {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        System.out.println("list print");
        student.add(new Student(1, "murat"));
        student.add(new Student(2, "said"));
        student.add(new Student(3, "hulya"));
        student.add(new Student(4, "kamil"));
        System.out.println(student);

        System.out.println("for loop");
        for (int i =0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
        Iterator item = student.listIterator();
        System.out.println("iterator implemantaion");
        while (item.hasNext()){
            System.out.println(item.next());
        }
        System.out.println("iterator backford with iterator");
    while (((ListIterator<?>) item).hasPrevious()){
        System.out.println(((ListIterator<?>) item).previous());
    }
        System.out.println("foreach loop");
        for (Student students: student) System.out.println(students);
        System.out.println("lambda printer");
        student.forEach(student1 -> System.out.println(student1));
        // sorting elements inlist
        System.out.println("sorting desc by Comparator class by id");
        Collections.sort(student,new sortByIdDesc());
        System.out.println(student);
        System.out.println("sorting desc by Comparator class by name");
        Collections.sort(student,new sortByNameDesc());
        System.out.println(student);

    }

    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

    }

