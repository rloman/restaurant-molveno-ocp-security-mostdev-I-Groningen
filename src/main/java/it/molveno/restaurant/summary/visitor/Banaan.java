package it.molveno.restaurant.summary.visitor;

public class Banaan extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
