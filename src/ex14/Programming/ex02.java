package ex14.Programming;

import java.util.Arrays;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(list);

        List<String> newList = list.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println(newList);
    }
}
