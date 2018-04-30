package it.molveno.restaurant.enums.beers;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum BeerSize {

    SMALL(25), LARGE(50), MEDIUM(33);


    private int size;

    // must be private!!!
    private BeerSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}


@Entity
class BeerDrinker {


    @Enumerated(EnumType.STRING)
    private BeerSize beerSize;

}