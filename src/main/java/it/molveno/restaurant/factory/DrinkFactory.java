package it.molveno.restaurant.factory;

public final class DrinkFactory {

    public static Drink getCola() {

        Drink d = new Cola();
        d.setDescription("Colaaaa");

        return d;

    }

    public static Drink getBeer() {
        Drink d = new Beer();
        d.setDescription("Car");

        return d;
    }

    private DrinkFactory() {}
}
