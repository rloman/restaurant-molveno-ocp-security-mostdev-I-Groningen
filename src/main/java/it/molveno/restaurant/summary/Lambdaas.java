package it.molveno.restaurant.summary;

import java.util.Arrays;
import java.util.List;

public class Lambdaas {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

        numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
