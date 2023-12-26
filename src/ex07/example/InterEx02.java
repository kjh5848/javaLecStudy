package ex07.example;

// 라이브러리 판매자
interface EventListener { //리스너는 계속 실행되면서 이벤트를 감지하는 것(데몬)
    void action();
}

// 라이브러리 판매자
class MyApp {
    public void click(EventListener l) {
        l.action();
    }
}

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> System.out.println("회원가입이 실행됩니다."));
    }
}
