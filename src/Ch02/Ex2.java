package Ch02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        x = s.nextInt();
        boolean a = true, b = false, c = true;
        a = (b || c) && (a || false);

    }
}
