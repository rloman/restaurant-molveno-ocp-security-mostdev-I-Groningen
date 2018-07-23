package it.molveno.restaurant.bakkerij;

import java.io.Serializable;

public class Bakker implements Runnable, Serializable {

    private  transient Voorraad voorraad = new Voorraad();

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