package it.molveno.restaurant.maps;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        /*
        Set<Integer> set = new TreeSet<>();

        set.add(45);
        set.add(3);

//        set.addAll(Arrays.asList("b", "c", "a"));

        for(int element: set) {
            System.out.println(element);
        }

        set.forEach(System.out::println);

        System.exit(0);

        Map<String, Jas> garderobe = new HashMap<>();

        garderobe.put("a", new Jas());


        System.out.println(garderobe.get("a"));

        // now newer stuff
        */

        NavigableSet<String> treintijden = new TreeSet<>();

        treintijden.add("15:45");
        treintijden.add("10:15");
        treintijden.add("12:45");





        String missedTrain = treintijden.lower("10:30");
        System.out.println(missedTrain);

        String nextTrain = treintijden.higher("10:30");
        System.out.println(nextTrain);

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();


        Queue<String> wachtrij = new LinkedList<>();
        wachtrij.offer("Tom");
        wachtrij.offer("Natalie");
        wachtrij.offer("Eloy");

        String first = wachtrij.poll();

        System.out.println(first);

        first = wachtrij.poll();

        System.out.println(first);
        first = wachtrij.poll();

        System.out.println(first);

        first = wachtrij.poll();

        System.out.println(first);

        wachtrij.peek();

        wachtrij.element();


        Stack<String> stapel = new Stack<>();

    }


}


class Jas {

}