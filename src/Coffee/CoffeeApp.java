package Coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Barista barista = new Barista();
        Customer customer = new Customer(barista);

        customer.order("ㅁㄴㅇㄹ");
        barista.makeCoffee();
    }
}
