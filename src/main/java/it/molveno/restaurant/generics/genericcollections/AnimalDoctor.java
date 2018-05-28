package it.molveno.restaurant.generics.genericcollections;

import it.molveno.restaurant.generics.genericcollections.model.Animal;
import it.molveno.restaurant.generics.genericcollections.model.Dog;

import java.util.List;

public final class AnimalDoctor {



    public static void cure(List<? super Animal> sickAnimals) { // extends Testen


        sickAnimals.forEach(System.out::println);

        sickAnimals.add(new Dog());

    }


    private AnimalDoctor() {

    }
}
