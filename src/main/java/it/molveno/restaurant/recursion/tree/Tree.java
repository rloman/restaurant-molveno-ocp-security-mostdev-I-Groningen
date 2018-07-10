package it.molveno.restaurant.recursion.tree;

public class Tree<T extends Comparable> {

    private T value;

    private Tree<T> left;
    private Tree<T> right;

    public void add(T n) {

        // value is still empty
        if (value == null) {
            value = n;
            this.left = new Tree();
            this.right = new Tree();
        }
        // value is not empty so put in correct subtree
        else {
            if (n.compareTo(this.value) < 0) {
                left.add(n);
            } else {
                right.add(n);
            }
        }
    }

    public void inorder() {
        if (value != null) {
            left.inorder();
            System.out.println(value);
            right.inorder();
        }
    }

    public void preorder() {
        if (value != null) {
            System.out.println(value);
            left.inorder();
            right.inorder();
        }
    }

    public void postorder() {
        if (value != null) {
            left.inorder();
            right.inorder();
            System.out.println(value);
        }
    }


}
