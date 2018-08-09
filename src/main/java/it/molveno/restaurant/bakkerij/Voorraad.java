package it.molveno.restaurant.bakkerij;

import java.util.concurrent.atomic.AtomicInteger;

public class Voorraad {

    private AtomicInteger voorraad = new AtomicInteger(0);

    public int inc() throws InterruptedException {

        return this.voorraad.incrementAndGet();
    }

    public int dec() throws InterruptedException {

        return this.voorraad.decrementAndGet();
    }

    public int getVoorraad() {
        return this.voorraad.get();
    }
}
