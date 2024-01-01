package ex08.example;

import java.util.Arrays;

public class StringEx01 {

    public static String encoding(String data) {

        int countA = 0, countB = 0, countC = 0, countD = 0;
        String str;
        for (int i = 0; i < data.length(); i++) {
            str = data.substring(i,i+1);
            if (str.equals("A")) {
                countA++;
            }
            if (str.equals("B")) {
                countB++;
            }
            if (str.equals("C")) {
                countC++;
            }
            if (str.equals("D")) {
                countD++;
            }
        }

        System.out.println("A" + countA + "B" + countB + "C" + countC + "D" + countD);
        return "";
    }

    public static String decoding(String encodingData) {
        // String data = "A2B3C4D5";
        int countA = 3, countB = 2, countC = 1, countD = 4;
        String str = "";

        for (int i = 0; i < countA; i++) {
            str =str + "A";
        }
        for (int i = 0; i < countB; i++) {
            str =str + "B";
        }
        for (int i = 0; i < countC; i++) {
            str =str + "C";
        }
        for (int i = 0; i < countD; i++) {
            str =str + "D";
        }

        System.out.println(str);

        return "";
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte


        // String data = "A2B3C4D5";
        encoding(data);


        // 디코딩 AABBBCCCCDDDDD
        decoding(data);

    }
}