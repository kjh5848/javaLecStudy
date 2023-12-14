package ex03.middle;

import java.util.Scanner;

public class Middle03 {
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
