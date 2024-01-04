package ex13.vector;


import java.util.Arrays;
import java.util.Vector;

class Monster {
    String name;
    double hp;

    public Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return "{" + name + "," + hp + "}";
    }
}

public class VectorExample02 {
    public static void main(String[] args) {
        Vector<Monster> list = new Vector<>();


        list.add(new Monster("Mon1", 100));
        list.add(new Monster("Mon2", 100));
        list.add(new Monster("Mon3", 100));


        System.out.println("백터의 크기: " + list.size());
        System.out.println(list);



    }
}
