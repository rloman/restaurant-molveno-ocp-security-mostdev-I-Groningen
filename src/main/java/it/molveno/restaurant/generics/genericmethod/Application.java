package it.molveno.restaurant.generics.genericmethod;

import it.molveno.restaurant.generics.selfmade.Box;

public class Application {

    public static void main(String[] args) {
        int feed = MagicBox.feedMe(3);

        String feedString = MagicBox.feedMe("Loman");

        Box b = MagicBox.feedMe(new Box());
    }
}
