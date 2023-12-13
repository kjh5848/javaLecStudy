package Ch02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // 정수를 2진수로 변환하여 출력하는 프로그램
        // %나머지 연산자 사용

        Scanner sc = new Scanner(System.in);
        System.err.print("정수: ");
        int x = sc.nextInt();

        int x1 = x / 2;
        int x2 = x1 / 2;
        int x3 = x2 / 2;
        int x4 = x3 / 2;

        System.out.println(x + ": " + x1 % 2 + x2 % 2 + x3 % 2 + x4 % 2);

    }
}