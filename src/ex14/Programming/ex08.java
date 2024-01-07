package ex14.Programming;

import java.util.Arrays;
import java.util.List;

public class ex08 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kim", "Park", "He", "I", "Lee", "Hello", "World");

        List<String> newList = list.stream()
                .filter(s -> s.length()>=3)
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println(" "+ newList);
    }
}
