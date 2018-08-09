package it.molveno.restaurant.recursion.reclist;

public class Application {

    public static void main(String[] args) {
        RecList list = new RecList();

        list.add(3);
        list.add("jansen");
        list.add("pietersen");

        list.pp();
    }
}
