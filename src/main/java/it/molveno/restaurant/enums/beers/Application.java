package it.molveno.restaurant.enums.beers;

public class Application {

    public static void main(String[] args) {
        Beer jupiler = new Beer(BeerSize.SMALL);

        System.out.println(jupiler.getBeerSize());

        System.out.println(jupiler.getBeerSize().getSize());


        System.out.println(jupiler.getSize());


        for(BeerSize element: BeerSize.values()) {
            System.out.println("Element of BeerSize.values() "+element);
        }



        BeerSize beerSize = BeerSize.LARGE;

		//to get the index based value 
		int ordinalValue = beerSize.ordinal();
        System.out.println(ordinalValue);

    }
}
