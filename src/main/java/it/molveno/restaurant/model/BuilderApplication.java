package it.molveno.restaurant.model;

import it.molveno.restaurant.factory.Table;

public class BuilderApplication {

    public static void main(String[] args) {

        Table t = new Table.TableBuilder(3).numberOfSeats(4).build();

        System.out.println(t.getId());
        System.out.println(t.getNumberOfSeats());
    }
}
