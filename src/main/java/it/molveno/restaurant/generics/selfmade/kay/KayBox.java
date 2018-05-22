package it.molveno.restaurant.generics.selfmade.kay;

import it.molveno.restaurant.generics.selfmade.Box;

import java.util.ArrayList;
import java.util.List;

public class KayBox<T extends Number> extends Box<T> {

    int number = 0;

    public List<T> foo() {
        List<T> numberList = new ArrayList<>();

        Integer i = this.number;


        numberList.add((T) i);

        return numberList;
    }
}
