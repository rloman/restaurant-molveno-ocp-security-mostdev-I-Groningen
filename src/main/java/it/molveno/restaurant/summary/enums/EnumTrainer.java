package it.molveno.restaurant.summary.enums;

public class EnumTrainer {

    public static void main(String[] args) {

        Planet plutoIsWelEenPlaneet = Planet.PLUTO;

        System.out.println(plutoIsWelEenPlaneet.getWeight());

    }
}


enum Planet {

    MERCURIUS(3), VENUS(4), EARTH(5), MARS(6), JUPITER(7), SATURNUS(8), URANUS(9), NEPTUNUS(10), PLUTO(0);

    Planet(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    private final int weight;

}