package it.molveno.restaurant.enums;

public enum Animal {

    HORSE(1500), COW(900), SEAHORSE(100) {

        @Override
        public SEXE getNurcheringParent() {
            return SEXE.MALE;
        }

    }, ELEPHANT(3500);


    private double weight;


    private Animal(double weight) {
        this.weight = weight;
    }


    public double getWeight() {
        return this.weight;
    }

    public SEXE getNurcheringParent() {
        return SEXE.FEMALE;
    }
}

enum SEXE {

    FEMALE, MALE
}