package ex13.test;

class Box<T> {
    private T t;


    public void add(T t) {
        this.t = t;
    }


    public T getT() {
        return t;
    }


}

public class GenericEx02 {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(10);
        stringBox.add(("안녕하세요"));

        //오토박싱은 묵시적으로 new Integer을 생략해준다.
        //integerBox.add(new Integer(10));
        //stringBox.add(new String("안녕하세요"));

        System.out.println("정수의 값: " + integerBox.getT());
        System.out.println("문자열의 값: " + stringBox.getT());
    }

}
