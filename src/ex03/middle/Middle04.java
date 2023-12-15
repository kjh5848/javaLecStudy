package ex03.middle;

import java.util.Scanner;

/**
 * double형의 데이터를 저장하는 3*4 크기의 2차원 배열을 생성
 */
public class Middle04 {
    public static void main(String[] args) {


//        double[][] array = {
//                {0.1,0.2,0.3},
//                {0.1,0.2,0.3},
//                {0.1,0.2,0.3}
//        };;

        double[][] array = new double[3][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print("("+array[i][j]+")"+",");

            }
            System.out.println(" ");
        }

    }
}
