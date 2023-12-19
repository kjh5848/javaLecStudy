package ex04.test;


import java.util.Scanner;

public class ScopeEx01 {
    int n1 = 1;
    static int n2 = 2;

    static void m1() {
        int n1 = 10;
        System.out.println("m1: "+ n1); // 결과 10

    }
    int sum = 10;
    static int sum = 20;

    void m2() {
        System.out.println("m2: "+ sum); // 결과 1
    }

    //메인 시작전에 static에 n2변수와 n1메서드가 로드 되어 있음
    public static void main(String[] args) {
        System.out.println(1);
        m1();
        System.out.println(2);
        ScopeEx01 sc = new ScopeEx01();
        ScopeEx01 sc2 = new ScopeEx01();
        sc2.m2();

    }
}
