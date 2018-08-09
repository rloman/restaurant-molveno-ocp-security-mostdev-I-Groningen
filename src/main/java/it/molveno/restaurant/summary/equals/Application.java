package it.molveno.restaurant.summary.equals;

import it.molveno.restaurant.model.Food;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Food p = new Food(2);

        System.out.println(p); // toString() is invoked

        String label = ""+p; // toString() is invoked

        Food p2 = new Food(3);

        List<Food> foods = new LinkedList<>();

        foods.add(p);
        foods.add(p2);

        foods.remove(p); // equals is invoked and if true than p is removed

        System.out.println(foods);


    }
}
