package it.molveno.restaurant.sorting;

import java.util.Comparator;

public class BirdLastCharacterComparator implements Comparator<Bird> {


    @Override
    public int compare(Bird o1, Bird o2) {



        String lastOfFirst = o1.getName().substring(o1.getName().length() - 1);
        String lastOfSecond = o2.getName().substring(o2.getName().length() - 1);

        return lastOfFirst.compareTo(lastOfSecond);
    }
}
