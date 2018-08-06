package it.molveno.restaurant.summary;

public class Application {

    public static final String COMPANYNAME= "Yacht";

    public static void main(String[] args) {

    }

    public static void finalTrainer() {

        final int AANTALSPELERSINHETVOETBALVELD = 22;


    }
}


/* final*/  class Voetballer { /// final class kan ik niet van erven

    public /*final*/  void play() { // final method cannot be overridden

    }

}

class JuniorVoetballer extends Voetballer {

    @Override
    public void play(){

    }

}