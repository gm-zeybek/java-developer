package doubleColonOperatore;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {


    public static void main(String[] args) {
        System.out.println("******No contractor*****");
        Supplier<Car> noConst = ()-> new Car();
        System.out.println(noConst.get().getModel());
        Supplier<Car> noConst2 = Car::new;
        System.out.println(noConst2.get().getMake());
        System.out.println("******ONe contractor*****");
        Function<Integer,Car> oneConst = make-> new Car(make);
        Function<Integer,Car> oneConst1 = Car::new;
        System.out.println(oneConst1.apply(2009));
        System.out.println("******Two contractor*****");
        BiFunction<Integer, String, Car> twoConst = (make, model) -> new Car(make, model);
        System.out.println(twoConst.apply(2009, "BMW"));
        BiFunction<Integer,String,Car> twoConst2 = Car::new;
        System.out.println(twoConst2.apply(2000, "BMW"));
    }
}
