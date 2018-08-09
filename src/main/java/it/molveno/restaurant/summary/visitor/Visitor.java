package it.molveno.restaurant.summary.visitor;

public interface Visitor {

    void visit(Appel a);
    void visit(Peer p);
    void visit(Banaan b);

}
