package it.molveno.restaurant.summary.innerstuff;

public class Tractor {

    private String name;
    private int cc;
    private String bougie;


    public static class TractorBuilder { // example of an static inner class (builder pattern)

        // builder pattern hier implementeren ...



    }
}


class Car {

    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }



    private class Engine {

    }

}

