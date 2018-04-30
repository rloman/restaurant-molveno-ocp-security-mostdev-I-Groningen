package it.molveno.restaurant.innerclasses;

public class Table {


    private String woodType;

    private double price;






    private class TableLeg {


        public void walk() {

            Table.this.price++;

        }

    }
}
