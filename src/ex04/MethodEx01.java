package ex04;

public class MethodEx01 {

    //문법 1
    static void m1() {
        System.out.println("m1");
    }

    // 문법 2
    static String m2() {
        System.out.println("m2");
        return "m2"; // 메서드 종료
    }

    public static void main(String[] args) {
        //MethodEx01.m1();
        // 같은 클래스 안에 있으면 클래스 명을 생략할 수 있다.
        m1();
        String result  = m2();
        System.out.println("result: " + result);
    }
}
