package it.molveno.restaurant.factory;

public final class DrinkFactory {

    public static Drink getCola() {

        Drink d = new Drink();
        d.setDescription("Colaaaa");

        return d;

    }

    public static Drink getBeer() {
        Drink d = new Drink();
        d.setDescription("Beer");

        return d;
    }

    private DrinkFactory() {}
}
