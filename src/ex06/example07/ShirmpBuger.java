package ex06.example07;

public class ShirmpBuger extends Burger {
    private String material;

    public ShirmpBuger(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
}
