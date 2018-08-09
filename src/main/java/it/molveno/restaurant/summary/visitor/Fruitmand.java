package it.molveno.restaurant.summary.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Fruitmand extends Fruit implements Iterable<Fruit> {

    private List<Fruit> content = new ArrayList<>();

    public /* synchronized*/ void add(Fruit f) {
        synchronized (content) {
            this.content.add(f);
        }
    }


    @Override
    public void accept(Visitor visitor) {
        System.out.println("<fruit>");
        for(Fruit f: this.content) {
           f.accept(visitor);
        }
        System.out.println("</fruit>");
    }

    @Override
    public Iterator<Fruit> iterator() {
        return this.content.iterator();
    }

    public Stream<Fruit> stream() {

        return this.content.stream();
    }
}
