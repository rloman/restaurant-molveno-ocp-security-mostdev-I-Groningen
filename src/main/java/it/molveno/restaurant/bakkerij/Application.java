package it.molveno.restaurant.bakkerij;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        final Voorraad voorraad = new Voorraad();
        // create 5 bakers and 5 consumers
        for(int i = 0;i<5;i++) {
            new Thread(new Bakker(voorraad)).start();
            new Thread(new Consumer(voorraad)).start();
        }

        // create 5 extra consumers
        for(int i = 0;i<5;i++) {
            new Thread(new Consumer(voorraad)).start();
        }

        Thread.sleep(5000);

        System.out.printf("Final value of voorraad: '%d'%n", voorraad.getVoorraad());
    }
}
