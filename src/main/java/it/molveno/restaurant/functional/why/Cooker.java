package it.molveno.restaurant.functional.why;

import java.util.function.Supplier;

public class Cooker {


    public void bake(Supplier<Food> foodSupplier) {
        System.out.println("I am baking ... "+foodSupplier.get().getName());
    }
}
