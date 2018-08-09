package it.molveno.restaurant.summary.trees;

public class TreeTrainerApp {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(3);

        tree.add(2);

        tree.add(-1);

        tree.pp();

        System.out.println(tree.depth());
    }
}
