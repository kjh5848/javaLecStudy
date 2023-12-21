package ex05;

class President {

    static President instanse = new President();

   private President() {

   }

}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instanse;
        System.out.println(p1.hashCode());


        President p2 = President.instanse;
        System.out.println(p2.hashCode()); // 객체에 단 한번만 올릴 수 있는 패턴


    }
}
