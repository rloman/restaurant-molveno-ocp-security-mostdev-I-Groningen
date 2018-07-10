package it.molveno.restaurant.threads.recursiveaction.exercise;

import java.util.concurrent.ForkJoinPool;

public class Application {

    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        commonPool.invoke(new CustomRecursiveActionRemainderOperatorExercise("0112358"));
    }
}
