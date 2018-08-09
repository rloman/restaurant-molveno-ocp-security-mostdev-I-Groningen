package it.molveno.restaurant.recursion.reclist;

public class RecList {

    private Object head;

    private RecList tail;

    public void add(Object o) {

        if(head == null) {
            head = o;
            tail = new RecList();
        }
        else {
            tail.add(o);
        }
    }


    public void pp() {
        if(head != null) {
            System.out.println(head);
            tail.pp();
        }
    }
}
