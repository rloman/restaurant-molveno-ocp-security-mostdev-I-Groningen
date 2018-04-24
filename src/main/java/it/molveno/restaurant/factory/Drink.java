package it.molveno.restaurant.factory;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink {


    public static void main(String[] args) {
        Drink d = new Cola();
        d.getAppreciation();
    }

    private long id;

    private String name;
    private String description;
    private List<Ingredient> ingredients = new ArrayList<>();

    abstract int getAppreciation()  ;


}
class Cola extends Drink {

    @Override
    int getAppreciation() throws NumberFormatException {
        return 0;
    }
}


class MostDevException extends Exception {

}