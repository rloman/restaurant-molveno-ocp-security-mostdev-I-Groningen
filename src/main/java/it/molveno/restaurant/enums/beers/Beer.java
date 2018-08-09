package it.molveno.restaurant.enums.beers;

public class Beer {

    private BeerSize beerSize;

    public Beer(BeerSize beerSize) {
        this.beerSize = beerSize;

    }

    public BeerSize getBeerSize() {
        return this.beerSize;
    }

    public int getSize() {
        return this.beerSize.getSize();
    }
}
