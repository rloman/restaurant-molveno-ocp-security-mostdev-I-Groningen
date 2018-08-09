package it.molveno.restaurant.summary.flatting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapSummary {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nathan", "Natalie", "Wesley", "Natasja", "Eloy");

        List<String>  moreNames = Arrays.asList("Jansen", "Van Putten", "Van Epscheuten");

        List<List<String>> listing = Arrays.asList(names, moreNames);

        System.out.println(listing);

        List<String> namesAgain = listing.stream()
                .flatMap(n -> n.stream())
                .collect(Collectors.toList());

        System.out.println(namesAgain);

        Collections.sort(names);

        System.out.println(names);

        Collections.sort(names, (n,m) ->  n.compareTo(m) * -1);

        System.out.println(names);
    }
}
