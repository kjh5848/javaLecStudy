package ex13.LinkedList;

import java.util.LinkedList;

public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("밀크");
        list.add("브레드");
        list.add("버터");
        list.add(1, "애플");
        list.add(2, "포도");
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+ " ");
        }
    }
}
