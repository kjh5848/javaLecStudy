package Ch02;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        // 반지름을 입력 받아서 부피를 계산하는 프로그램
        Scanner sc = new Scanner(System.in);
        System.out.print("구의 반지름: ");
        double p = sc.nextDouble();
        double p1 = 3.14;

        double p2 = 4.0 / 3.0 * p1 * (p * p * p);
        System.out.print("구의 부피: " + p2);

    }

}