package it.molveno.restaurant.bakkerij;

public class Bakker implements Runnable {

    private Voorraad voorraad;

    public Bakker(Voorraad voorraad) {
        this.voorraad = voorraad;
    }


    @Override
    public void run() {
        this.voorraad.inc();
        this.voorraad.inc();
    }
}