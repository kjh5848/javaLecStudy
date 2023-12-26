package ex06;

class Animal01 {
    void speak() {
        System.out.println("사운드");
    }
}

class Dog01 extends Animal01 {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat01 extends Animal01 {
    void speak() {
        System.out.println("야옹");
    }
}
public class DynamicCallTest {
    public static void main(String[] args) {
        Animal01 a = new Dog01();
        Animal01 b = new Cat01();

        a.speak();
        b.speak();

    }
}

class A {
    public A(char C) {

    }
}
//class B extends A {
//    public B(char C) {
//
//    }
//}