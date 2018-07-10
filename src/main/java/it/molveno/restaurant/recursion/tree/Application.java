package it.molveno.restaurant.recursion.tree;

public class Application {

    public static void main(String[] args) {
        Tree firstTree = new Tree();

        firstTree.add(15);

        firstTree.add(4);

        firstTree.add(30);

        firstTree.inorder();

        firstTree.preorder();
        firstTree.postorder();
    }
}
