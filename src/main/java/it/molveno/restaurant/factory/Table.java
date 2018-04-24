package it.molveno.restaurant.factory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@Builder
public final class Table {

    private  long id; // final for a field means you cannot change the value aferwards (after the constructors)
    private int numberOfSeats;
    private int tableNumber;

    private int price;
    private String owner;

    private List<LocalDateTime> reservationTimes = new ArrayList<>();


    private Table(TableBuilder builder) {

        this.id = builder.id;
        this.tableNumber = builder.tableNumber;
        this.numberOfSeats = builder.numberOfSeats;

    }

    public Table() {

         String tableName = "Tafel";
        tableName += " voor Poedels";

         int counter = 0;
        counter ++;
        this.id = 0;
    }

    public Table(int id) {
        this.id = id;
    }

    public Table(int tableNumber, int numberOfSeats) {
        this(0);
        this.numberOfSeats = numberOfSeats;
    }

    public static class TableBuilder {

        private int id;
        private int numberOfSeats;
        private int tableNumber;

        public TableBuilder(int id) {

            this.id = id;

        }

        public TableBuilder numberOfSeats(int seats) {
            this.numberOfSeats = seats;

            return this;
        }

        public TableBuilder tableNumber(int tableNumber) {
            this.tableNumber = tableNumber;

            return this;
        }

        public Table build() {
            return new Table(this);
        }

    }
}
