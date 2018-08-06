package it.molveno.restaurant.summary.peeking;

import java.util.Arrays;
import java.util.List;

public class PeekTrainer {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0,1,1,2,3,5);

        numberList.stream().filter(n -> n > 2).peek(n -> {
            System.out.println("Intermediate result is: "+n);
        }).forEach(System.out::println);
    }
}
