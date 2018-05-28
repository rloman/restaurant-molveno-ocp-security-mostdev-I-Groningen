package it.molveno.restaurant.generics.genericcollections;

import it.molveno.restaurant.generics.genericcollections.model.Animal;
import it.molveno.restaurant.generics.genericcollections.model.Cat;
import it.molveno.restaurant.generics.genericcollections.model.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Dog(), new Cat(), new Dog());

        AnimalDoctor.cure(animals);

        List<Dog> dogs = new ArrayList<>();

        AnimalDoctor.cure(Arrays.asList(new Object())); // compile error als AnimalDoctor.cure(List<Animal>) wordt gebruikt



    }
}
