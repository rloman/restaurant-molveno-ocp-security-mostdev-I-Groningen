package it.molveno.restaurant.functional.interfaces;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {


        // regular class
        {
            MyRunnable runner = new MyRunnableImpl();

            runner.run();

        }

        {
            // anonymous inner class
            MyRunnable runner = new MyRunnable() {
                @Override
                public void run() {
                    System.out.println("Anonymous inner class running");
                }
            };

            runner.run();
        }

        {
            MyRunnable r = () -> {
                System.out.println("Groningen en Twente zijn mooi man!");
            };

            r.run();

            r = () -> {
                System.out.println("Een andere lambda expressie over Drenthe en zo ...");
            };

            r.run();
        }


        List<Integer> numberList = Arrays.asList(0,1,1,2);

        numberList.stream().filter(n -> n %2==0);


       // using lambdas
        {
            MyRunnable runner = () -> System.out.println("Running using a super simple lamda expression");
        }

        // another more code containing lambda
        {
            MyRunnable runner = () -> {

                long daysLivingRaymie = ChronoUnit.DAYS.between(LocalDate.of(1968, 8, 9), LocalDate.now());

                System.out.println("Running using a more complexer lambda expression");
                System.out.printf("Raymie is now living '%d' days%n", daysLivingRaymie);
            };

            runner.run();
        }

        // another more deeper example

        Function<LocalDate, Long> daysCalculator = (localDate) -> {
            return ChronoUnit.DAYS.between(localDate, LocalDate.now());
        };

        long groupDays = daysCalculator.apply(LocalDate.of(2017, 10, 2));

        System.out.printf("We as a group know each oter now for '%02d' days%n", groupDays);
    }
}
