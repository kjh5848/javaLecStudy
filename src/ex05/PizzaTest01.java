package ex05;

public class PizzaTest01 {
    public static void main(String[] args) {
        Pizza01 p1 = new Pizza01("슈퍼 수프림");
        Pizza01 p2 = new Pizza01("치즈");
        Pizza01 p3 = new Pizza01("페퍼로니");

        int n = Pizza01.count;
        System.out.println("지금까지 피자가 판매된 개수는: "+n);
    }
}
