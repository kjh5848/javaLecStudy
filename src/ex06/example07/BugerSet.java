package ex06.example07;

public class BugerSet { // has(포함) 관계(Buger,Coke)
    private Burger burger;
    private Coke coke;

    public BugerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice() {
      return burger.getPrice()+ coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
