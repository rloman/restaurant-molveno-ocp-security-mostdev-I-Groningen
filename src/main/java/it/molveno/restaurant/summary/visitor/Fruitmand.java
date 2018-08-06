package it.molveno.restaurant.summary.visitor;

import java.util.ArrayList;
import java.util.List;

public class Fruitmand extends Fruit {

    private List<Fruit> content = new ArrayList<>();

    public void add(Fruit f) {
        this.content.add(f);
    }


    @Override
    public void accept(Visitor visitor) {
        for(Fruit f: this.content) {
           f.accept(visitor);
        }
    }
}
