package it.molveno.restaurant.factory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@Builder can be used if you use and like Lombok (which are hot ... in this case they are)
public final class Table {

    private long id; // final for a field means you cannot change the value aferwards (after the constructors)
    private int numberOfSeats;
    private int tableNumber;
    private int price;
    private String owner;

    private List<LocalDateTime> reservationTimes = new ArrayList<>();

    public void setId(long id) {
        this.id = id;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<LocalDateTime> getReservationTimes() {
        return reservationTimes;
    }

    public void setReservationTimes(List<LocalDateTime> reservationTimes) {
        this.reservationTimes = reservationTimes;
    }


    public long getId() {
        return id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    private Table(TableBuilder builder) {

        this.id = builder.id;
        this.tableNumber = builder.tableNumber;
        this.numberOfSeats = builder.numberOfSeats;

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
