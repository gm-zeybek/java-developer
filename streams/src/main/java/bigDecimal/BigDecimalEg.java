package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalEg {
    public static void main(String[] args) {
        double d1 = 17.45;
        double d2 = 17.46;
        System.out.println(d1 - d2);
        BigDecimal decimal1 = BigDecimal.valueOf(17.45);
        BigDecimal decimal2 = BigDecimal.valueOf(17.46);
        System.out.println(decimal2.subtract(decimal1));
        System.out.println("scaling and rounding");
        BigDecimal bigDecimal1 = BigDecimal.valueOf(15.45);
        System.out.println(bigDecimal1.setScale(1, RoundingMode.CEILING));
        System.out.println("compare to");
        System.out.println("compare to makes it if big results 1 else -1 or 0");
        System.out.println(new BigDecimal(23).compareTo(new BigDecimal(34)));
        System.out.println(new BigDecimal(50).compareTo(new BigDecimal(34)));
        System.out.println(new BigDecimal(50).compareTo(new BigDecimal(50)));

    }
}
