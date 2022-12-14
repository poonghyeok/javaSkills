package lambda.sec02;

public class Button {

    @FunctionalInterface
    public static interface ClickListener{
        void onClick();
    }
    //interface 파일을 별도로 만들지 않고 static interface로 함수형 인터페이스를 선언하고 필드로 생성한 뒤 주입 방식 사용

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}
