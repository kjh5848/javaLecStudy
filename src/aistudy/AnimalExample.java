package aistudy;

class Animal {


    public Animal() {

    }
}

class Dog extends Animal {

    public Dog() {
        System.out.println("멍멍");
    }
}

class Bird extends Animal{
    public Bird( ) {
        System.out.println("까악");
    }
}

class Cat extends Animal{
    public Cat( ) {
        System.out.println("야옹");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal b = new Bird();
        Animal c = new Cat();

    }




}


