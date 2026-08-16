import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        /*Double value3 = 0.1;
        Double value4 = 0.2;
        var value1 = 0.1;
        var value2 = 0.2;

        System.out.println(value1 + value2);
        System.out.println(value3 + value4);

        System.out.println("==============");


        System.out.println(new Double(2.00) - new Double(1.4));
        System.out.println(new Double(2.00) - new Double(1.5));
        System.out.println(new Double(2.00) - new Double(1.6));
        System.out.println(new Double(2.00) - new Double(1.1));
        System.out.println(new Double(2.00) - new Double(1.2));
        System.out.println(new Double(2.00) - new Double(1.3));
        System.out.println(new Double(2.00) - new Double(1.7));
        System.out.println(new Double(2.00) - new Double(1.8));
        System.out.println(new Double(2.00) - new Double(1.9));
        System.out.println(new Double(2.00) - new Double(2));*/


        var value1 = new BigDecimal("128");
        var value2 = new BigDecimal("144");
        /*System.out.println(value1.add(value2));
        System.out.println("=======================");

        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.4")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.5")));

        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.6")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.1")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.2")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.3")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.7")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.8")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("1.9")));
        System.out.println(new BigDecimal("2.00").subtract( new BigDecimal("2")));*/


//        System.out.println(value2.divide(value1)); = 2
        System.out.println(value2.divide(value1));
        System.out.println(value2.divide(value1, 9, RoundingMode.HALF_UP));
        System.out.println(value2.sqrt(new MathContext(2)));
        System.out.println(value2.sqrt(MathContext.DECIMAL128));
        System.out.println(value2.pow(2));



    }
}