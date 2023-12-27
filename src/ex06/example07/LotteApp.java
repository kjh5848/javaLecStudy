package ex06.example07;

public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본버거",1000);
        ShirmpBuger b2 = new ShirmpBuger("새우버거", 2000, "새우");
        Coke c1 = new Coke("콜라", 1000);
        BugerSet set1 = new BugerSet(new Burger("기본버거",1000),new Coke("콜라",1000));

//        System.out.println(set1.getBurger().getPrice());
//        System.out.println(set1.getCoke().getPrice());

        System.out.println("총 가격은: "+ set1.getTotalPrice());
    }
}