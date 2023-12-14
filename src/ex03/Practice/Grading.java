package ex03.Practice;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오: ");
        grade = sc.nextInt();
        if (grade >= 90) {
            System.out.println("A학점");
        } else if (grade >= 80) {
            System.out.println("B학점");

        } else if (grade >= 70) {
            System.out.println("C학점");

        } else if (grade >= 60) {
            System.out.println("D학점");

        } else
            System.out.println("F학점");

    }
}
