package ex03.Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1l;
        int n;

        System.out.println("정수를 입력하시오: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }

        System.out.print(n + "!은" + fact + "입니다.\n");
    }
}
