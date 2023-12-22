package ex06.example;

class Animal {

    void speak() {
        System.out.println("멍멍");
    }

    void run() {
        System.out.println("달린다");

    }
}

class cat extends Animal{
    void speak() {
        System.out.println("야옹");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.speak();
        c1.run();

    }
}
