package it.molveno.restaurant.model;

public class Food {

    public Food(int price) {
        this.price = price;
    }


    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
