package ex14.Programming;


import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class ex03{
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.1, 1.2, 1.3, 1.4);

        OptionalDouble n1 = DoubleStream.of(1.1, 1.2, 1.3, 1.4).max();
        System.out.println(n1);
        OptionalDouble n2 = DoubleStream.of(1.1, 1.2, 1.3, 1.4).min();
        System.out.println(n2);

        OptionalDouble n3 = DoubleStream.of(1.1, 1.2, 1.3, 1.4).average();
        System.out.println(n3);
    }


}
