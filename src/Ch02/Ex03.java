package Ch02;

public class Ex03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("두 수의 합: " + (x + y));
        System.out.println("두 수의 차: " + (x - y));
        System.out.println("두 수의 곱: " + (y * x));
        System.out.println("두 수의 평균: " + (y * x) / 2);
        int max = (x > y) ? x : y;
        System.out.println("큰수: " + max);
        int min = (x > y) ? y : x;
        System.out.println("작은 수: " + min);


    }
}
