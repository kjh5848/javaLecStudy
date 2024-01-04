package Coffee2;

//손님

import java.awt.*;

public class Customer{

    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
        System.out.println("커피생산");
    }
}
