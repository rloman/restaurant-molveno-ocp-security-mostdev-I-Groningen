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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return price == food.price;
    }

    @Override
    public int hashCode() {
        return price;
    }
}
