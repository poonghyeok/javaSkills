package lambda.sec01;

public class LambdaExample {

    public static void main(String[] args){
        action(10, 15, (x,y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });

        action(20, 30, (x,y) -> {
            int result = y - x;
            System.out.println("result : " + result);
        });

    }

    public static void action(int x, int y, Calculable calculable){
        calculable.calculate(x,y);
    }
}
