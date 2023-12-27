package ex08.Test;

public class StringTestEx01 {
    public static void main(String[] args) {
        String s1 = "Java";

        // 문자열의 길이를 반환
        int size = s1.length();
        System.out.println(size);

        // 번지수를 반환
        char c = s1.charAt(0);
        System.out.println(c);

        // 문자열을 단어로 분리할 때
        String[] tokens = "I am s boy.".split("");
        for (String token : tokens) {
            System.out.println(token);
        }


    }
}
