package ex07.example;

interface Remocon {
    void on();
    void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("Lg 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("Lg 리모컨 off");
    }
}

/**ㅈ
 * 작성자 : 홍길동
 * 날짜 : 2023.12.26
 * 구현체 : SamsungRemocom, LgRemocon
 */
class CommonRemocon {
    private Remocon r; // 인터페이스 or 추상클래스

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on() {
         r.on();

    }
    public void off() {
        r.off();

    }
}

public class InterEx01 {

    public static void main(String[] args) {
        //CommonRemocon samsung = new CommonRemocon(new Remocon);
        // new Remocom가 오류가 뜬다면 오브젝트가 아니라고 생각해야한다. 이건 상식!!

        CommonRemocon samsung = new CommonRemocon(new SamsungRemocon());

        samsung.on();

    }
}
