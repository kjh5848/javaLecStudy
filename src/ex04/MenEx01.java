package ex04;

class Person1{
    static int age = 20; // static
    static char gender = '여';
}
public class MenEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.gender);
        System.out.println(Person1.age);
    }
}
