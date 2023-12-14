package ex03.middle;

import java.util.Scanner;

public class Middle05 {
    public static void main(String[] args) {
        // 1부터 100사이의 정수에서 6의 배수의 합을 계산하는 프로그램
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, sum = 0;

        for (int i = 1; i < 100; i++) {
            sum = sum + (i * 6);
        }

        System.out.println("6의 배수의 합은: " + sum);
    }
}
