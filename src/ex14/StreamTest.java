package ex14;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //축소연산(reduce())
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        System.out.println();



        // 종말단계
        int n1 = IntStream.of(20, 10, 30, 90, 60).sum();
        Long n2 = IntStream.of(20, 10, 30, 90, 60).count();
        OptionalInt n3 = IntStream.of(20, 10, 30, 90, 60).max();
        OptionalInt n4 = IntStream.of(20, 10, 30, 90, 60).min();
        OptionalDouble n5 = IntStream.of(20, 10, 30, 90, 60).average();
        List<Integer> n6 = IntStream.of(20, 10, 30, 90, 60)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        List<Integer> n7 = IntStream.of(20, 10, 30, 90, 60)
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);


        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println();

        // forEach()연산
        List<String> list2 = Arrays.asList("Kim", "Lee", "Park");
        Stream<String> s1 = list2.stream();
        s1.forEach(System.out::println);



        String s2 = list2.stream().collect(Collectors.joining(", "));
        System.out.println(s2);
    }
}
