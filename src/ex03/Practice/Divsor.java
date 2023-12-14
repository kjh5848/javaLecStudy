package ex03.Practice;

import java.util.Scanner;

public class Divsor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수를 입력하시오: ");
        int n = sc.nextInt();

        System.out.println(n + "의 약수는 다음과 같습니다.");
        for (int i = 0; i <= n; i++) {
            if (n % 1 == 0) {
                System.out.println(" " + i);
            }
        }
    }
}
