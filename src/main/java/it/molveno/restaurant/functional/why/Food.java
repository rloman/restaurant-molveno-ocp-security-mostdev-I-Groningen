package it.molveno.restaurant.functional.why;

import lombok.Data;

@Data
public class Food {

    private String name;

    public Food() {
        this("unknown");
    }

    public Food(String name) {
        this.name = name;
    }
}
