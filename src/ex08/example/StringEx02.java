package ex08.example;

import java.util.Arrays;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        // username값과, password값 찾아보기


        String[] p1 = url.split("\\?");
        for (String P : p1) {
            System.out.println(P);
            String[] p2 = P.split("\\&");
            for (String P2 : p2) {
                System.out.println(P2);
                String[] p3 = P2.split("=");
                for (int i = 0; i < p3.length; i++) {
                    if (p3[i].equals("username")) {
                        System.out.println("username: " + p3[i+1]);
                    } else if (p3[i].equals("password")) {
                        System.out.println("password: " + p3[i+1]);
                    }
                }
            }
        }


        String username;




//            String[] p2 = url.split("\\&");
//            for (String P1 : p2) {
//                System.out.println(P);
//            }
//
//            String[] p3 = url.split("\\=");
//            for (String P1 : p3) {
//                System.out.println(P);
//            }






    }
}