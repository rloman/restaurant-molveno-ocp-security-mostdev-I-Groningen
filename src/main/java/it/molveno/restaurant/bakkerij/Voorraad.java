package it.molveno.restaurant.bakkerij;

public class Voorraad {

    private int voorraad;

    public void inc() {
        int temp = this.voorraad;

        temp = temp +1;

        this.voorraad = temp;
    }

    public void dec() {

        int temp = this.voorraad;
        temp = temp -1;
        this.voorraad = temp;
    }

    public int getVoorraad() {
        return this.voorraad;
    }
}
