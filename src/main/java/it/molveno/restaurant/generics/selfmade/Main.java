package it.molveno.restaurant.generics.selfmade;

import it.molveno.restaurant.functional.Food;

public class Main {

    public static void main(String[] args) {
        Box<Food>  foodBox = new Box<>();

        foodBox.add(new Food("Gehaktbal"));
    }
}
