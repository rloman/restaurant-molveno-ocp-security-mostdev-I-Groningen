package it.molveno.restaurant.functionalwhy;

import java.util.function.Supplier;

public class Application {


    public static void main(String[] args) {
            foo(String::new);
    }

    public static void foo(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }



}


