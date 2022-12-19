package stream.thisjavaver.sec02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLIneExample {

    public static void main(String[] args){
        List<Student> list = Arrays.asList(new Student("이풍혁", 10), new Student("김풍혁", 20), new Student("박풍혁", 30));
        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double average = scoreStream.average().getAsDouble();

        System.out.println(average);

        double averagePrime = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
        System.out.println(averagePrime);

    }
}
