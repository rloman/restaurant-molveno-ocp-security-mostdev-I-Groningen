package it.molveno.streams.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {


        List<Integer> numberList = Arrays.asList(0, 1,1,2,3,5,8,13,21,34,55,89);

        // invallid order
        numberList.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .forEach(System.out::println);

        // valid order
        numberList.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n).collect(Collectors.toList()).stream().forEach(System.out::println);
    }
}
