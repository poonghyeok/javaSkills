package stream.thisjavaver.sec01;

//중간처리와 최종처리
//스트림은 하나 이상 연결될 수 있다. 예를 들면 오리지널 스트림 + 필터링 중간 스트림 + 매핑 중간 스트림
// 이렇게 여러 개의 스트림이 연결되어 있는 것을 스트림 파이프라이이다.

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudent {

    public static void main(String[] args){
        List<Student> list = Arrays.asList(
            new Student("아이폰", 140)
            ,new Student("맥북", 210)
            ,new Student("애플펜슬", 7)
        );

        /* 방법 1.
        Stream<Student> studentStream = list.stream();
        //중간처리
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        //최종처리 ( 평균 점수 )
        double avg = scoreStream.average().getAsDouble();
        */

        //방법2.
        double avg = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();

        System.out.println("avg : " + avg);

    }
}
