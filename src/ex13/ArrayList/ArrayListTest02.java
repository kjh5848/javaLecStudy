package ex13.ArrayList;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("애플");
        list.add("애플1");
        list.add("애플2");
        list.add("애플3");
        list.add("애플4");

        int index = list.indexOf("애플2");
        System.out.println("애플2의 위치: " + index);

    }
}
