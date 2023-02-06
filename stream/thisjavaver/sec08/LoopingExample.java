package stream.thisjavaver.sec08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LoopingExample {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
//        Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)); //최종처리가 없으므로 동작하지 않는 코드다. peek한 값들을 유의미하게 써야한다. 하나 봤는데 어떡하라고?

//        System.out.println(Arrays.stream(intArr).filter(i -> i % 2 != 0).peek(n -> System.out.println(n)).sum()); //peek에 대한 처리를 해줬으므로 peek의 람다식이 동작을 한다.

        Arrays.stream(intArr).filter(i -> i %2 == 0).forEach(even -> System.out.println(even)); // 중간 처리 메서드인 peek() 과는 다르게 forEach는 최종처리 메서드이므로 정상 작동한다.
    }

}
