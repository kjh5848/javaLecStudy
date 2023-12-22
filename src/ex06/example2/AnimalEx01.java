package ex06.example2;

class Animal {

    void speak() {
        System.out.println("멍멍");
    }

    void run() {
        System.out.println("달린다");

    }
}

class cat extends Animal{
    //동적 바인딩
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        cat c1 = new cat(); // 타입은 Animal or cat을 들고 있다.
        c1.speak();
        c1.run();

    }
}
