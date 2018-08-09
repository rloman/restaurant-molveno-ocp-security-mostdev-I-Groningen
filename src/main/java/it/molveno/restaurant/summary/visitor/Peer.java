package it.molveno.restaurant.summary.visitor;

public class Peer extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
