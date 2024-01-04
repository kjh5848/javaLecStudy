package Coffee2;

public class Coffee{
    public String name;
    public int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.cost();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


}