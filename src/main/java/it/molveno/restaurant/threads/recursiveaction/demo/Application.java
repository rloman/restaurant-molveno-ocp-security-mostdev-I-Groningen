package it.molveno.restaurant.threads.recursiveaction.demo;

import java.util.concurrent.ForkJoinPool;

public class Application {

    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        commonPool.invoke(new CustomRecursiveActionString("Paashaasschaamhaarverzamelaar"));
    }
}
