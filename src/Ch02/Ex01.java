package Ch02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int x, x2, num;
        int y = 10;


        Scanner sc = new Scanner(System.in);
        System.out.print("오렌지 개수를 입력하시오: ");
        x = sc.nextInt();

        x2 = x / 10;
        num = x % y;
        System.out.println(x2 + "박스가 필요하고 " + num + "개가 남습니다.");
    }
}


