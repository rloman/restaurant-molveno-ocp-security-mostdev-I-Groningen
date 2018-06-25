package it.molveno.restaurant;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TrainPlannerApp {

    public static void main(String[] args) {
        NavigableSet<String> treinTijden = new TreeSet<>();

        treinTijden.add("1015");
        treinTijden.add("1030");

        String time = treinTijden.higher("1020");

        System.out.println(time);

        time = treinTijden.lower("1020");
        System.out.println(time);
    }
}
