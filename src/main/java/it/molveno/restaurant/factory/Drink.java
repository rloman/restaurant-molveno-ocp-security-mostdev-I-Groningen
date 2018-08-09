package it.molveno.restaurant.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink {

    private long id;

    private String name;
    private String description;
    private List<Ingredient> ingredients = new ArrayList<>();

    abstract int getAppreciation();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


}