package ex13.collection;

import java.util.*;

public class CollectionEx01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("체리");
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println(set);

        Queue<String> q = new LinkedList<>();
        q.add("첫번째");
        q.add("두번째");
        q.add("세번째");
        System.out.println(q);
    }
}
