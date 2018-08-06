package it.molveno.restaurant.summary.visitor;

public class VisitorDemoApp {

    public static void main(String[] args) {
        Fruitmand mand = new Fruitmand();

        Fruit appel = new Appel();
        Fruit peer = new Peer();
        Fruit banaan = new Banaan();

        mand.add(appel);
        mand.add(peer);
        mand.add(banaan);

        Visitor v = new CountingVisitor();

        mand.accept(v);

        System.out.println(v);

    }
}
