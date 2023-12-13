package Ch02;

import java.util.Scanner;

/**
 * 물체의 무게를 입력하시오(킬ㄹ그램):
 * 물체의 속도를 입력하시오(미터/초):
 * 물체는 x(줄)의 에너지를 가지고 있다.
 */
public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("물체의 무게를 입력하시오(킬로그램): ");
        double n1 = sc.nextDouble();

        System.out.print("물체의 속도를 입력하시오(미터/초): ");
        double n2 = sc.nextDouble();

        double n3 = 05 * n1 * n2;
        System.out.println("물체는 " + n3 + "(줄)의 에너지를 가지고 있다.");
    }
}
