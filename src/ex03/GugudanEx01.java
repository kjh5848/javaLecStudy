package ex03;

import java.util.Scanner;

/**
 * 2~9단까지 출력되는 프로그램을 만드시오
 * 스캐너를 이용하여 입력받은 단만 출력하시오
 */
public class GugudanEx01 {
    public static void main(String[] args) {
        int y = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("몇단: ");
            int x = sc.nextInt();
            for (int j = 1; j <= 9; j++) {
                int x1 = x * j;
                //y += j; // y = y + j
                System.out.println(x + "단은 " + x1 + "입니다.");
            }
        }
    }
}
