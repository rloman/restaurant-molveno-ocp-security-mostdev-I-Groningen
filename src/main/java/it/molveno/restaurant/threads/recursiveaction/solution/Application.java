package it.molveno.restaurant.threads.recursiveaction.solution;

import java.util.concurrent.ForkJoinPool;

public class Application {

    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        commonPool.invoke(new CustomRecursiveActionRemainderOperator("0112358"));
    }
}