package ex03.Array;

import java.util.Scanner;

/**
 * 정답을 추측하여 보시오 :
 * 제시한 정수가 낮습니다.를 출력
 *
 * 정수의 범위 1~100
 * 최대 7번안에 맞출 수 있다.
 *
 * 정수의 범위는 1~1,000,000까지 확대하더라도
 * 20번이면 맞출 수 있다.
 *
 *
 */
public class Miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int computer = (int) (Math.random()*100);
        int y=0;
        int count = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("정답을 추측하여 보세요: ");
            int x = sc.nextInt();
            count++;
            if (x < computer) {
                    System.out.println("제시한 정수가 낮습니다." + x);
                } else if(x > computer){
                    System.out.println("제시한 정수가 높습니다." + x);
            } else if (x == computer) {
                System.out.println("축하합니다."+"시도한 횟수는: "+ count);
                break;
            }
        }
        System.out.println("또 오세요");


    }
}
