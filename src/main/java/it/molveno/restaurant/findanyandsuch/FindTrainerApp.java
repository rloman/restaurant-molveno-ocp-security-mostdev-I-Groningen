package it.molveno.restaurant.findanyandsuch;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTrainerApp {


    // programming by contract
    private static int addPositive(int n, int m) {

        assert (n > 0 && m > 0);

        int result = n + m;

        assert (result > n && result > m);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

        //findAny
        assert (numberList.stream().filter(n -> n % 3 == 0).findAny().isPresent());

        // or shorter =>
        // anyMatch
        assert (numberList.stream().anyMatch(n -> n % 3 == 0));

        assert (3 == (numberList.stream().filter(n -> n % 3 == 0).findAny().get()));

        //findFirst
        assert (1 == numberList.stream().findFirst().get());
        assert (!numberList.stream().allMatch(n -> n % 4 == 0));
        assert (numberList.stream().noneMatch(n -> n % 88 == 0));

        //peek1
        numberList.stream().filter(n -> n % 2 == 0).peek(n -> {
            System.out.println("n is now:" + n);
        }).map(n -> n * n).forEach(System.out::println);


        System.out.println("Voor peek2");
        //peek2
        numberList.stream().filter(n -> n % 2 == 0).filter(m -> m > 2).peek(System.out::println).forEach(System.out::println);
        System.out.println("Na peek 2");


        assert (7 == addPositive(3, 4));


        try {
            assert (false);
            System.err.println("Fout in de assertions instellingen");
        } catch (AssertionError ae) {
            // OK
        }

        // reduce
        numberList = Arrays.asList(1, 2, 4);
        int sumAnd1 = numberList.stream().reduce((n, m) -> {

            System.out.println("test 1:"+n);
            System.out.println("test 2:"+m);

            return n + m;
        }).orElse(-1);

        assert (7 == sumAnd1);

        sumAnd1 = numberList.stream().reduce((n, m) -> n + m + 1).orElse(-1);

        System.out.println(sumAnd1);

        int max = numberList.stream().reduce(0, (n, m) -> Integer.max(n, m));
        assert(max == 4);

//        assert (8 == sumAnd1);

//        numberList.stream().collect(Integer::new, (n,m) -> return n+m, m);
        //collect
        List<Integer> integers = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());


        integers=numberList.stream().filter(n -> n%3 == 0).collect(Collectors.toList());



    }
}
