package it.molveno.restaurant.summary.trees;

public class Tree {

    private Comparable value;

    private Tree left;
    private Tree right;

    public void add(Comparable insert) {
        if(value == null) {
            this.value = insert;
            left = new Tree();
            right = new Tree();
        }
        else {
            if(insert.compareTo(this.value) < 0) {
                left.add(insert);
            }
            else {
                right.add(insert);
            }
        }
    }

    public void pp() {
        if(left != null) {
            left.pp();
        }
        System.out.println(value);
        if(right != null) {
            right.pp();
        }
    }

    public int depth() {
        int depth = 1;
        if(left != null) {
            depth =  depth + left.depth();
        }
        if(right != null) {
            depth = depth + right.depth();
        }

        return depth;
    }
}
