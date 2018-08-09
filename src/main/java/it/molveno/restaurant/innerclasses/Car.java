package it.molveno.restaurant.innerclasses;

public class Car {


    private String licensePlate;

    private Engine engine;

    private int cc;
    private double mileAge;


    public void start() {
        this.engine.start();
    }


    private class Engine {

        private void start() {
            System.out.println("Engine starting ... ");

            Car.this.mileAge++; // rare syntax, maar volledig legaal

            class Bougie {

            }
        }

    }


    public void stop() {
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
    }

}

class MyRunner implements Runnable {

    @Override
    public void run() {

    }
}
