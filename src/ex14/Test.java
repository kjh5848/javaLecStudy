package ex14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kim","Kang", "Park", "Lee", "Choi", "Chee");
        // 1번 방식
        List<String> sublist = list.stream()
                .filter(s -> s.startsWith("C"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sublist);


        // 2번 방식
        List<String> newList = list.stream().filter(s -> s.startsWith("C")).sorted().toList();
        System.out.println(newList);


    }

}
