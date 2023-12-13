package Ch02;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int x, num;
        int y = 10;


        Scanner sc = new Scanner(System.in);
        System.out.println("오렌지 개수를 입력하시오: ");
        x = sc.nextInt();


        System.out.println(x % y);
    }
}


