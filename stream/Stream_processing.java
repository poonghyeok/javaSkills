package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_processing {

    public static void main(String[] args){
        String[] arr = {"lee", "poong", "hyeok"};
        List<String> names = Arrays.asList(arr);

//        Stream<String> stream = names.stream().filter(name -> name.contains("e")); //filter는 람다식의 return 의 true인 case만 스트림에 남긴다.
//        stream.forEach(s -> System.out.print(s + " "));

//        Stream<String> stream = names.stream().map(String::toUpperCase);
//        stream.forEach(s -> System.out.println(s)); //map의 경우 기존 요소들을 가지고 map method내의 input logic을 거친 output을 새로운 stream으로  return 한다.

//        Product product1 = new Product();
//        product1.setAmonut(10);
//        Product product2 = new Product();
//        product2.setAmonut(20);
//        Product product3 = new Product();
//        product3.setAmonut(30);
//        List<Product> list = new ArrayList<>();
//        list.add(product1);
//        list.add(product2);
//        list.add(product3);
//
//        Stream<Integer> stream = list.stream().map(Product::getAmonut);//generic이 integer인 stream의 가공작업이 끝났음. 객체에서 amount만 뺴냄
//        stream.forEach(s -> System.out.println(s));

        //  .map(Product::getAmount); 부터 ~ Product 객체를 제너릭으로 가지는 List 프로세싱! //Product형 객체의 getter method의 return 값들로만 stream의 프로세싱 가능.

        //flatMap : 중첩 구조를 한단계 제거하고 단일 컬렉션으로 만들어주는 역할 ( 중첩 구조를 제거하는 작업을 flattening 이라고 한다.
//        String[] arr1 = {"abc", "def"};
//        String[] arr2 = {"123", "456"};
//
//        List<List<String>> list = Arrays.asList(Arrays.asList(arr1), Arrays.asList(arr2));
//        System.out.println(list);
//        List<String> flatList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println(flatList);
            //flatMap은 어렵다. 객체용 flatMap도 있긴 한데

        //Sorting : 정렬의 방법은 다른 정렬과 마찬가지로 Comparator 이용.
//        List<Integer> list = IntStream.of(14, 11, 20, 39, 23).sorted().boxed().collect(Collectors.toList());//boxed()를 통해 Wrapping해주고 collect 메소드를 Collectors.toList()의 인자와 함께 호출하면서 list화 시켜버렸다.
//        System.out.println(list);

        List<String> lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

//        List<String> reverseSortedLang = lang.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(reverseSortedLang);
//
//        List<String> sortedLang = lang.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedLang);

        //Comparator의 static method가 아닌 custom compare(?) 사용하기
//        System.out.println(lang.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList())); //comparingInt의 String인 경우 length를 사용하여 길이 순으로 오름차 순 정렬이 되도록, 개쩌는건 길이가 동일할 경우 사전순으로 정렬시켰다..!
//        System.out.println(lang.stream().sorted((s1,s2) -> s2.length() - s1.length()).collect(Collectors.toList())); //오름차순이면 s1.lenght() - s2.length()를 했을 텐데, s2.length() - s1.length()를 했다는 건 내림차 순 정렬을 하기 위함.

        //peek, peek은 그냥 확인해본다는 의미, 특정 결과를 반환하지 않는 함수형 인터페이스 Consumer를 인자로 받는다.
//        System.out.println(IntStream.of(1,3,5,7,9)
//                .peek(System.out::println) //이와 같이 peek method를 통해 so를 찍어볼 수 있다.
//                .sum()
//        );

        //결과 만들기


    }

}




