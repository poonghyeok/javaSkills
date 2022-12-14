package lambda;

public class Lambda {

    //java는 람다식을 받아 매개변수에 데이터를 대입하고 중괄호를 실행시켜 처리한다.
    //java는 람다식을 익명 구현 객체로 변환한다. 익명 구현객체란 이름이 없는 인터페이스 구현 객체를 말한다.
    @FunctionalInterface //인터페이스가 함수형 인터페이스임을 보장하기 위해서는 @FunctionalInterface 어노테이션을 붙이면 된다. 선택사항이지만, 컴파일 과정에서 추상메소드가 하나인지 검사한다..! -> 정확한 함수형 인터페이스를 작성할 수 있게 도와준다.
    public interface Calculable{
        void calculate(int x, int y);
    }

    public void action(Calculable calculable){
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }

    public static void main(String[] args){

        new Lambda().action( (x,y) -> {
            int result = x + y;
            System.out.println(result);
            //람다식으로 abstract method() 구현
        });

    }

    //인터페이스의 익명 구현 객체를 람다식으로 표현하려면 인터페이스가 단 하나의 추상 메소드만 가져야 한다. 두개 이상의 추상메소드를 가지면 람다식으로 표현 불가능
    // 아 람다식으로 익명 구현 객체를 표현할 수 있다.
}
