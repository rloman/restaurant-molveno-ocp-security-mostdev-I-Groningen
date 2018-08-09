package it.molveno.restaurant.generics.genericcollections.model;

public abstract class Animal {


    private long id;

    public Animal() {
        this.id = Double.valueOf(Math.random()* 100).longValue();

//        this.id = (long) (Math.random() * 100);
    }



    public abstract void sound();

    @Override
    public String toString() {
        return "Animal with id: "+this.id;
    }
}
