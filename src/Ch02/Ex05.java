package Ch02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        // 시간간격을 입력(단위: 초):
        // 번개가 발생한 곳까지의 거리:
        Scanner sc = new Scanner(System.in);

        System.out.print("시간간격을 입력(단위: 초): ");
        double s = sc.nextDouble();

        // 거리=번개와 천둥 사이의 시간 지연×소리의 속도
        double m = s * 340;
        System.out.println("번개가 발생한 곳까지의 거리:" + m);
    }
}
