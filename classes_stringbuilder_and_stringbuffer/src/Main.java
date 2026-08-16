import java.sql.SQLOutput;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        /*
        String stringConcat = "value";
        stringConcat += "2" ;
        System.out.println(stringConcat);
        */
/*

        var stringStart = OffsetDateTime.now();
        String stringConcat = "";
        for (int i = 0; i < 400_000; i++) {
            stringConcat += i;
            */
/*
            o IDE recomenda uma alternativa quando vc
            quer fazer concatenacao em loop, o StringBuilder
            *//*

        }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String: %s \n", getInterval(stringStart, stringEnd));

        var builderStart = OffsetDateTime.now();
        StringBuilder builderConcat = new StringBuilder();
        for (int i = 0; i < 400_000; i++) {
            builderConcat.append(i);

        }
        var builderEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder(single thread): %s \n", getInterval(builderStart, builderEnd));


        var bufferStart = OffsetDateTime.now();
        StringBuffer bufferConcat =  new StringBuffer();
        for (int i = 0; i < 400_000; i++) {
            bufferConcat.append(i);
        }
        
        var bufferEnd = OffsetDateTime.now();
        System.out.printf("StringBuffer(multithread): %s \n", getInterval(bufferStart, bufferEnd));
*/

        var builder1 = new StringBuilder("1234567890");
        System.out.println(builder1.insert(5, "a"));
        System.out.println(builder1.delete(0,3));





    }

    private static long getInterval(OffsetDateTime stringStart, OffsetDateTime stringEnd) {
        return Duration.between(stringStart, stringEnd).toMillis();
    }





}