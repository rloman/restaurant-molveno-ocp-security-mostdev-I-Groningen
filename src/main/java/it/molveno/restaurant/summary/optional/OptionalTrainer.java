package it.molveno.restaurant.summary.optional;

import java.util.Optional;

public class OptionalTrainer {

    public static void main(String[] args) {
        Optional<String> o = Optional.of("Jansen");

        Optional.empty();

        if(o.isPresent()) {
            System.out.println(o.get());
        }
        else {
            System.out.println("o bevat geen value en ik had jullie nog" +
                    "zo gewaarschuwd, o o o ... ");
        }
    }
}
