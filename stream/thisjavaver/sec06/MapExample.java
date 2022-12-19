package stream.thisjavaver.sec06;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("이풍혁", 85));
        studentList.add(new Student("이풍혁", 92));
        studentList.add(new Student("이풍혁", 87));

        studentList.stream()
                .mapToInt(student -> student.getScore())
                .asDoubleStream()
                .forEach(score -> System.out.println(score));
    }
}
