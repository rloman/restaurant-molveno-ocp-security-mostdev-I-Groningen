package it.molveno.restaurant.bakkerij;

public class Bakker implements Runnable {

    private Voorraad voorraad;

    public Bakker(Voorraad voorraad) {
        this.voorraad = voorraad;
    }


    @Override
    public void run() {
        try {
            this.voorraad.inc();
            this.voorraad.inc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}