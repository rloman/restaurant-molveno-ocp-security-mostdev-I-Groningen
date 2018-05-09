package it.molveno.restaurant.functional;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private String name;

    private List<Food> foods = new ArrayList<>();

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food add(Food f) {
        this.foods.add(f);

        return this;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                (this.foods != null && !this.foods.isEmpty() ? (", foods=" + foods) : "" ) +
                '}';
    }
}
