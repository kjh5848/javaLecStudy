package Coffee;

public class Customer {
    // Barista barista = new Barista(); 이렇게 생산하면 안된다.
    // 고객이 바리스타의 엄마가 아니니깐
    // 의존적인 관계는 생성자를 통해 주입받는다. has-a 관계

    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public void order(String menuName) {
        // 주문의 책임
        // 바리스타와 협력해야한다.

        Coffee coffee = barista.makeCoffee();
        System.out.println(coffee.name + "를 받았습니다.");
    }
}
