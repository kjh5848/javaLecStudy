package ex13.generic.example01;

class Box<T> {
    T data;
}

public class GenericEx01 {
    public static void main(String[] args) {
        Box<String> box01 = new Box<>();
        Box<Integer> box02 = new Box<>();
        Box<Boolean> box03 = new Box<>();
        Box<Double> box04 = new Box<>();
        Box<Character> box05 = new Box<>();


        box01.data = "나야나";
        box02.data = 1;
        box03.data = true;
        box04.data = 1.1;
        box05.data = 'a';

        System.out.println(box01.data);
        System.out.println(box02.data);
        System.out.println(box03.data);
        System.out.println(box04.data);
        System.out.println(box05.data);

    }
}
