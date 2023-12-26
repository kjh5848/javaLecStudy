package ex06.example6;

import ex06.example5.Dark;

class Protoss1{
    public  void attack() {}
}
class Zealot1 extends Protoss1 {
    public void attack() {
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon1 extends Protoss1 {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
            }
}
public class CastingEx01Override {
    public static void main(String[] args) {
        Protoss1 z = new Zealot1();
        Protoss1 z1 = new Dragoon1();

        z.attack();
        z1.attack();
    }
}
