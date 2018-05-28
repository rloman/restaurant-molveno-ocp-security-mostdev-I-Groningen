package it.molveno.restaurant.generics.selfmade;

public class NumberBox <T  extends Number> extends Box <T> {


    @Override
    public void add(T t) {

        super.add(t);


        System.out.println(3 + t.doubleValue());
    }

}
