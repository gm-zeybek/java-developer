package workout.comparatorInterface;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,-2);
        System.out.println(list);
        Collections.sort(list);

        System.out.println("*****USING COMPARATOR INTERFACE SORT *********");
        Collections.sort(list,new MyComparator());
        System.out.println(list);
        Collections.sort(list,((o1, o2) -> (o1>o2)?-1:(o2>o1)?1:0));
        System.out.println(list);
        // lambda compareTo method
        System.out.println("*********USING COMPARE TO METHOD *********");
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);
        System.out.println("*******REVERSED *******");
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);

        List<Apple> myInventory = Arrays.asList(
            new Apple(80, Color.GREEN),
            new Apple(155, Color.RED),
            new Apple(120, Color.GREEN)
        );

        System.out.println("*******USING COMPARATOR METHOD BY STATIC IMPORT********");
        Comparator<Apple> appleComparator = comparing(apple -> apple.getWeight());
        myInventory.sort(appleComparator);
        System.out.println(myInventory);

        myInventory.sort(comparing(apple->apple.getWeight()));
        System.out.println(myInventory);
        System.out.println("*******DOUBLE COLON OPERATOR ********");
        myInventory.sort(comparing(Apple::getWeight));
        // reversed method
        System.out.println("*******CHAINING DUBLE COLON OPERATOR*******");
        myInventory.sort((comparing(Apple::getWeight).reversed()));
        System.out.println(myInventory);
        // sorting by color
        myInventory.sort((comparing(Apple::getWeight)));
        System.out.println(myInventory);
        // comparing channing
        System.out.println("********CHAINING MULTIPLE COMPARATOR**********");
        myInventory.sort(comparing(Apple::getColor).reversed().thenComparing(Apple::getWeight));
        System.out.println(myInventory);
    }
}
