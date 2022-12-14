package lambda.sec03;

public class LambdaExample {

    public static void main(String[] args){
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println();
        });
    }
}
