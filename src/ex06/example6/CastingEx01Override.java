package ex06.example6;

class Protoss1{
    public static void gameStart(Protoss u1) {
        u1.attack;

    }

}

class Zealot1 extends Protoss {
    public void attack() {
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon1 extends Protoss {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
            }
}


public class CastingEx01Override {

    public static void start(Protoss p) {
        if (p instanceof Zealot) {
            Zealot u = (Zealot) p; // 부모를 자식에게 대입할 수 없다. 반대는 된다.
            u.attack();
        }

        if (p instanceof Dragoon) {
            Dragoon d = (Dragoon) p;
            d.attack();
        }
    }
    public static void main(String[] args) {
        start(new Zealot());
        start(new Dragoon());
    }

}
