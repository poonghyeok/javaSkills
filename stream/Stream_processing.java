package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_processing {

    public static void main(String[] args){
        String[] arr = {"lee", "poong", "hyeok"};
        List<String> names = Arrays.asList(arr);

//        Stream<String> stream = names.stream().filter(name -> name.contains("e")); //filter는 람다식의 return 의 true인 case만 스트림에 남긴다.
//        stream.forEach(s -> System.out.print(s + " "));

//        Stream<String> stream = names.stream().map(String::toUpperCase);
//        stream.forEach(s -> System.out.println(s)); //map의 경우 기존 요소들을 가지고 map method내의 input logic을 거친 output을 새로운 stream으로  return 한다.

        Product product = new Product();
        //  .map(Product::getAmount); 부터 ~ Product 객체를 제너릭으로 가지는 List 프로세싱!

    }

}


