package ex01;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 21억까지(4byte)
        double d1 = 1.5; // 21억까지(8byte)
        long big1 = 20000000000L; // 경까지(8byte) 21억이상은 L을 적어야 한다.
        // L은 관례이니 그냥 적자.
        boolean b1 = true; // true(1),false(0)
        char c1 = 'A'; // 한 문자를 저장한다.

        System.out.println(n1);
        System.out.println(b1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(c1);
    }
}
