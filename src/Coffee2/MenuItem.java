package Coffee2;

import java.util.List;

public class MenuItem {
    public String name;
    public int price;

    public MenuItem(MenuItem menuItem, String name, int price) {

        this.name = name;
        this.price = price;
    }

    public int cost() {
        return price;
    }


    public String getName() {
        return this.name;
    }

}