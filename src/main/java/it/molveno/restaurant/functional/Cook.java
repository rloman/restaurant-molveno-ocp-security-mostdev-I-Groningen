package it.molveno.restaurant.functional;

public class Cook {

    private Cooker cooker;

    public Cook(Cooker k) {
        this.cooker = k;
    }

    Food cook(Food one, Food second) {

        return this.cooker.add(one, second);
    }

}
