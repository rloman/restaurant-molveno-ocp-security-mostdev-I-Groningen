package it.molveno.restaurant.enums;

public class Application {

    public static void main(String[] args) {
        Animal a = Animal.COW;


        System.out.println(a.getWeight());

        System.out.println(a.getNurcheringParent());

        a = Animal.SEAHORSE;

        System.out.println(a.getNurcheringParent());
        switch (a) {
            case SEAHORSE:

                System.out.println("Animal a is a seahorse");

                break;

            case COW:
                System.out.println("Animal a is a cow");
        }

    }
}
