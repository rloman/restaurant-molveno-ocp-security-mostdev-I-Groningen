package it.molveno.restaurant.summary;

public class AbstractTrainer {

    public static void main(String[] args) {

        Scheidsrechter scheidsrechter = new Voetballertje();

    }
}


abstract class Player {
    public abstract void foo();
}

class Voetballertje extends Player implements Scheidsrechter {

    @Override // moet overriden als de class niet abstract is
    public void foo() {

    }

    @Override
    public void whistle() {
        System.out.println("whistling ...");
    }
}

interface Scheidsrechter {

    void whistle();

}