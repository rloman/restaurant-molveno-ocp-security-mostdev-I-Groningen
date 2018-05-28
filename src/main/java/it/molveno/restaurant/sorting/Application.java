package it.molveno.restaurant.sorting;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>(Arrays.asList(8, 34, 5, 6, 13, 899, 12));

        System.out.println(numberList);

        Collections.sort(numberList);

        System.out.println(numberList);

        List<Bird> birds = new ArrayList<>(Arrays.asList(new Bird("Vink"), new Bird("Specht"), new Bird(), new Bird("Koekoek")));

        Bird v = new Bird("Vink");
        v.setAge(3);
        birds.add(v);

        System.out.println("Unsorted");
        birds.forEach(System.out::println);


        Collections.sort(birds, new BirdLastCharacterComparator());


        birds.sort(new BirdLastCharacterComparator());


        System.out.println("Sorted");

        birds.forEach(System.out::println);


        birds.sort(Comparator.comparingInt(Bird::getAge));

        System.out.println(birds);

        birds.sort(Comparator.comparing(Bird::getName));

        System.out.println(birds);




    }
}
