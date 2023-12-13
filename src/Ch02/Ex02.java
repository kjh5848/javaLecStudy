package Ch02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // 마일을 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("마일을 입력 : ");
        double m = sc.nextDouble();

        double m2 = m * 1.60934;
        System.out.print(m + "마일은 " + m2 + "킬로미터 입니다.");


    }
}
