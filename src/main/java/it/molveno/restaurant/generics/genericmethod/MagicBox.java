package it.molveno.restaurant.generics.genericmethod;

public final class MagicBox {

    public static <T> T feedMe(T t) {

        return t;
    }

    private MagicBox() {

    }
}
