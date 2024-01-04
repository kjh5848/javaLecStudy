package ex13.set;

import java.util.HashMap;
import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {

        HashSet<String> list = new HashSet<String>();

        list.add("밀크");
        list.add("브래드");
        list.add("버터");
        list.add("치즈");
        list.add("햄");
        list.add("햄");

        System.out.println(list);

        if (list.contains("햄")) {
            System.out.println("햄도 포함되어 있음");

        }
    }


}
