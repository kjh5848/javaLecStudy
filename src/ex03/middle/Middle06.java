package ex03.middle;

import java.util.Scanner;

public class Middle06 {
    public static void main(String[] args) {
        int[][] array = new int[4][];

        array[0] = new int[] {12};
        array[1] = new int[] {32,12,38};
        array[2] = new int[] {14,6};
        array[3] = new int[] {3};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+",");

            }
            System.out.println("");
        }



    }
}
