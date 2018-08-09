package it.molveno.restaurant.generics.selfmade;

import java.util.LinkedList;
import java.util.List;

public class Box<T> {

    private List<T> items = new LinkedList<>();

    public void add(T t) {
        this.items.add(t);
    }

    public void pp() {
        items.forEach(System.out::println);
    }

}
