package Ch02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 부가세와 잔돈을 출력하는 프로그램

        Scanner sc = new Scanner(System.in);

        System.out.println("받은 돈: ");
        int m = sc.nextInt();


        System.out.println("상품 가격: ");
        double p = sc.nextInt();

        p = p * 1.1;
        System.out.println("부가세포함 상품가격: " + p);
        double minus = m - p;
        System.out.println("잔돈: " + minus);
    }
}
