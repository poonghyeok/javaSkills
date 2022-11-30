package stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamStudy_generate {

    public static void main(String[] args){
        //stream : 데이터의 흐름, 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.
        //람다를 이용해서 코드의 양을 줄이고 간결하게 표현 가능. 배열과 컬렉션 함수형 처리 가능.

        //스트림 생성하기
        //배열 스트림 : Arrays.stream() method 사용
//        String[] arr = new String[]{"a","b","c"};
//        Stream<String> stream = Arrays.stream(arr);
//        Stream<String>  streamOfArrayPar = Arrays.stream(arr, 1 , 3);

        //Collection stream : Collection, List, Set 의 경우 인터페이스에 추가된 디폴트 메소드 stream을 이용해서 스트림을 만들 수 있다.
//        List<String> list = Arrays.asList("a","b","c");
//        Stream<String> stream =list.stream();
//        Stream<String> parallelStream = list.parallelStream();

        //Stream.builder()
        //스트림에 직접적으로 원하는 값을 넣을 수 있다.  마지막에 build() method로 스트림 return 가능
//        Stream<String>  builderStream = Stream.<String>builder().add("Eric").add("Elena").add("Java").build();

        //Stream.generate()
        //generate 메소드를 이용하면 Supplier<T> 에 해당하는 람다로 값을 넣을 수 있다.
        //generate method에 arg Supplier<T>는 인자는 없고 리턴값만 있는 함수형 인터페이스다. 람다에서 리턴하는 값이 들어간다.
//        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5);
//        generatedStream.forEach(s -> System.out.println("generaged : " + s));

        //Stream.iterate()
        //iterate method : 초기값과 해당 값을 다루는 람다를 이용해서 스트림에 들어갈 요소를 만든다.
//        Stream <Integer> iteratedStream = Stream.iterate(30, n -> n+2).limit(10);
//        iteratedStream.forEach(s -> System.out.println("element : " + s));

        //기본 타입형 스트림 : 제네릭을 사용하지 않고도 직접적으로 해당 타입의 스트림을 다룰 수도 있다.
//        IntStream intStream = IntStream.range(1,5);
//        intStream.forEach(s -> System.out.print(s+ " ")); //1이상 5미만
//        intStream = IntStream.rangeClosed(1,5);
//        System.out.println();
//        intStream.forEach(s -> System.out.print(s + " ")); //1이상 5이하
        //generic을 사용하지 않기 때문에, 오토박싱이 일어나지 않는다. 필요한 경우 boxed 메소드를 이용해서 boxing할 수 있다.

//        Stream<Integer> boxedIntStream = IntStream.range(1,5).boxed();//임의적으로 boxing처리

//        DoubleStream doubles = new Random().doubles(3); //난수 3개 생성 ??
        //Random() 클래스는 난수를 가지고 세 가지 타입의 스트림을 만들어낼 수 있다. 후속작업에 유용

        //문자열 스트링
//        IntStream charStream = "Stream".chars(); //S 부터 m 까지의 character 들이 유니코드로 IntStream에 들어간다. 유니코드는 기본적으로 정수이므로 IntStream에 넣을 수 있다.
//        charStream.forEach(s -> System.out.print(s + " "));

        //정규표현식을 이용해서 문자열을 자르고, 각 요소들로 스트림을 만들 수 있다.
//        Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Lee, poong, hyeok");
//        stringStream.forEach(s -> System.out.print(s + " "));

        //Stream 연결하기
        //Stream.concat method를 이용해 두 개의 스트림을 연결해서 새로운 스트림을 만들어낼 수 있다.
//        Stream<String> stream1 = Stream.of("동해물과", "백두산이", "마르고");
//        Stream<String> stream2 = Stream.of( "가을하늘", "공활한데", "높고");
//        Stream<String> concat = Stream.concat(stream1, stream2);

//        concat.forEach(s -> System.out.println(s));

    }

    //비어있는 stream  return 하는 메서드
    public Stream<String> streamOf(List<String> list){
        return list == null || list.isEmpty() //list가 생성되지도 않은 객체 이거나 (||) 생성되었지만 비어있는 경우
                ? Stream.empty()
                : list.stream();
    }

}
