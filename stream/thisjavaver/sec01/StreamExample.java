package stream.thisjavaver.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

//Stream은 요소들이 하나씩 흘러가면서 처리된다는 의미를 가지고 있다.
//보통 stream() 메소드를 Stream객체를 얻고 forEach() 안에서 람다식
//코드의 단축뿐만 아니라, 내부 반목이므로 처리속도가 빠르고 병렬처리가 효율적이다.
// 람다식으로 다양한 요소 처리를 정의할 수 있다.
// 중간 처리와 최종처리를 수행하도록 파이프 라인을 형성할 수 있다.

//what is 내부 반복자 : for, Iterator 는 요소를 컬렉션 바같쪽으로 반보개서 가져와 처리하는데 이를 외부 반복자라고 한다.
// 반면 스트림은 그렇다면 javascript또한 그냥 for문을 돌리는 것과 forEach나filter를 통해 내부 반복자를 돌리는 것이랑 성능차이가 있나. 아니다.

//내부 반복자는 멀티 코어 CPU를 최대한 활용하기 위해 요소들을 분배시켜 병렬 작업을 할 수 있다.
//하나씩 처리하는 순차적 외부 반복자보다는 효율적으로 요소를 반복시킬 수 있다.

public class StreamExample {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("이풍혁");
        set.add("손흥민");
        set.add("황희찬");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));

    }
}
