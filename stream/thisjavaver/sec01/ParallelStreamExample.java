package stream.thisjavaver.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("아이폰");
        list.add("아이패드");
        list.add("에어팟");
        list.add("애플워치");
        list.add("맥북");

        Stream<String> normalStream = list.stream();
        normalStream.forEach(name -> {
            System.out.println(name + " : " + Thread.currentThread().getName()); //오호.. parallelStream() 메소드르 통해 병렬처리 스트림을 얻어서 활용할 수 있다.

        });
    }

}
