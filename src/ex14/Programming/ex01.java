package ex14.Programming;

import java.util.Arrays;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list);

        List<Double> newList = list.stream()
                .map(Math::sqrt)
                .toList();
        System.out.println(newList);
    }
}
