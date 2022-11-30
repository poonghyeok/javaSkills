> #### Java Stream 내용정리 

- **autoBoxing 이란?**
  - 원시 타입의 값을 해당하는 `wrapper` 클래스의 객체로 바꾸는 과정을 의미한다. 
  - `컴파일러` 는 원시 타입이 아래 두 가지 경우에 해당될 때 `autoBoxing` 을 적용한다.
    1. 원시타입이 Wrapper 클래스의 타입의 파라미터를 받는 메서드를 통과할 때
    2. 원시타입이 Wrapper 클래스의 변수로 할당될 때<br><br>
- **Double colon ::**
  - 메소드 참조 (method reference)
    - 람다 표현식이 단 하나의 메소드만을 호출하는 경우에 해당 람다 표현식에서 불필요한 매개변수를 제거하고 사용할 수 있도록 해준다.
    - Stream과 같이 Java8 에서 추가됨
    - 람다식에서 파라미터를 중복해서 사용하고 싶지 않을 때 사용, 람다식과 동일한 처리방법 + 이름으로 기존 메소드 참조 -> 가독성 증가
  - 사용 방법
    - [인스턴스]\::[메소드명(or new)]
    ```java
    List<String> testList = Arrays.asList("one","two","three");
    testList = testList.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());  
    ```
    람다 표현식의 경우 파라미터 a사용, 여기서 메소드 참조 :: 를 사용한다면 파라미터를 사용하지 않고도 가독성을 높일 수 있다. 
    ```java
    testList = testList.stream().map(String::toUpperCase).collect(Collectors.toList());  
    ```
    제너릭이 String인 List 객체의 stream의 map processing을 하기 때문에, parameter를 사용할 필요 없이 String 클래스의 toUpperCase method로 map processing을 명시한다. 
    <br>[벨로그 이중콜론](https://velog.io/@soyeon207/%EC%9D%B4%EC%A4%91-%EC%BD%9C%EB%A1%A0-%EC%97%B0%EC%82%B0%EC%9E%90Double-Colon-Operator)
    