package it.molveno.restaurant.functional.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

        numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // beetje gek maar wel heeeel lekker ...

        Supplier<MotorBike> motorBikeSupplier = MotorBike::new;

        motorBikeCreator(motorBikeSupplier);
    }


    public static void motorBikeCreator(Supplier<MotorBike> supplier) {

        MotorBike bike = supplier.get();

        System.out.println(bike.maxSpeed);

    }
}

class MotorBike {

    int maxSpeed = 320;

}
