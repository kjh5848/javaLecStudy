package ex06.example6;

class Protoss2{

}

class Zealot2 extends Protoss2 {
    public void attack() {
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon2 extends Protoss2 {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
            }
}


public class CastingEx01Abstract {

    public static void start(Protoss2 p) {
        if (p instanceof Zealot2) {
            Zealot2 u = (Zealot2) p; // 부모를 자식에게 대입할 수 없다. 반대는 된다.
            u.attack();
        }

        if (p instanceof Dragoon2) {
            Dragoon2 d = (Dragoon2) p;
            d.attack();
        }
    }
    public static void main(String[] args) {
        start(new Zealot2());
        start(new Dragoon2());
    }

}
