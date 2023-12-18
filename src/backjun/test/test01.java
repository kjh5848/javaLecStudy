package backjun.test;

import java.util.*;

public class test01 {
    public static void main(String args[]){
        Scanner aa = new Scanner(System.in);
        int A, B;
        A = aa.nextInt();
        B = aa.nextInt();

        //472
        //385
        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
        //2360
        //3776
        //1416
        //181720




    }
}

