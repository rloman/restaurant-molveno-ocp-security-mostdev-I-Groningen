package it.molveno.restaurant.functionalwhy;

public class CookerApplication {

    public static void main(String[] args) {

        // now sending the Food his constructor to the bake method of Cooker ...
        // this is not an invoke of the constructor but sending it ...
        // again ... I am using the Food his constructor here as an 'Object'
        new Cooker().bake(Food::new);

        new Cooker().bake(() -> new Food("poedel"));

    }
}
