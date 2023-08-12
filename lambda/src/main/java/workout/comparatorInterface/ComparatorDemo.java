package workout.comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,-2);
        System.out.println(list);
        Collections.sort(list);

//        Collections.sort(list,new MyComparator());
//        System.out.println(list);
//        Collections.sort(list,((o1, o2) -> (o1>o2)?-1:(o2>o1)?1:0));
//        System.out.println(list);
        // lambda compareTo method
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);

        List<Apple> myInventory = Arrays.asList(
            new Apple(80, Color.GREEN),
            new Apple(155, Color.RED),
            new Apple(120, Color.GREEN)
        );
        Comparator<Apple> appleComparator = Comparator.comparing(apple -> apple.getWeight());
        myInventory.sort(appleComparator);
        System.out.println(myInventory);
    }
}
