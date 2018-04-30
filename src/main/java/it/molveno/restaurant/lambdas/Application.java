package it.molveno.restaurant.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

        numberList.stream().filter(element -> element % 2 == 0).forEach(element -> {
            System.out.println(element);
        });


        numberList.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(n -> {
            System.out.println(n);
        });


        //
        // syntaxic sugar
        List<Integer> evenNumbers = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());


        System.out.println(evenNumbers);


        //  nog niet voor iedereen ...
        evenNumbers.stream().map(n -> n * n).forEach(System.out::println);


    }


}
