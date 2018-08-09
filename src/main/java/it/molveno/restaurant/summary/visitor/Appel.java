package it.molveno.restaurant.summary.visitor;

public class Appel extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
