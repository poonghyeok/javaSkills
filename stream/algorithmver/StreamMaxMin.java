package stream.algorithmver;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamMaxMin {

    public static void main(String[] args) throws NoSuchFieldException {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 5, 2);
        Integer sum1 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("sum 1 : " + sum1);

        int sum2 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println("sum2 : " + sum2);

        final OptionalDouble avg = numbers.stream().mapToInt(Integer::intValue).average();
        final double avgAsDouble = avg.getAsDouble();
        System.out.println("avgAsDoulbe = " + avgAsDouble);

        final Integer max = numbers.stream().reduce(0, Integer::max);
        final OptionalInt max1 = numbers.stream().mapToInt(Integer::intValue).max();
        System.out.println("max : " + max);
        System.out.println("max1.orElse(0)" + max1.orElse(0));

        final Integer min = numbers.stream().reduce(0, Integer::min);
        final OptionalInt min1 = numbers.stream().mapToInt(Integer::intValue).min();
        System.out.println("min = " + min);
        System.out.println("min1.getAsInt() = " + min1.getAsInt());
    }

}
