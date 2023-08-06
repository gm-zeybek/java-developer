import java.util.HashSet;
import java.util.Set;

public class SetReview1 {

    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();
        mySet.add(new Student(1, "Ahmet"));
        mySet.add(new Student(1, "Ahmet"));
        mySet.add(new Student(4, "Muhammet"));
        System.out.println(mySet);

        Set<Integer> myIntSet = new HashSet<>();
        myIntSet.add(1);
        myIntSet.add(2);
        System.out.println(myIntSet);
        System.out.println(myIntSet.add(2));

        System.out.println(firstRepeatingChar("Java developer"));
    }

    public static Character firstRepeatingChar(String str){
        // Create a hashmap
        Set<Character> chars = new HashSet<>();
        // Iteration return ch if add return false
        for(Character ch: str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }
}
