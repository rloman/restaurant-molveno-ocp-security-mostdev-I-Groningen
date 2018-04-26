package it.molveno.restaurant;

import it.molveno.restaurant.factory.DrinkFactory;
import it.molveno.restaurant.factory.Drink;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(RestaurantApplication.class, args);
//	}

	public static void main(String[] args) {
		Drink d = DrinkFactory.getCola();

		System.out.println(d.getDescription());

		Drink beer = DrinkFactory.getBeer();
	}
}
