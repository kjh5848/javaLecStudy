public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("나눗셈 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
