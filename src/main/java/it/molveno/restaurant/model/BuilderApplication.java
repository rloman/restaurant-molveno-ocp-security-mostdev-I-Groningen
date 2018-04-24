package it.molveno.restaurant.model;

import it.molveno.restaurant.factory.Table;

public class BuilderApplication {

    public static void main(String[] args) {
        Table t = Table.builder().id(3).numberOfSeats(3).build();
    }
}
