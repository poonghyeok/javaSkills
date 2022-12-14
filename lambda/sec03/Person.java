package lambda.sec03;

public class Person {
    public void action1(Workable workable){
        workable.work("이풍혁", "프로그래밍");
    }

    public void action2(Speakable speakable){
        speakable.speak("안녕하세요");
    }
}
