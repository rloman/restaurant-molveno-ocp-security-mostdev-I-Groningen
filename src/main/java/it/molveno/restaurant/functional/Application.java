package it.molveno.restaurant.functional;


import java.util.function.BiFunction;

public class Application {

    public static void main(String[] args) {

        Food one = new Food("BigMac"), two = new Food("Hamburger"), three = new Food("Bread");
        Cooker cooker = (n, m) -> {return n.add(m);};

        Food result = cooker.cook(two, three);

        Food hamburger = cooker.cook(two, three);
        Food bigmac = cooker.cook(one, two);

        System.out.println(bigmac);


        Cooker otherCook = (n, m) -> {

            n.setTemperature(180);
            m.setTemperature(50);

            n.add(m);

            return n;

        };

        Cooker k = (n, m) ->  n.add(m);

        Food createdFood = otherCook.cook(one, two);

        System.out.println(createdFood);


        BiFunction<Food, Food, Food> alternateSmarterCooker = (n, m) -> {

            return n.add(m);

        };

        Food alternateFood = alternateSmarterCooker.apply(one, two);

        System.out.println(alternateFood);

    }
}
