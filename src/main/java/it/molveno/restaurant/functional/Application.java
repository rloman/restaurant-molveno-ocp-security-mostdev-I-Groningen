package it.molveno.restaurant.functional;


import java.util.Arrays;
import java.util.function.*;

public class Application {

    public static void main(String[] args) {

        Food one = new Food("BigMac"), two = new Food("Hamburger"), three = new Food("Bread");
        Cooker cooker = (n, m) -> {
            return n.add(m);
        };

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

        Cooker k = (n, m) -> n.add(m);

        Food createdFood = otherCook.cook(one, two);

        System.out.println(createdFood);


        BiFunction<Food, Food, Food> alternateSmarterCooker = (n, m) -> {

            return n.add(m);

        };

        Food alternateFood = alternateSmarterCooker.apply(one, two);

        System.out.println(alternateFood);


        //primitive function e.g. double here
        DoubleFunction<Food> foodPreProcessor = (temp) -> {
            return new Food(temp);
        };

        // trial with a constructor with pars
        DoubleFunction<Food> foodCreator = Food::new;
        Food f = foodCreator.apply(3.5);
        System.out.println(f.getTemperature());

        // unary
        UnaryOperator<Double> square = (d) -> d * d; // shorter syntax. if and only if you are having a single statement you might
        // replace it by only the statement and leave out the return statement and leave out the brackets;


        Function<String, Food> foodCreatorByName = Food::new;

        System.out.println(foodCreatorByName.apply("BeerTender"));
    }
}
